package flow

import "fmt"

type Execution struct {
	CBP_ID string
	IP_ID  string
	State  ExecutionState
}

func NewFlowExecution(CBP_ID string, IP_ID string) Execution {
	flowExecution := Execution{}
    flowExecution.CBP_ID = CBP_ID
    flowExecution.IP_ID = IP_ID
	flowExecution.State.ConstraintsFulfilled = true
	flowExecution.State.${startElementUniqueName}Active = true

	return flowExecution
}

func (fe *Execution) Execute(action string, actionArgsMap map[string]interface{}) (bool, error) {
	var retVal bool
    var err error

	switch action {
<#list elementIds as elementId>
    <#if elementTypeMap[elementId]?lower_case?contains("processstep")>
     case "${elementUniqueNameMap[elementId]}":
         retVal, err = fe.${elementUniqueNameMap[elementId]}Func(actionArgsMap)
    </#if>
</#list>
    default:
    	return false,  fmt.Errorf("Invalid Action Execution Attempted! No such action as: %s ", action)
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

func (fe *Execution) ${elementUniqueNameMap[elementId]}Func(actionArgsMap map[string]interface{}) (bool, error) {
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
        <#if capabilityMap[elementId]?has_content && capabilityMap[elementId].constraints?has_content> <#-- rukovanje capability constraints-ima -->
    fe.State.${elementUniqueNameMap[elementId]}Var.ElementExecutionCompleted = true
    fe.State.${elementUniqueNameMap[elementId]}Var.ElementConstraintsFulfilled = true
            <#list capabilityMap[elementId].constraints as constraint>
    fe.State.${elementUniqueNameMap[elementId]}Var.${constraint.physicalDimension} = actionArgsMap["${constraint.physicalDimension}"].(float64)
    if actionArgsMap["${constraint.physicalDimension}"].(float64) ${constraint.relationalOperator} ${constraint.value} {
        fe.State.${elementUniqueNameMap[elementId]}Var.${constraint.physicalDimension}Fulfilled = true
    } else {
        fe.State.${elementUniqueNameMap[elementId]}Var.${constraint.physicalDimension}Fulfilled = false
        fe.State.ConstraintsFulfilled = false
        fe.State.${elementUniqueNameMap[elementId]}Var.ElementConstraintsFulfilled = false
    }
            </#list>
        </#if>
        <#if inputProductsMap[elementId]?has_content> <#-- rukovanje input proizvodima -->
            <#list inputProductsMap[elementId] as product>
                <#if product.quantity == 1 >
    fe.State.${elementUniqueNameMap[elementId]}Var.${product.uniqueName}_ID = actionArgsMap["${product.uniqueName}_ID"].(string)
                <#else>
                    <#list 1..product.quantity as i>
    fe.State.${elementUniqueNameMap[elementId]}Var.${product.uniqueName}_ID_${i} = actionArgsMap["${product.uniqueName}_ID_${i}"].(string)
                    </#list>
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