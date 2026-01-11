package flow

import (
	"fmt"
	"time"
	"encoding/json"

	"github.com/hyperledger/fabric-contract-api-go/contractapi"
)

func isBeforeToday(dateStr string) (bool, error) {
	t, err := time.ParseInLocation("2006-01-02", dateStr, time.UTC)
	if err != nil {
		return false, err
	}

	todayUTC := time.Now().UTC().Truncate(24 * time.Hour)

	return t.Unix() < todayUTC.Unix(), nil
}

func getSuccessfulExecutionCountForRelatedIP(ctx contractapi.TransactionContextInterface, relatedIPName string, cbpId string, channel string) (CountDto, bool, error) {
	var methodName string = "GetSuccessfulFlowExecutionCount"
	params := []string{methodName, cbpId}
	queryArgs := make([][]byte, len(params))
	for i, arg := range params {
		queryArgs[i] = []byte(arg)
	}

	response := ctx.GetStub().InvokeChaincode(relatedIPName, queryArgs, channel)

	var countDto CountDto
	err := json.Unmarshal(response.Payload, &countDto)
	if err != nil {
		return CountDto{}, false, err
	}
	return countDto, false, nil
}

type Execution struct {
	ID    string
	State ExecutionState
}

func NewFlowExecution(ID string) Execution {
	flowExecution := Execution{}
	flowExecution.ID = ID
	flowExecution.State.ServicePropertiesFulfilled = true
	flowExecution.State.${startElementUniqueName}Active = true

	return flowExecution
}

func (fe *Execution) Execute(action string, actionArgsMap map[string]interface{}, ctx contractapi.TransactionContextInterface) (bool, error) {
	var retVal = true
	var err error

	switch action {
<#list elementIds as elementId>
    <#if elementTypeMap[elementId]?lower_case?contains("processstep")>
     case "${elementUniqueNameMap[elementId]}":
         retVal, err = fe.${elementUniqueNameMap[elementId]}Func(actionArgsMap, ctx)
    </#if>
</#list>
    default:
    	return false, fmt.Errorf("Invalid Action Execution Attempted! No such action as: %s ", action)
    }

	if err != nil {
		return false, err
	}

	if !retVal {
		return false, fmt.Errorf("Invalid Action Execution Attempted! State not adequate for action! State: %+v ", fe)
	}

	return true, nil
}

<#list elementIds as elementId>

    <#if elementTypeMap[elementId]?lower_case?contains("processstep")>

func (fe *Execution) ${elementUniqueNameMap[elementId]}ChangeActiveState() bool {
	if !fe.State.${elementUniqueNameMap[elementId]}Active {
		return false
	}

	// previous elements <- false
        <#list previousElementIdsMap[elementId] as previousElementId>
	fe.State.${elementUniqueNameMap[previousElementId]}Active = false
        </#list>

        <#if nextElementIdsMap[elementId]?has_content >
	// next elements <- true
            <#list nextElementIdsMap[elementId] as nextElementId>
	fe.State.${elementUniqueNameMap[nextElementId]}Active = true
                <#if elementTypeMap[nextElementId]?lower_case?contains("relationship")>
    fe.${elementUniqueNameMap[nextElementIdsMap[nextElementId][0]]}Func()
                </#if>
            </#list>
        <#else>
	fe.State.TerminationActivated = true
        </#if>

    return true
}

func (fe *Execution) ${elementUniqueNameMap[elementId]}_PerformPropertyValidation(actionArgsMap map[string]interface{}, ctx contractapi.TransactionContextInterface) (bool, error) {

        <#if contractualObligationMap[elementId]?has_content && contractualObligationMap[elementId].parameters?has_content> <#-- rukovanje contractual parameters-ima -->
    fe.State.${elementUniqueNameMap[elementId]}Var.ElementExecutionCompleted = true
    fe.State.${elementUniqueNameMap[elementId]}Var.ElementPropertiesFulfilled = true
            <#list contractualObligationMap[elementId].parameters as parameter>
                <#if parameter.key == 'P_Pieces' && relatedIPIdMap[elementId]?has_content>

	var relatedIPName string = "${relatedIPIdMap[elementId]}"
	var channel string = "mychannel"

	countDto, b, err := getSuccessfulExecutionCountForRelatedIP(ctx, relatedIPName, fe.ID, channel)
	if err != nil {
		return b, err
	}

    if countDto.Count < ${parameter.value} {
        fe.State.${elementUniqueNameMap[elementId]}Var.${parameter.key}Fulfilled = false
        fe.State.ServicePropertiesFulfilled = false
        fe.State.${elementUniqueNameMap[elementId]}Var.ElementPropertiesFulfilled = false
    } else {
        fe.State.${elementUniqueNameMap[elementId]}Var.${parameter.key}Fulfilled = true
    }
    fe.State.${elementUniqueNameMap[elementId]}Var.${parameter.key} = countDto.Count

                <#else>
					<#if parameter.key == 'P_Deadline'>
    fe.State.${elementUniqueNameMap[elementId]}Var.${parameter.key} = actionArgsMap["${parameter.key}"].(string)
    
    retVal, _ := isBeforeToday(actionArgsMap["${parameter.key}"].(string))
    if retVal {
        fe.State.${elementUniqueNameMap[elementId]}Var.${parameter.key}Fulfilled = true
    } else {
        fe.State.${elementUniqueNameMap[elementId]}Var.${parameter.key}Fulfilled = false
        fe.State.ServicePropertiesFulfilled = false
        fe.State.${elementUniqueNameMap[elementId]}Var.ElementPropertiesFulfilled = false

    }
					</#if>
                </#if>
            </#list>
        </#if>
	return true, nil
}

func (fe *Execution) ${elementUniqueNameMap[elementId]}Func(actionArgsMap map[string]interface{}, ctx contractapi.TransactionContextInterface) (bool, error) {
	stateChangeSuccessful := fe.${elementUniqueNameMap[elementId]}ChangeActiveState()

	if !stateChangeSuccessful {
		return false, nil
	}

	fe.${elementUniqueNameMap[elementId]}_PerformPropertyValidation(actionArgsMap, ctx)

	return true, nil

}
    <#elseif elementTypeMap[elementId]?lower_case?contains("gate")>
func (fe *Execution) ${elementUniqueNameMap[elementId]}Func() bool {
        <#list previousElementIdsMap[elementId] as previousElementId>
        	<#if !elementTypeMap[previousElementId]?lower_case?contains("gate")>
    if !fe.State.${elementUniqueNameMap[previousElementId]}Active {
        return false
    }
    		</#if>
        </#list>

    // previous elements <- false
        <#list previousElementIdsMap[elementId] as previousElementId>
        	<#if !elementTypeMap[previousElementId]?lower_case?contains("gate")>
    fe.State.${elementUniqueNameMap[previousElementId]}Active = false
    		</#if>
        </#list>

        // next elements <- true
        <#list nextElementIdsMap[elementId] as nextElementId>
    fe.State.${elementUniqueNameMap[nextElementId]}Active = true

            <#if elementTypeMap[nextElementId]?lower_case?contains("relationship")>
    fe.${elementUniqueNameMap[nextElementIdsMap[nextElementId][0]]}Func()
            </#if>
        </#list>
    return true
}
    </#if>
</#list>