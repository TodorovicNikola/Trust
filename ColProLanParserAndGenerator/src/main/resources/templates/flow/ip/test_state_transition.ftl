package flow

import (
	"testing"
)

func TestStateTransitions(t *testing.T) {
	type step struct {
		name          string
		initFn        func() Execution
		changeFn      func(*Execution) bool
		expectedState func(*testing.T, *Execution) bool
	}

	steps := []step{
<#list elementIds as elementId>
    <#if elementTypeMap[elementId]?lower_case?contains("processstep")>
     {
     	name: "${elementUniqueNameMap[elementId]}",
     	initFn: func() Execution {
     		flowExecution := Execution{}
			flowExecution.CBP_ID = "${elementUniqueNameMap[elementId]}_CBP_ID"
			flowExecution.IP_ID = "${elementUniqueNameMap[elementId]}_IP_ID"
			flowExecution.State.ConstraintsFulfilled = true

		<#list previousElementIdsMap[elementId] as previousElementId>
			flowExecution.State.${elementUniqueNameMap[previousElementId]}Active = true
        </#list>

			return flowExecution
     	},
     	changeFn: (*Execution).${elementUniqueNameMap[elementId]}ChangeActiveState,
     	expectedState: func(t *testing.T, fe *Execution) bool {
			t.Helper()
			t.Logf("=>Expecting the following state:" + 
		<#list previousElementIdsMap[elementId] as previousElementId>
        	<#if !elementTypeMap[previousElementId]?lower_case?contains("gate")>
    			"; fe.State.${elementUniqueNameMap[previousElementId]}Active = FALSE" +
    		</#if>
        </#list>
        <#if nextElementIdsMap[elementId]?has_content >
            <#list nextElementIdsMap[elementId] as nextElementId>
				"; fe.State.${elementUniqueNameMap[nextElementId]}Active = TRUE" +
            </#list>
        </#if>		
				"")
			return (
		<#list previousElementIdsMap[elementId] as previousElementId>
				!fe.State.${elementUniqueNameMap[previousElementId]}Active &&
        </#list>
        <#if nextElementIdsMap[elementId]?has_content >
            <#list nextElementIdsMap[elementId] as nextElementId>
				fe.State.${elementUniqueNameMap[nextElementId]}Active &&
                <#-- <#if elementTypeMap[nextElementId]?lower_case?contains("relationship")>
    			fe.${elementUniqueNameMap[nextElementIdsMap[nextElementIdsMap[nextElementId][0]][0]]}Active &&
    			</#if> -->
            </#list>
        <#else>
	 			fe.State.TerminationActivated &&
        </#if>
        		true)
		},
	},
	<#elseif elementTypeMap[elementId]?lower_case?contains("gate")>
	{
     	name: "${elementUniqueNameMap[elementId]}",
     	initFn: func() Execution {
     		flowExecution := Execution{}
			flowExecution.CBP_ID = "${elementUniqueNameMap[elementId]}_CBP_ID"
			flowExecution.IP_ID = "${elementUniqueNameMap[elementId]}_IP_ID"
			flowExecution.State.ConstraintsFulfilled = true

		<#list previousElementIdsMap[elementId] as previousElementId>
			<#if !elementTypeMap[previousElementId]?lower_case?contains("gate")>
				flowExecution.State.${elementUniqueNameMap[previousElementId]}Active = true
			</#if>
        </#list>

			return flowExecution
     	},
     	changeFn: (*Execution).${elementUniqueNameMap[elementId]}Func,
     	expectedState: func(t *testing.T, fe *Execution) bool {
     		t.Helper()
			t.Logf("=>Expecting the following state:" + 
		<#list previousElementIdsMap[elementId] as previousElementId>
        	<#if !elementTypeMap[previousElementId]?lower_case?contains("gate")>
    			"; fe.State.${elementUniqueNameMap[previousElementId]}Active = FALSE" +
    		</#if>
        </#list>
        <#if nextElementIdsMap[elementId]?has_content >
            <#list nextElementIdsMap[elementId] as nextElementId>
				"; fe.State.${elementUniqueNameMap[nextElementId]}Active = TRUE" +
            </#list>
        </#if>		
				"")
			return (
        <#list previousElementIdsMap[elementId] as previousElementId>
        	<#if !elementTypeMap[previousElementId]?lower_case?contains("gate")>
    			!fe.State.${elementUniqueNameMap[previousElementId]}Active &&
    		</#if>
        </#list>
        <#if nextElementIdsMap[elementId]?has_content >
            <#list nextElementIdsMap[elementId] as nextElementId>
				fe.State.${elementUniqueNameMap[nextElementId]}Active &&
            </#list>
        </#if>
        		true)
		},
	},
    </#if>
</#list>
	}

	for i, s := range steps {
		t.Run(s.name, func(t *testing.T) {
			f := s.initFn()
			ok := s.changeFn(&f)
			if !ok {
				t.Fatalf("transition %s failed at step %d", s.name, i)
			}

			if !s.expectedState(t, &f) {
				t.Fatalf("invalid state after transition %s", s.name)
			}
		})
	}
}