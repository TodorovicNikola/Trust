package flow

import (
	"testing"
	"math"
)

func TestLogicalConditionsBVA(t *testing.T) {
	type bva_test struct {
		name  string
		input float64
		expectedResult  bool
	}
	
	type step struct {
		name          string
		initFn        func() Execution
		validationFn  func(*Execution, float64) bool
		bva_tests     []bva_test
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
	     	bva_tests: []bva_test{
				{"Max Float", math.MaxFloat64, <#if constraint.relationalOperator==">="> true <#elseif constraint.relationalOperator==">" > true <#elseif constraint.relationalOperator=="<" > false <#elseif constraint.relationalOperator=="<=" > false <#elseif constraint.relationalOperator=="==" > false </#if>},
				{"Min Float", -math.MaxFloat64, <#if constraint.relationalOperator==">="> false <#elseif constraint.relationalOperator==">" > false <#elseif constraint.relationalOperator=="<" > true <#elseif constraint.relationalOperator=="<=" > true <#elseif constraint.relationalOperator=="==" > false </#if>},
				{"Boundary", ${constraint.value}, <#if constraint.relationalOperator==">="> true <#elseif constraint.relationalOperator==">" > false <#elseif constraint.relationalOperator=="<" > false <#elseif constraint.relationalOperator=="<=" > true <#elseif constraint.relationalOperator=="==" > true </#if>},
	     		<#if constraint.metricUnitObject?has_content>
		     	{"Boundary - ${constraint.metricUnitObject.smallestFragment}", ${constraint.value} - ${constraint.metricUnitObject.smallestFragment}, <#if constraint.relationalOperator==">="> false <#elseif constraint.relationalOperator==">" > false <#elseif constraint.relationalOperator=="<" > true <#elseif constraint.relationalOperator=="<=" > true <#elseif constraint.relationalOperator=="==" > false </#if>},
				{"Boundary + ${constraint.metricUnitObject.smallestFragment}", ${constraint.value} + ${constraint.metricUnitObject.smallestFragment}, <#if constraint.relationalOperator==">="> true <#elseif constraint.relationalOperator==">" > true <#elseif constraint.relationalOperator=="<" > false <#elseif constraint.relationalOperator=="<=" > false <#elseif constraint.relationalOperator=="==" > false </#if>},
				<#else>
				{"Boundary - 1.0", ${constraint.value} - 1.0, <#if constraint.relationalOperator==">="> false <#elseif constraint.relationalOperator==">" > false <#elseif constraint.relationalOperator=="<" > true <#elseif constraint.relationalOperator=="<=" > true <#elseif constraint.relationalOperator=="==" > false </#if>},
				{"Boundary + 1.0", ${constraint.value} + 1.0, <#if constraint.relationalOperator==">="> true <#elseif constraint.relationalOperator==">" > true <#elseif constraint.relationalOperator=="<" > false <#elseif constraint.relationalOperator=="<=" > false <#elseif constraint.relationalOperator=="==" > false </#if>},
				</#if>
	     	},
	     },
    	</#list>
    </#if>
</#list>
	}

	for _, s := range steps {
		for _, bvat := range s.bva_tests {
			f := s.initFn()
			t.Run(s.name, func(t *testing.T) {
				t.Logf("Running case '%s' - %s: Input=%f, Expecting=%t", s.name, bvat.name, bvat.input, bvat.expectedResult)
				result := s.validationFn(&f, bvat.input)
				if result != bvat.expectedResult {
					t.Fatalf("FAILED running case '%s' - %s: Input=%f, Expecting=%t", s.name, bvat.name, bvat.input, bvat.expectedResult)
				} else {
					t.Logf("Test PASSED successfully!")
				}
			})
		}

	}
}