package flow

// ExecutionState struct
type ExecutionState struct {
<#list elementIds as elementId>
    <#if !elementTypeMap[elementId]?lower_case?contains("gate")>
    ${elementUniqueNameMap[elementId]}Active bool
    </#if>
    <#if capabilityMap[elementId]?has_content && capabilityMap[elementId].constraints?has_content>
    ${elementUniqueNameMap[elementId]}Var ${elementUniqueNameMap[elementId]}Struct
    </#if>

</#list>

	TerminationActivated bool
	ConstraintsFulfilled bool
}

<#list elementIds as elementId>
    <#if capabilityMap[elementId]?has_content && capabilityMap[elementId].constraints?has_content>

type ${elementUniqueNameMap[elementId]}Struct struct {
            <#list capabilityMap[elementId].constraints as constraint>
    ${constraint.physicalDimension} float64
    ${constraint.physicalDimension}Fulfilled bool
            </#list>
            <#list inputProductsMap[elementId] as product>
                <#if product.quantity == 1 >
    ${product.uniqueName}_ID string
                <#else>
                    <#list 1..product.quantity as i>
    ${product.uniqueName}_ID_${i} string
                    </#list>
                </#if>
            </#list>
}

    </#if>
</#list>