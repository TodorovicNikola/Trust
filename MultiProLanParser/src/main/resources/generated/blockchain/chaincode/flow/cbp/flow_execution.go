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
	flowExecution.State.El_Start___aa98Active = true

	return flowExecution
}

func (fe *Execution) Execute(action string, actionArgsMap map[string]interface{}) error {
	var retVal bool

	switch action {
     case "El_ShipFrontCover___6cc0":
         retVal = fe.El_ShipFrontCover___6cc0Func(actionArgsMap)
     case "El_ProduceWoodenBox___665b":
         retVal = fe.El_ProduceWoodenBox___665bFunc(actionArgsMap)
     case "El_PackWineBottle___e71b":
         retVal = fe.El_PackWineBottle___e71bFunc(actionArgsMap)
     case "El_End___696a":
         retVal = fe.El_End___696aFunc(actionArgsMap)
     case "El_Start___aa98":
         retVal = fe.El_Start___aa98Func(actionArgsMap)
     case "El_EngraveAcrylicFrontCov___418f":
         retVal = fe.El_EngraveAcrylicFrontCov___418fFunc(actionArgsMap)
     case "El_ShipWoodenBox___9607":
         retVal = fe.El_ShipWoodenBox___9607Func(actionArgsMap)
    default:
    	return fmt.Errorf("Invalid Action Execution Attempted! No such action as: %s ", action)
    }

	if !retVal {
		return fmt.Errorf("Invalid Action Execution Attempted! State not adequate for action! State: %+v ", fe)
	}

	return nil
}



func (fe *Execution) El_ShipFrontCover___6cc0Func(actionArgsMap map[string]interface{}) bool {
	if !fe.State.El_ShipFrontCover___6cc0Active {
		return false
	}

	// previous elements <- false
	fe.State.El_ShipFrontCover___6cc0Active = false

	// next elements <- true
	fe.State.El_6cc01341_3547_459c_aa0___2ad6Active = true
    fe.El_Parallelism___dbd4Func()
         

    fe.State.El_ShipFrontCover___6cc0Var.C_Pieces = actionArgsMap["C_Pieces"].(float64)
    if actionArgsMap["C_Pieces"].(float64) == 5 {
        fe.State.El_ShipFrontCover___6cc0Var.C_PiecesFulfilled = true
    } else {
        fe.State.El_ShipFrontCover___6cc0Var.C_PiecesFulfilled = false
        fe.State.ConstraintsFulfilled = false
    }
    fe.State.El_ShipFrontCover___6cc0Var.C_Deadline = actionArgsMap["C_Deadline"].(float64)
    if actionArgsMap["C_Deadline"].(float64) == 2022-02-20 {
        fe.State.El_ShipFrontCover___6cc0Var.C_DeadlineFulfilled = true
    } else {
        fe.State.El_ShipFrontCover___6cc0Var.C_DeadlineFulfilled = false
        fe.State.ConstraintsFulfilled = false
    }

	return true

}


func (fe *Execution) El_ProduceWoodenBox___665bFunc(actionArgsMap map[string]interface{}) bool {
	if !fe.State.El_ProduceWoodenBox___665bActive {
		return false
	}

	// previous elements <- false
	fe.State.El_ProduceWoodenBox___665bActive = false

	// next elements <- true
	fe.State.El_ShipWoodenBox___9607Active = true
         

    fe.State.El_ProduceWoodenBox___665bVar.C_Pieces = actionArgsMap["C_Pieces"].(float64)
    if actionArgsMap["C_Pieces"].(float64) == 5 {
        fe.State.El_ProduceWoodenBox___665bVar.C_PiecesFulfilled = true
    } else {
        fe.State.El_ProduceWoodenBox___665bVar.C_PiecesFulfilled = false
        fe.State.ConstraintsFulfilled = false
    }
    fe.State.El_ProduceWoodenBox___665bVar.C_Deadline = actionArgsMap["C_Deadline"].(float64)
    if actionArgsMap["C_Deadline"].(float64) == 2022-02-18 {
        fe.State.El_ProduceWoodenBox___665bVar.C_DeadlineFulfilled = true
    } else {
        fe.State.El_ProduceWoodenBox___665bVar.C_DeadlineFulfilled = false
        fe.State.ConstraintsFulfilled = false
    }

	return true

}



func (fe *Execution) El_Parallelism___27f0Func() {
    if !fe.State.El_Parallelism___27f0Active {
        return
    }

    // previous elements <- false
    fe.State.El_Parallelism___27f0Active = false

        // next elements <- true
    fe.State.El_ProduceWoodenBox___665bActive = true

    fe.State.El_EngraveAcrylicFrontCov___418fActive = true

}

func (fe *Execution) El_Parallelism___dbd4Func() {
    if !fe.State.El_960773f4_1339_4673_896___9ec9Active {
        return
    }
    if !fe.State.El_6cc01341_3547_459c_aa0___2ad6Active {
        return
    }

    // previous elements <- false
    fe.State.El_960773f4_1339_4673_896___9ec9Active = false
    fe.State.El_6cc01341_3547_459c_aa0___2ad6Active = false

        // next elements <- true
    fe.State.El_PackWineBottle___e71bActive = true

}


func (fe *Execution) El_PackWineBottle___e71bFunc(actionArgsMap map[string]interface{}) bool {
	if !fe.State.El_PackWineBottle___e71bActive {
		return false
	}

	// previous elements <- false
	fe.State.El_PackWineBottle___e71bActive = false

	// next elements <- true
	fe.State.El_End___696aActive = true
         

    fe.State.El_PackWineBottle___e71bVar.C_Pieces = actionArgsMap["C_Pieces"].(float64)
    if actionArgsMap["C_Pieces"].(float64) == 5 {
        fe.State.El_PackWineBottle___e71bVar.C_PiecesFulfilled = true
    } else {
        fe.State.El_PackWineBottle___e71bVar.C_PiecesFulfilled = false
        fe.State.ConstraintsFulfilled = false
    }
    fe.State.El_PackWineBottle___e71bVar.C_Deadline = actionArgsMap["C_Deadline"].(float64)
    if actionArgsMap["C_Deadline"].(float64) == 2022-02-22 {
        fe.State.El_PackWineBottle___e71bVar.C_DeadlineFulfilled = true
    } else {
        fe.State.El_PackWineBottle___e71bVar.C_DeadlineFulfilled = false
        fe.State.ConstraintsFulfilled = false
    }

	return true

}


func (fe *Execution) El_End___696aFunc(actionArgsMap map[string]interface{}) bool {
	if !fe.State.El_End___696aActive {
		return false
	}

	// previous elements <- false
	fe.State.El_End___696aActive = false

	fe.State.TerminationActivated = true
        
	return true

}


func (fe *Execution) El_Start___aa98Func(actionArgsMap map[string]interface{}) bool {
	if !fe.State.El_Start___aa98Active {
		return false
	}

	// previous elements <- false
	fe.State.El_Start___aa98Active = false

	// next elements <- true
	fe.State.El_ProduceWoodenBox___665bActive = true
	fe.State.El_EngraveAcrylicFrontCov___418fActive = true
        
	return true

}


func (fe *Execution) El_EngraveAcrylicFrontCov___418fFunc(actionArgsMap map[string]interface{}) bool {
	if !fe.State.El_EngraveAcrylicFrontCov___418fActive {
		return false
	}

	// previous elements <- false
	fe.State.El_EngraveAcrylicFrontCov___418fActive = false

	// next elements <- true
	fe.State.El_ShipFrontCover___6cc0Active = true
         

    fe.State.El_EngraveAcrylicFrontCov___418fVar.C_Pieces = actionArgsMap["C_Pieces"].(float64)
    if actionArgsMap["C_Pieces"].(float64) == 5 {
        fe.State.El_EngraveAcrylicFrontCov___418fVar.C_PiecesFulfilled = true
    } else {
        fe.State.El_EngraveAcrylicFrontCov___418fVar.C_PiecesFulfilled = false
        fe.State.ConstraintsFulfilled = false
    }
    fe.State.El_EngraveAcrylicFrontCov___418fVar.C_Deadline = actionArgsMap["C_Deadline"].(float64)
    if actionArgsMap["C_Deadline"].(float64) == 2022-02-17 {
        fe.State.El_EngraveAcrylicFrontCov___418fVar.C_DeadlineFulfilled = true
    } else {
        fe.State.El_EngraveAcrylicFrontCov___418fVar.C_DeadlineFulfilled = false
        fe.State.ConstraintsFulfilled = false
    }

	return true

}


func (fe *Execution) El_ShipWoodenBox___9607Func(actionArgsMap map[string]interface{}) bool {
	if !fe.State.El_ShipWoodenBox___9607Active {
		return false
	}

	// previous elements <- false
	fe.State.El_ShipWoodenBox___9607Active = false

	// next elements <- true
	fe.State.El_960773f4_1339_4673_896___9ec9Active = true
    fe.El_Parallelism___dbd4Func()
         

    fe.State.El_ShipWoodenBox___9607Var.C_Pieces = actionArgsMap["C_Pieces"].(float64)
    if actionArgsMap["C_Pieces"].(float64) == 5 {
        fe.State.El_ShipWoodenBox___9607Var.C_PiecesFulfilled = true
    } else {
        fe.State.El_ShipWoodenBox___9607Var.C_PiecesFulfilled = false
        fe.State.ConstraintsFulfilled = false
    }
    fe.State.El_ShipWoodenBox___9607Var.C_Deadline = actionArgsMap["C_Deadline"].(float64)
    if actionArgsMap["C_Deadline"].(float64) == 2022-02-20 {
        fe.State.El_ShipWoodenBox___9607Var.C_DeadlineFulfilled = true
    } else {
        fe.State.El_ShipWoodenBox___9607Var.C_DeadlineFulfilled = false
        fe.State.ConstraintsFulfilled = false
    }

	return true

}
