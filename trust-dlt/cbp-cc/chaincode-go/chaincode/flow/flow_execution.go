package flow

import (
	"fmt"
	"encoding/json"

	"github.com/hyperledger/fabric-contract-api-go/contractapi"
)

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

func (fe *Execution) Execute(action string, actionArgsMap map[string]interface{}, ctx contractapi.TransactionContextInterface) (bool, error) {
	var retVal = true
	var err error

	switch action {
     case "El_ShipFrontCover___6cc0":
         retVal, err = fe.El_ShipFrontCover___6cc0Func(actionArgsMap, ctx)
     case "El_ProduceWoodenBox___665b":
         retVal, err = fe.El_ProduceWoodenBox___665bFunc(actionArgsMap, ctx)
     case "El_PackWineBottle___e71b":
         retVal, err = fe.El_PackWineBottle___e71bFunc(actionArgsMap, ctx)
     case "El_End___696a":
         retVal, err = fe.El_End___696aFunc(actionArgsMap, ctx)
     case "El_Start___aa98":
         retVal, err = fe.El_Start___aa98Func(actionArgsMap, ctx)
     case "El_EngraveAcrylicFrontCov___418f":
         retVal, err = fe.El_EngraveAcrylicFrontCov___418fFunc(actionArgsMap, ctx)
     case "El_ShipWoodenBox___9607":
         retVal, err = fe.El_ShipWoodenBox___9607Func(actionArgsMap, ctx)
    default:
    	return false, fmt.Errorf("Invalid Action Execution Attempted! No such action as: %s ", action)
    }

	if err != nil {
		return false, err
	}

	if !retVal {
		return false, fmt.Errorf("Invalid Action Execution Attempted! State not adequate for action! State: %+v ", fe)
	}

	return true, nil
}



func (fe *Execution) El_ShipFrontCover___6cc0Func(actionArgsMap map[string]interface{}, ctx contractapi.TransactionContextInterface) (bool, error) {
	if !fe.State.El_ShipFrontCover___6cc0Active {
		return false, nil
	}

	// previous elements <- false
	fe.State.El_ShipFrontCover___6cc0Active = false

	// next elements <- true
	fe.State.El_6cc01341_3547_459c_aa0___2ad6Active = true
    fe.El_Parallelism___dbd4Func()

    fe.State.El_ShipFrontCover___6cc0Var.ElementExecutionCompleted = true
    fe.State.El_ShipFrontCover___6cc0Var.ElementConstraintsFulfilled = true
    fe.State.El_ShipFrontCover___6cc0Var.C_Pieces = actionArgsMap["C_Pieces"].(float64)
    if actionArgsMap["C_Pieces"].(float64) == 5 {
        fe.State.El_ShipFrontCover___6cc0Var.C_PiecesFulfilled = true
    } else {
        fe.State.El_ShipFrontCover___6cc0Var.C_PiecesFulfilled = false
        fe.State.ConstraintsFulfilled = false
        fe.State.El_ShipFrontCover___6cc0Var.ElementConstraintsFulfilled = false

    }
    fe.State.El_ShipFrontCover___6cc0Var.C_Pieces = actionArgsMap["C_Pieces"].(float64)


	return true, nil

}


func (fe *Execution) El_ProduceWoodenBox___665bFunc(actionArgsMap map[string]interface{}, ctx contractapi.TransactionContextInterface) (bool, error) {
	if !fe.State.El_ProduceWoodenBox___665bActive {
		return false, nil
	}

	// previous elements <- false
	fe.State.El_ProduceWoodenBox___665bActive = false

	// next elements <- true
	fe.State.El_ShipWoodenBox___9607Active = true

    fe.State.El_ProduceWoodenBox___665bVar.ElementExecutionCompleted = true
    fe.State.El_ProduceWoodenBox___665bVar.ElementConstraintsFulfilled = true

    params := []string{"GetSuccessfulFlowExecutionCount", fe.ID}
    queryArgs := make([][]byte, len(params))
    for i, arg := range params {
        queryArgs[i] = []byte(arg)
    }

    response := ctx.GetStub().InvokeChaincode("ip-cc", queryArgs, "mychannel")  // zbog ovoga ti treba ID IP-a, da znas koji CC treba da se invokuje...

    var countDto CountDto
    err := json.Unmarshal(response.Payload, &countDto)
    if err != nil {
        return false, err
    }

    if countDto.Count < 5 {
        fe.State.El_ProduceWoodenBox___665bVar.C_PiecesFulfilled = false
        fe.State.ConstraintsFulfilled = false
        fe.State.El_ProduceWoodenBox___665bVar.ElementConstraintsFulfilled = false
    } else {
        fe.State.El_ProduceWoodenBox___665bVar.C_PiecesFulfilled = true
    }
    fe.State.El_ProduceWoodenBox___665bVar.C_Pieces = countDto.Count


	return true, nil

}



// func (fe *Execution) El_Parallelism___27f0Func() {
//     if !fe.State.El_Parallelism___27f0Active {
//         return
//     }

//     // previous elements <- false
//     fe.State.El_Parallelism___27f0Active = false

//         // next elements <- true
//     fe.State.El_ProduceWoodenBox___665bActive = true

//     fe.State.El_EngraveAcrylicFrontCov___418fActive = true

// }

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


func (fe *Execution) El_PackWineBottle___e71bFunc(actionArgsMap map[string]interface{}, ctx contractapi.TransactionContextInterface) (bool, error) {
	if !fe.State.El_PackWineBottle___e71bActive {
		return false, nil
	}

	// previous elements <- false
	fe.State.El_PackWineBottle___e71bActive = false

	// next elements <- true
	fe.State.El_End___696aActive = true

    fe.State.El_PackWineBottle___e71bVar.ElementExecutionCompleted = true
    fe.State.El_PackWineBottle___e71bVar.ElementConstraintsFulfilled = true
    fe.State.El_PackWineBottle___e71bVar.C_Pieces = actionArgsMap["C_Pieces"].(float64)
    if actionArgsMap["C_Pieces"].(float64) == 5 {
        fe.State.El_PackWineBottle___e71bVar.C_PiecesFulfilled = true
    } else {
        fe.State.El_PackWineBottle___e71bVar.C_PiecesFulfilled = false
        fe.State.ConstraintsFulfilled = false
        fe.State.El_PackWineBottle___e71bVar.ElementConstraintsFulfilled = false

    }
    fe.State.El_PackWineBottle___e71bVar.C_Pieces = actionArgsMap["C_Pieces"].(float64)


	return true, nil

}


func (fe *Execution) El_End___696aFunc(actionArgsMap map[string]interface{}, ctx contractapi.TransactionContextInterface) (bool, error) {
	if !fe.State.El_End___696aActive {
		return false, nil
	}

	// previous elements <- false
	fe.State.El_End___696aActive = false

	fe.State.TerminationActivated = true

	return true, nil

}


func (fe *Execution) El_Start___aa98Func(actionArgsMap map[string]interface{}, ctx contractapi.TransactionContextInterface) (bool, error) {
	if !fe.State.El_Start___aa98Active {
		return false, nil
	}

	// previous elements <- false
	fe.State.El_Start___aa98Active = false

	// next elements <- true
	fe.State.El_ProduceWoodenBox___665bActive = true
	fe.State.El_EngraveAcrylicFrontCov___418fActive = true
        
	return true, nil

}


func (fe *Execution) El_EngraveAcrylicFrontCov___418fFunc(actionArgsMap map[string]interface{}, ctx contractapi.TransactionContextInterface) (bool, error) {
	if !fe.State.El_EngraveAcrylicFrontCov___418fActive {
		return false, nil
	}

	// previous elements <- false
	fe.State.El_EngraveAcrylicFrontCov___418fActive = false

	// next elements <- true
	fe.State.El_ShipFrontCover___6cc0Active = true
         
    fe.State.El_EngraveAcrylicFrontCov___418fVar.ElementExecutionCompleted = true
    fe.State.El_EngraveAcrylicFrontCov___418fVar.ElementConstraintsFulfilled = true
    fe.State.El_EngraveAcrylicFrontCov___418fVar.C_Pieces = actionArgsMap["C_Pieces"].(float64)
    if actionArgsMap["C_Pieces"].(float64) == 5 {
        fe.State.El_EngraveAcrylicFrontCov___418fVar.C_PiecesFulfilled = true
    } else {
        fe.State.El_EngraveAcrylicFrontCov___418fVar.C_PiecesFulfilled = false
        fe.State.ConstraintsFulfilled = false
        fe.State.El_EngraveAcrylicFrontCov___418fVar.ElementConstraintsFulfilled = false

    }
    fe.State.El_EngraveAcrylicFrontCov___418fVar.C_Pieces = actionArgsMap["C_Pieces"].(float64)


	return true, nil

}


func (fe *Execution) El_ShipWoodenBox___9607Func(actionArgsMap map[string]interface{}, ctx contractapi.TransactionContextInterface) (bool, error) {
	if !fe.State.El_ShipWoodenBox___9607Active {
		return false, nil
	}

	// previous elements <- false
	fe.State.El_ShipWoodenBox___9607Active = false

	// next elements <- true
	fe.State.El_960773f4_1339_4673_896___9ec9Active = true
    fe.El_Parallelism___dbd4Func()

    fe.State.El_ShipWoodenBox___9607Var.ElementExecutionCompleted = true
    fe.State.El_ShipWoodenBox___9607Var.ElementConstraintsFulfilled = true
    fe.State.El_ShipWoodenBox___9607Var.C_Pieces = actionArgsMap["C_Pieces"].(float64)
    if actionArgsMap["C_Pieces"].(float64) == 5 {
        fe.State.El_ShipWoodenBox___9607Var.C_PiecesFulfilled = true
    } else {
        fe.State.El_ShipWoodenBox___9607Var.C_PiecesFulfilled = false
        fe.State.ConstraintsFulfilled = false
        fe.State.El_ShipWoodenBox___9607Var.ElementConstraintsFulfilled = false

    }
    fe.State.El_ShipWoodenBox___9607Var.C_Pieces = actionArgsMap["C_Pieces"].(float64)


	return true, nil

}
