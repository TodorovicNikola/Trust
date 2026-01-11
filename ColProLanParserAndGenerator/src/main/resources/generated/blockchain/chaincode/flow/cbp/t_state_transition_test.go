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
     {
     	name: "El_Start___ee01",
     	initFn: func() Execution {
     		flowExecution := Execution{}
			flowExecution.ID = "El_Start___ee01_ID"
			flowExecution.State.ServicePropertiesFulfilled = true

			flowExecution.State.El_Start___ee01Active = true

			return flowExecution
     	},
     	changeFn: (*Execution).El_Start___ee01ChangeActiveState,
     	expectedState: func(t *testing.T, fe *Execution) bool {
			t.Helper()
			t.Logf("=>Expecting the following state:" + 
    			"; fe.State.El_Start___ee01Active = FALSE" +
				"; fe.State.El_a___2965Active = TRUE" +
				"; fe.State.El_b___1b86Active = TRUE" +
				"")
			return (
				!fe.State.El_Start___ee01Active &&
				fe.State.El_a___2965Active &&
				fe.State.El_b___1b86Active &&
        		true)
		},
	},
     {
     	name: "El_e___63ad",
     	initFn: func() Execution {
     		flowExecution := Execution{}
			flowExecution.ID = "El_e___63ad_ID"
			flowExecution.State.ServicePropertiesFulfilled = true

			flowExecution.State.El_e___63adActive = true

			return flowExecution
     	},
     	changeFn: (*Execution).El_e___63adChangeActiveState,
     	expectedState: func(t *testing.T, fe *Execution) bool {
			t.Helper()
			t.Logf("=>Expecting the following state:" + 
    			"; fe.State.El_e___63adActive = FALSE" +
				"; fe.State.El_End___e153Active = TRUE" +
				"")
			return (
				!fe.State.El_e___63adActive &&
				fe.State.El_End___e153Active &&
        		true)
		},
	},
     {
     	name: "El_End___e153",
     	initFn: func() Execution {
     		flowExecution := Execution{}
			flowExecution.ID = "El_End___e153_ID"
			flowExecution.State.ServicePropertiesFulfilled = true

			flowExecution.State.El_End___e153Active = true

			return flowExecution
     	},
     	changeFn: (*Execution).El_End___e153ChangeActiveState,
     	expectedState: func(t *testing.T, fe *Execution) bool {
			t.Helper()
			t.Logf("=>Expecting the following state:" + 
    			"; fe.State.El_End___e153Active = FALSE" +
				"")
			return (
				!fe.State.El_End___e153Active &&
	 			fe.State.TerminationActivated &&
        		true)
		},
	},
     {
     	name: "El_d___af32",
     	initFn: func() Execution {
     		flowExecution := Execution{}
			flowExecution.ID = "El_d___af32_ID"
			flowExecution.State.ServicePropertiesFulfilled = true

			flowExecution.State.El_d___af32Active = true

			return flowExecution
     	},
     	changeFn: (*Execution).El_d___af32ChangeActiveState,
     	expectedState: func(t *testing.T, fe *Execution) bool {
			t.Helper()
			t.Logf("=>Expecting the following state:" + 
    			"; fe.State.El_d___af32Active = FALSE" +
				"; fe.State.El_af3237e6_e858_44ed_9fc___39dfActive = TRUE" +
				"")
			return (
				!fe.State.El_d___af32Active &&
				fe.State.El_af3237e6_e858_44ed_9fc___39dfActive &&
        		true)
		},
	},
     {
     	name: "El_c___cacc",
     	initFn: func() Execution {
     		flowExecution := Execution{}
			flowExecution.ID = "El_c___cacc_ID"
			flowExecution.State.ServicePropertiesFulfilled = true

			flowExecution.State.El_c___caccActive = true

			return flowExecution
     	},
     	changeFn: (*Execution).El_c___caccChangeActiveState,
     	expectedState: func(t *testing.T, fe *Execution) bool {
			t.Helper()
			t.Logf("=>Expecting the following state:" + 
    			"; fe.State.El_c___caccActive = FALSE" +
				"; fe.State.El_caccd44f_0668_4aff_985___58e5Active = TRUE" +
				"")
			return (
				!fe.State.El_c___caccActive &&
				fe.State.El_caccd44f_0668_4aff_985___58e5Active &&
        		true)
		},
	},
     {
     	name: "El_b___1b86",
     	initFn: func() Execution {
     		flowExecution := Execution{}
			flowExecution.ID = "El_b___1b86_ID"
			flowExecution.State.ServicePropertiesFulfilled = true

			flowExecution.State.El_b___1b86Active = true

			return flowExecution
     	},
     	changeFn: (*Execution).El_b___1b86ChangeActiveState,
     	expectedState: func(t *testing.T, fe *Execution) bool {
			t.Helper()
			t.Logf("=>Expecting the following state:" + 
    			"; fe.State.El_b___1b86Active = FALSE" +
				"; fe.State.El_d___af32Active = TRUE" +
				"")
			return (
				!fe.State.El_b___1b86Active &&
				fe.State.El_d___af32Active &&
        		true)
		},
	},
     {
     	name: "El_a___2965",
     	initFn: func() Execution {
     		flowExecution := Execution{}
			flowExecution.ID = "El_a___2965_ID"
			flowExecution.State.ServicePropertiesFulfilled = true

			flowExecution.State.El_a___2965Active = true

			return flowExecution
     	},
     	changeFn: (*Execution).El_a___2965ChangeActiveState,
     	expectedState: func(t *testing.T, fe *Execution) bool {
			t.Helper()
			t.Logf("=>Expecting the following state:" + 
    			"; fe.State.El_a___2965Active = FALSE" +
				"; fe.State.El_c___caccActive = TRUE" +
				"")
			return (
				!fe.State.El_a___2965Active &&
				fe.State.El_c___caccActive &&
        		true)
		},
	},
	{
     	name: "El_Parallelism___be81",
     	initFn: func() Execution {
     		flowExecution := Execution{}
			flowExecution.ID = "El_Parallelism___be81_ID"
			flowExecution.State.ServicePropertiesFulfilled = true


			return flowExecution
     	},
     	changeFn: (*Execution).El_Parallelism___be81Func,
     	expectedState: func(t *testing.T, fe *Execution) bool {
     		t.Helper()
			t.Logf("=>Expecting the following state:" + 
				"; fe.State.El_a___2965Active = TRUE" +
				"; fe.State.El_b___1b86Active = TRUE" +
				"")
			return (
				fe.State.El_a___2965Active &&
				fe.State.El_b___1b86Active &&
        		true)
		},
	},
	{
     	name: "El_Parallelism___472c",
     	initFn: func() Execution {
     		flowExecution := Execution{}
			flowExecution.ID = "El_Parallelism___472c_ID"
			flowExecution.State.ServicePropertiesFulfilled = true

				flowExecution.State.El_caccd44f_0668_4aff_985___58e5Active = true
				flowExecution.State.El_af3237e6_e858_44ed_9fc___39dfActive = true

			return flowExecution
     	},
     	changeFn: (*Execution).El_Parallelism___472cFunc,
     	expectedState: func(t *testing.T, fe *Execution) bool {
     		t.Helper()
			t.Logf("=>Expecting the following state:" + 
    			"; fe.State.El_caccd44f_0668_4aff_985___58e5Active = FALSE" +
    			"; fe.State.El_af3237e6_e858_44ed_9fc___39dfActive = FALSE" +
				"; fe.State.El_e___63adActive = TRUE" +
				"")
			return (
    			!fe.State.El_caccd44f_0668_4aff_985___58e5Active &&
    			!fe.State.El_af3237e6_e858_44ed_9fc___39dfActive &&
				fe.State.El_e___63adActive &&
        		true)
		},
	},
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