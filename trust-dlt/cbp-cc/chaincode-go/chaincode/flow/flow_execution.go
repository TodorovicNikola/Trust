package flow

import "fmt"

type Execution struct {
	ID    string
	State ExecutionState
}

func NewFlowExecution(ID string) Execution {
	flowExecution := Execution{}
	flowExecution.ID = ID
	flowExecution.State.ConstraintsFulfilled = true
	flowExecution.State.El_Start___51d2Active = true

	return flowExecution
}

func (fe *Execution) Execute(action string, actionArgsMap map[string]interface{}) error {
	var retVal bool

	switch action {
	case "El_End___2905":
		retVal = fe.El_End___2905Func(actionArgsMap)
	case "El_ProduceWoodenBox___b297":
		retVal = fe.El_ProduceWoodenBox___b297Func(actionArgsMap)
	case "El_Start___51d2":
		retVal = fe.El_Start___51d2Func(actionArgsMap)
	case "El_ShipFrontCover___1cce":
		retVal = fe.El_ShipFrontCover___1cceFunc(actionArgsMap)
	case "El_EngraveAcrylicFrontCov___9e43":
		retVal = fe.El_EngraveAcrylicFrontCov___9e43Func(actionArgsMap)
	case "El_ShipWoodenBox___b7c5":
		retVal = fe.El_ShipWoodenBox___b7c5Func(actionArgsMap)
	case "El_PackWineBottle___c394":
		retVal = fe.El_PackWineBottle___c394Func(actionArgsMap)
	default:
		return fmt.Errorf("Invalid Action Execution Attempted! No such action as: %s ", action)
	}

	if !retVal {
		return fmt.Errorf("Invalid Action Execution Attempted! State not adequate for action! State: %+v ", fe)
	}

	return nil
}

func (fe *Execution) El_End___2905Func(actionArgsMap map[string]interface{}) bool {
	if !fe.State.El_End___2905Active {
		return false
	}

	// previous elements <- false
	fe.State.El_End___2905Active = false

	fe.State.TerminationActivated = true

	return true

}

func (fe *Execution) El_ProduceWoodenBox___b297Func(actionArgsMap map[string]interface{}) bool {
	if !fe.State.El_ProduceWoodenBox___b297Active {
		return false
	}

	// previous elements <- false
	fe.State.El_ProduceWoodenBox___b297Active = false

	// next elements <- true
	fe.State.El_ShipWoodenBox___b7c5Active = true

	return true

}

func (fe *Execution) El_Start___51d2Func(actionArgsMap map[string]interface{}) bool {
	if !fe.State.El_Start___51d2Active {
		return false
	}

	// previous elements <- false
	fe.State.El_Start___51d2Active = false

	// next elements <- true
	fe.State.El_EngraveAcrylicFrontCov___9e43Active = true
	fe.State.El_ProduceWoodenBox___b297Active = true

	return true

}

// func (fe *Execution) El_Parallelism___e87aFunc() {
// 	if !fe.State.El_Parallelism___e87aActive {
// 		return
// 	}

// 	// previous elements <- false
// 	fe.State.El_Parallelism___e87aActive = false

// 	// next elements <- true
// 	fe.State.El_EngraveAcrylicFrontCov___9e43Active = true

// 	fe.State.El_ProduceWoodenBox___b297Active = true

// }

func (fe *Execution) El_Parallelism___f22bFunc() {
	if !fe.State.El_b7c5e47c_e036_49ea_831___d6efActive {
		return
	}
	if !fe.State.El_1cce97f4_4285_48f4_894___b339Active {
		return
	}

	// previous elements <- false
	fe.State.El_b7c5e47c_e036_49ea_831___d6efActive = false
	fe.State.El_1cce97f4_4285_48f4_894___b339Active = false

	// next elements <- true
	fe.State.El_PackWineBottle___c394Active = true

}

func (fe *Execution) El_ShipFrontCover___1cceFunc(actionArgsMap map[string]interface{}) bool {
	if !fe.State.El_ShipFrontCover___1cceActive {
		return false
	}

	// previous elements <- false
	fe.State.El_ShipFrontCover___1cceActive = false

	// next elements <- true
	fe.State.El_1cce97f4_4285_48f4_894___b339Active = true
	fe.El_Parallelism___f22bFunc()

	return true

}

func (fe *Execution) El_EngraveAcrylicFrontCov___9e43Func(actionArgsMap map[string]interface{}) bool {
	if !fe.State.El_EngraveAcrylicFrontCov___9e43Active {
		return false
	}

	// previous elements <- false
	fe.State.El_EngraveAcrylicFrontCov___9e43Active = false

	// next elements <- true
	fe.State.El_ShipFrontCover___1cceActive = true

	return true

}

func (fe *Execution) El_ShipWoodenBox___b7c5Func(actionArgsMap map[string]interface{}) bool {
	if !fe.State.El_ShipWoodenBox___b7c5Active {
		return false
	}

	// previous elements <- false
	fe.State.El_ShipWoodenBox___b7c5Active = false

	// next elements <- true
	fe.State.El_b7c5e47c_e036_49ea_831___d6efActive = true
	fe.El_Parallelism___f22bFunc()

	return true

}

func (fe *Execution) El_PackWineBottle___c394Func(actionArgsMap map[string]interface{}) bool {
	if !fe.State.El_PackWineBottle___c394Active {
		return false
	}

	// previous elements <- false
	fe.State.El_PackWineBottle___c394Active = false

	// next elements <- true
	fe.State.El_End___2905Active = true

	return true

}
