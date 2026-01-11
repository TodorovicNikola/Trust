package flow

// ExecutionState struct
type ExecutionState struct {
<#list elementIds as elementId>
    <#if !elementTypeMap[elementId]?lower_case?contains("gate")>
    ${elementUniqueNameMap[elementId]}Active bool
    </#if>
    <#if contractualObligationMap[elementId]?has_content && contractualObligationMap[elementId].parameters?has_content>
    ${elementUniqueNameMap[elementId]}Var ${elementUniqueNameMap[elementId]}Struct
    </#if>

</#list>

	TerminationActivated bool
	ServicePropertiesFulfilled bool
}

<#list elementIds as elementId>
    <#if contractualObligationMap[elementId]?has_content && contractualObligationMap[elementId].parameters?has_content>

type ${elementUniqueNameMap[elementId]}Struct struct {
    ElementExecutionCompleted bool
    ElementPropertiesFulfilled bool
            <#list contractualObligationMap[elementId].parameters as parameter>
    			<#if parameter.key == 'P_Deadline'>
	${parameter.key} string   			
                <#else>
    ${parameter.key} float64    			
    			</#if>

    ${parameter.key}Fulfilled bool
            </#list>
}

    </#if>
</#list>

type CountDto struct {
	CBP_ID string `json:"CBP_ID"`
	Count  float64    `json:"Count"`
}