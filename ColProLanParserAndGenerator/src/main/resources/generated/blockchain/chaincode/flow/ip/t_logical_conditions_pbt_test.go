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
    	{
	     	name: "C_t_max",
	     	initFn: func() Execution {
	     		flowExecution := Execution{}
				flowExecution.CBP_ID = "El_a___2551_CBP_ID"
				flowExecution.IP_ID = "El_a___2551_IP_ID"
				flowExecution.State.ConstraintsFulfilled = true
	
				return flowExecution
	     	},
	     	validationFn: (*Execution).El_a___2551__ValidateC_t_max_lteFunc,
	     	logicalConditionFn: func(val float64) bool {
	     		if val <= 1 {
					return true
				} else {
					return false
				}
	     	},
	     },
    	{
	     	name: "C_HeightUSL",
	     	initFn: func() Execution {
	     		flowExecution := Execution{}
				flowExecution.CBP_ID = "El_e___e20b_CBP_ID"
				flowExecution.IP_ID = "El_e___e20b_IP_ID"
				flowExecution.State.ConstraintsFulfilled = true
	
				return flowExecution
	     	},
	     	validationFn: (*Execution).El_e___e20b__ValidateC_HeightUSL_lteFunc,
	     	logicalConditionFn: func(val float64) bool {
	     		if val <= 0.365 {
					return true
				} else {
					return false
				}
	     	},
	     },
    	{
	     	name: "C_HeightLSL",
	     	initFn: func() Execution {
	     		flowExecution := Execution{}
				flowExecution.CBP_ID = "El_e___e20b_CBP_ID"
				flowExecution.IP_ID = "El_e___e20b_IP_ID"
				flowExecution.State.ConstraintsFulfilled = true
	
				return flowExecution
	     	},
	     	validationFn: (*Execution).El_e___e20b__ValidateC_HeightLSL_gteFunc,
	     	logicalConditionFn: func(val float64) bool {
	     		if val >= 0.355 {
					return true
				} else {
					return false
				}
	     	},
	     },
    	{
	     	name: "C_WidthUSL",
	     	initFn: func() Execution {
	     		flowExecution := Execution{}
				flowExecution.CBP_ID = "El_e___e20b_CBP_ID"
				flowExecution.IP_ID = "El_e___e20b_IP_ID"
				flowExecution.State.ConstraintsFulfilled = true
	
				return flowExecution
	     	},
	     	validationFn: (*Execution).El_e___e20b__ValidateC_WidthUSL_lteFunc,
	     	logicalConditionFn: func(val float64) bool {
	     		if val <= 0.365 {
					return true
				} else {
					return false
				}
	     	},
	     },
    	{
	     	name: "C_DepthLSL",
	     	initFn: func() Execution {
	     		flowExecution := Execution{}
				flowExecution.CBP_ID = "El_e___e20b_CBP_ID"
				flowExecution.IP_ID = "El_e___e20b_IP_ID"
				flowExecution.State.ConstraintsFulfilled = true
	
				return flowExecution
	     	},
	     	validationFn: (*Execution).El_e___e20b__ValidateC_DepthLSL_gteFunc,
	     	logicalConditionFn: func(val float64) bool {
	     		if val >= 0.145 {
					return true
				} else {
					return false
				}
	     	},
	     },
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