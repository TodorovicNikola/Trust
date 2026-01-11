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
     	name: "El_b___fff2",
     	initFn: func() Execution {
     		flowExecution := Execution{}
			flowExecution.CBP_ID = "El_b___fff2_CBP_ID"
			flowExecution.IP_ID = "El_b___fff2_IP_ID"
			flowExecution.State.ConstraintsFulfilled = true

			flowExecution.State.El_b___fff2Active = true

			return flowExecution
     	},
     	changeFn: (*Execution).El_b___fff2ChangeActiveState,
     	expectedState: func(t *testing.T, fe *Execution) bool {
			t.Helper()
			t.Logf("=>Expecting the following state:" + 
    			"; fe.State.El_b___fff2Active = FALSE" +
				"; fe.State.El_fff25c35_4d03_421c_ad9___4dcdActive = TRUE" +
				"")
			return (
				!fe.State.El_b___fff2Active &&
				fe.State.El_fff25c35_4d03_421c_ad9___4dcdActive &&
        		true)
		},
	},
	{
     	name: "El_Parallelism___e37e",
     	initFn: func() Execution {
     		flowExecution := Execution{}
			flowExecution.CBP_ID = "El_Parallelism___e37e_CBP_ID"
			flowExecution.IP_ID = "El_Parallelism___e37e_IP_ID"
			flowExecution.State.ConstraintsFulfilled = true

				flowExecution.State.El_25517609_b073_4626_84f___0f38Active = true
				flowExecution.State.El_fff25c35_4d03_421c_ad9___4dcdActive = true

			return flowExecution
     	},
     	changeFn: (*Execution).El_Parallelism___e37eFunc,
     	expectedState: func(t *testing.T, fe *Execution) bool {
     		t.Helper()
			t.Logf("=>Expecting the following state:" + 
    			"; fe.State.El_25517609_b073_4626_84f___0f38Active = FALSE" +
    			"; fe.State.El_fff25c35_4d03_421c_ad9___4dcdActive = FALSE" +
				"; fe.State.El_c___1f35Active = TRUE" +
				"")
			return (
    			!fe.State.El_25517609_b073_4626_84f___0f38Active &&
    			!fe.State.El_fff25c35_4d03_421c_ad9___4dcdActive &&
				fe.State.El_c___1f35Active &&
        		true)
		},
	},
     {
     	name: "El_c___1f35",
     	initFn: func() Execution {
     		flowExecution := Execution{}
			flowExecution.CBP_ID = "El_c___1f35_CBP_ID"
			flowExecution.IP_ID = "El_c___1f35_IP_ID"
			flowExecution.State.ConstraintsFulfilled = true

			flowExecution.State.El_c___1f35Active = true

			return flowExecution
     	},
     	changeFn: (*Execution).El_c___1f35ChangeActiveState,
     	expectedState: func(t *testing.T, fe *Execution) bool {
			t.Helper()
			t.Logf("=>Expecting the following state:" + 
    			"; fe.State.El_c___1f35Active = FALSE" +
				"; fe.State.El_d___d331Active = TRUE" +
				"")
			return (
				!fe.State.El_c___1f35Active &&
				fe.State.El_d___d331Active &&
        		true)
		},
	},
     {
     	name: "El_a___2551",
     	initFn: func() Execution {
     		flowExecution := Execution{}
			flowExecution.CBP_ID = "El_a___2551_CBP_ID"
			flowExecution.IP_ID = "El_a___2551_IP_ID"
			flowExecution.State.ConstraintsFulfilled = true

			flowExecution.State.El_a___2551Active = true

			return flowExecution
     	},
     	changeFn: (*Execution).El_a___2551ChangeActiveState,
     	expectedState: func(t *testing.T, fe *Execution) bool {
			t.Helper()
			t.Logf("=>Expecting the following state:" + 
    			"; fe.State.El_a___2551Active = FALSE" +
				"; fe.State.El_25517609_b073_4626_84f___0f38Active = TRUE" +
				"")
			return (
				!fe.State.El_a___2551Active &&
				fe.State.El_25517609_b073_4626_84f___0f38Active &&
        		true)
		},
	},
     {
     	name: "El_d___d331",
     	initFn: func() Execution {
     		flowExecution := Execution{}
			flowExecution.CBP_ID = "El_d___d331_CBP_ID"
			flowExecution.IP_ID = "El_d___d331_IP_ID"
			flowExecution.State.ConstraintsFulfilled = true

			flowExecution.State.El_d___d331Active = true

			return flowExecution
     	},
     	changeFn: (*Execution).El_d___d331ChangeActiveState,
     	expectedState: func(t *testing.T, fe *Execution) bool {
			t.Helper()
			t.Logf("=>Expecting the following state:" + 
    			"; fe.State.El_d___d331Active = FALSE" +
				"; fe.State.El_e___e20bActive = TRUE" +
				"")
			return (
				!fe.State.El_d___d331Active &&
				fe.State.El_e___e20bActive &&
        		true)
		},
	},
     {
     	name: "El_Start___14ae",
     	initFn: func() Execution {
     		flowExecution := Execution{}
			flowExecution.CBP_ID = "El_Start___14ae_CBP_ID"
			flowExecution.IP_ID = "El_Start___14ae_IP_ID"
			flowExecution.State.ConstraintsFulfilled = true

			flowExecution.State.El_Start___14aeActive = true

			return flowExecution
     	},
     	changeFn: (*Execution).El_Start___14aeChangeActiveState,
     	expectedState: func(t *testing.T, fe *Execution) bool {
			t.Helper()
			t.Logf("=>Expecting the following state:" + 
    			"; fe.State.El_Start___14aeActive = FALSE" +
				"; fe.State.El_a___2551Active = TRUE" +
				"; fe.State.El_b___fff2Active = TRUE" +
				"")
			return (
				!fe.State.El_Start___14aeActive &&
				fe.State.El_a___2551Active &&
				fe.State.El_b___fff2Active &&
        		true)
		},
	},
     {
     	name: "El_End___b56b",
     	initFn: func() Execution {
     		flowExecution := Execution{}
			flowExecution.CBP_ID = "El_End___b56b_CBP_ID"
			flowExecution.IP_ID = "El_End___b56b_IP_ID"
			flowExecution.State.ConstraintsFulfilled = true

			flowExecution.State.El_End___b56bActive = true

			return flowExecution
     	},
     	changeFn: (*Execution).El_End___b56bChangeActiveState,
     	expectedState: func(t *testing.T, fe *Execution) bool {
			t.Helper()
			t.Logf("=>Expecting the following state:" + 
    			"; fe.State.El_End___b56bActive = FALSE" +
				"")
			return (
				!fe.State.El_End___b56bActive &&
	 			fe.State.TerminationActivated &&
        		true)
		},
	},
	{
     	name: "El_Parallelism___036d",
     	initFn: func() Execution {
     		flowExecution := Execution{}
			flowExecution.CBP_ID = "El_Parallelism___036d_CBP_ID"
			flowExecution.IP_ID = "El_Parallelism___036d_IP_ID"
			flowExecution.State.ConstraintsFulfilled = true


			return flowExecution
     	},
     	changeFn: (*Execution).El_Parallelism___036dFunc,
     	expectedState: func(t *testing.T, fe *Execution) bool {
     		t.Helper()
			t.Logf("=>Expecting the following state:" + 
				"; fe.State.El_a___2551Active = TRUE" +
				"; fe.State.El_b___fff2Active = TRUE" +
				"")
			return (
				fe.State.El_a___2551Active &&
				fe.State.El_b___fff2Active &&
        		true)
		},
	},
     {
     	name: "El_f___8235",
     	initFn: func() Execution {
     		flowExecution := Execution{}
			flowExecution.CBP_ID = "El_f___8235_CBP_ID"
			flowExecution.IP_ID = "El_f___8235_IP_ID"
			flowExecution.State.ConstraintsFulfilled = true

			flowExecution.State.El_f___8235Active = true

			return flowExecution
     	},
     	changeFn: (*Execution).El_f___8235ChangeActiveState,
     	expectedState: func(t *testing.T, fe *Execution) bool {
			t.Helper()
			t.Logf("=>Expecting the following state:" + 
    			"; fe.State.El_f___8235Active = FALSE" +
				"; fe.State.El_End___b56bActive = TRUE" +
				"")
			return (
				!fe.State.El_f___8235Active &&
				fe.State.El_End___b56bActive &&
        		true)
		},
	},
     {
     	name: "El_e___e20b",
     	initFn: func() Execution {
     		flowExecution := Execution{}
			flowExecution.CBP_ID = "El_e___e20b_CBP_ID"
			flowExecution.IP_ID = "El_e___e20b_IP_ID"
			flowExecution.State.ConstraintsFulfilled = true

			flowExecution.State.El_e___e20bActive = true

			return flowExecution
     	},
     	changeFn: (*Execution).El_e___e20bChangeActiveState,
     	expectedState: func(t *testing.T, fe *Execution) bool {
			t.Helper()
			t.Logf("=>Expecting the following state:" + 
    			"; fe.State.El_e___e20bActive = FALSE" +
				"; fe.State.El_f___8235Active = TRUE" +
				"")
			return (
				!fe.State.El_e___e20bActive &&
				fe.State.El_f___8235Active &&
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