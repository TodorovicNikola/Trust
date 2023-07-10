package flow

import (
	"fmt"
	"encoding/json"

	"github.com/hyperledger/fabric-contract-api-go/contractapi"
)

type Execution struct {
	ID    string
	State ExecutionState
}

func NewFlowExecution(ID string) Execution {
	flowExecution := Execution{}
	flowExecution.ID = ID
	flowExecution.State.ConstraintsFulfilled = true
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

func (fe *Execution) ${elementUniqueNameMap[elementId]}Func(actionArgsMap map[string]interface{}, ctx contractapi.TransactionContextInterface) (bool, error) {
	if !fe.State.${elementUniqueNameMap[elementId]}Active {
		return false, nil
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
        <#if contractualObligationMap[elementId]?has_content && contractualObligationMap[elementId].constraints?has_content> <#-- rukovanje contractual constraints-ima -->
    fe.State.${elementUniqueNameMap[elementId]}Var.ElementExecutionCompleted = true
    fe.State.${elementUniqueNameMap[elementId]}Var.ElementConstraintsFulfilled = true
            <#list contractualObligationMap[elementId].constraints as constraint>
                <#if constraint.physicalDimension == 'C_Pieces' && relatedIPIdMap[elementId]?has_content>

    params := []string{"GetSuccessfulFlowExecutionCount", fe.ID}
    queryArgs := make([][]byte, len(params))
    for i, arg := range params {
        queryArgs[i] = []byte(arg)
    }

    response := ctx.GetStub().InvokeChaincode("${relatedIPIdMap[elementId]}", queryArgs, "mychannel")  // zbog ovoga ti treba ID IP-a, da znas koji CC treba da se invokuje...

    var countDto CountDto
    err := json.Unmarshal(response.Payload, &countDto)
    if err != nil {
        return false, err
    }

    if countDto.Count < ${constraint.value} {
        fe.State.${elementUniqueNameMap[elementId]}Var.${constraint.physicalDimension}Fulfilled = false
        fe.State.ConstraintsFulfilled = false
        fe.State.${elementUniqueNameMap[elementId]}Var.ElementConstraintsFulfilled = false
    } else {
        fe.State.${elementUniqueNameMap[elementId]}Var.${constraint.physicalDimension}Fulfilled = true
    }
    fe.State.${elementUniqueNameMap[elementId]}Var.${constraint.physicalDimension} = countDto.Count

                <#else>
    fe.State.${elementUniqueNameMap[elementId]}Var.${constraint.physicalDimension} = actionArgsMap["${constraint.physicalDimension}"].(float64)
    if actionArgsMap["${constraint.physicalDimension}"].(float64) ${constraint.relationalOperator} ${constraint.value} {
        fe.State.${elementUniqueNameMap[elementId]}Var.${constraint.physicalDimension}Fulfilled = true
    } else {
        fe.State.${elementUniqueNameMap[elementId]}Var.${constraint.physicalDimension}Fulfilled = false
        fe.State.ConstraintsFulfilled = false
        fe.State.${elementUniqueNameMap[elementId]}Var.ElementConstraintsFulfilled = false

    }
    fe.State.${elementUniqueNameMap[elementId]}Var.${constraint.physicalDimension} = actionArgsMap["${constraint.physicalDimension}"].(float64)

                </#if>
            </#list>
        </#if>

	return true, nil

}
    <#elseif elementTypeMap[elementId]?lower_case?contains("gate")>
func (fe *Execution) ${elementUniqueNameMap[elementId]}Func() {
        <#list previousElementIdsMap[elementId] as previousElementId>
    if !fe.State.${elementUniqueNameMap[previousElementId]}Active {
        return
    }
        </#list>

    // previous elements <- false
        <#list previousElementIdsMap[elementId] as previousElementId>
    fe.State.${elementUniqueNameMap[previousElementId]}Active = false
        </#list>

        // next elements <- true
        <#list nextElementIdsMap[elementId] as nextElementId>
    fe.State.${elementUniqueNameMap[nextElementId]}Active = true

            <#if elementTypeMap[nextElementId]?lower_case?contains("relationship")>
    fe.${elementUniqueNameMap[nextElementIdsMap[nextElementId][0]]}Func()
            </#if>
        </#list>
}
    </#if>
</#list>