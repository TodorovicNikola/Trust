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
	     	bva_tests: []bva_test{
				{"Max Float", math.MaxFloat64,  false },
				{"Min Float", -math.MaxFloat64,  true },
				{"Boundary", 1,  true },
				{"Boundary - 1.0", 1 - 1.0,  true },
				{"Boundary + 1.0", 1 + 1.0,  false },
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
	     	bva_tests: []bva_test{
				{"Max Float", math.MaxFloat64,  false },
				{"Min Float", -math.MaxFloat64,  true },
				{"Boundary", 0.365,  true },
		     	{"Boundary - 0.001", 0.365 - 0.001,  true },
				{"Boundary + 0.001", 0.365 + 0.001,  false },
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
	     	bva_tests: []bva_test{
				{"Max Float", math.MaxFloat64,  true },
				{"Min Float", -math.MaxFloat64,  false },
				{"Boundary", 0.355,  true },
		     	{"Boundary - 0.001", 0.355 - 0.001,  false },
				{"Boundary + 0.001", 0.355 + 0.001,  true },
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
	     	bva_tests: []bva_test{
				{"Max Float", math.MaxFloat64,  false },
				{"Min Float", -math.MaxFloat64,  true },
				{"Boundary", 0.365,  true },
		     	{"Boundary - 0.001", 0.365 - 0.001,  true },
				{"Boundary + 0.001", 0.365 + 0.001,  false },
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
	     	bva_tests: []bva_test{
				{"Max Float", math.MaxFloat64,  true },
				{"Min Float", -math.MaxFloat64,  false },
				{"Boundary", 0.145,  true },
		     	{"Boundary - 0.001", 0.145 - 0.001,  false },
				{"Boundary + 0.001", 0.145 + 0.001,  true },
	     	},
	     },
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