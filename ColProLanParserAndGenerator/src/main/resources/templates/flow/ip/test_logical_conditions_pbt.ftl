package flow

import (
	"testing"

	"github.com/leanovate/gopter"
	"github.com/leanovate/gopter/gen"
	"github.com/leanovate/gopter/prop"
)

func TestLogicalConditionsPBT(t *testing.T) {
	parameters := gopter.DefaultTestParameters()
	properties := gopter.NewProperties(parameters)
	
	type step struct {
		name               string
		initFn             func() Execution
		validationFn       func(*Execution, float64) bool
		logicalConditionFn func(float64) bool
	}
	
	steps := []step{
<#list elementIds as elementId>
    <#if elementTypeMap[elementId]?lower_case?contains("processstep") && capabilityMap[elementId]?has_content && capabilityMap[elementId].constraints?has_content>
    	<#list capabilityMap[elementId].constraints as constraint>
    	{
	     	name: "${constraint.physicalDimension}",
	     	initFn: func() Execution {
	     		flowExecution := Execution{}
				flowExecution.CBP_ID = "${elementUniqueNameMap[elementId]}_CBP_ID"
				flowExecution.IP_ID = "${elementUniqueNameMap[elementId]}_IP_ID"
				flowExecution.State.ConstraintsFulfilled = true
	
				return flowExecution
	     	},
	     	validationFn: (*Execution).${elementUniqueNameMap[elementId]}__Validate${constraint.uniqueName}Func,
	     	logicalConditionFn: func(val float64) bool {
	     		if val ${constraint.relationalOperator} ${constraint.value} {
					return true
				} else {
					return false
				}
	     	},
	     },
    	</#list>
    </#if>
</#list>
	}

	for _, s := range steps {
		f := s.initFn()
		properties.Property("value correctness", prop.ForAll(
			func(x float64) bool {
				return s.validationFn(&f, x) == s.logicalConditionFn(x)
			},
			gen.Float64(),
		))
	
		properties.TestingRun(t)
	}
}