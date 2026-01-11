package flow

import (
	"fmt"
	"time"
	"encoding/json"

	"github.com/hyperledger/fabric-contract-api-go/contractapi"
)

func isBeforeToday(dateStr string) (bool, error) {
	t, err := time.ParseInLocation("2006-01-02", dateStr, time.UTC)
	if err != nil {
		return false, err
	}

	todayUTC := time.Now().UTC().Truncate(24 * time.Hour)

	return t.Unix() < todayUTC.Unix(), nil
}

func getSuccessfulExecutionCountForRelatedIP(ctx contractapi.TransactionContextInterface, relatedIPName string, cbpId string, channel string) (CountDto, bool, error) {
	var methodName string = "GetSuccessfulFlowExecutionCount"
	params := []string{methodName, cbpId}
	queryArgs := make([][]byte, len(params))
	for i, arg := range params {
		queryArgs[i] = []byte(arg)
	}

	response := ctx.GetStub().InvokeChaincode(relatedIPName, queryArgs, channel)

	var countDto CountDto
	err := json.Unmarshal(response.Payload, &countDto)
	if err != nil {
		return CountDto{}, false, err
	}
	return countDto, false, nil
}

type Execution struct {
	ID    string
	State ExecutionState
}

func NewFlowExecution(ID string) Execution {
	flowExecution := Execution{}
	flowExecution.ID = ID
	flowExecution.State.ServicePropertiesFulfilled = true
	flowExecution.State.El_Start___ee01Active = true

	return flowExecution
}

func (fe *Execution) Execute(action string, actionArgsMap map[string]interface{}, ctx contractapi.TransactionContextInterface) (bool, error) {
	var retVal = true
	var err error

	switch action {
     case "El_Start___ee01":
         retVal, err = fe.El_Start___ee01Func(actionArgsMap, ctx)
     case "El_e___63ad":
         retVal, err = fe.El_e___63adFunc(actionArgsMap, ctx)
     case "El_End___e153":
         retVal, err = fe.El_End___e153Func(actionArgsMap, ctx)
     case "El_d___af32":
         retVal, err = fe.El_d___af32Func(actionArgsMap, ctx)
     case "El_c___cacc":
         retVal, err = fe.El_c___caccFunc(actionArgsMap, ctx)
     case "El_b___1b86":
         retVal, err = fe.El_b___1b86Func(actionArgsMap, ctx)
     case "El_a___2965":
         retVal, err = fe.El_a___2965Func(actionArgsMap, ctx)
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



func (fe *Execution) El_Start___ee01ChangeActiveState() bool {
	if !fe.State.El_Start___ee01Active {
		return false
	}

	// previous elements <- false
	fe.State.El_Start___ee01Active = false

	// next elements <- true
	fe.State.El_a___2965Active = true
	fe.State.El_b___1b86Active = true

    return true
}

func (fe *Execution) El_Start___ee01_PerformPropertyValidation(actionArgsMap map[string]interface{}, ctx contractapi.TransactionContextInterface) (bool, error) {

        	return true, nil
}

func (fe *Execution) El_Start___ee01Func(actionArgsMap map[string]interface{}, ctx contractapi.TransactionContextInterface) (bool, error) {
	stateChangeSuccessful := fe.El_Start___ee01ChangeActiveState()

	if !stateChangeSuccessful {
		return false, nil
	}

	fe.El_Start___ee01_PerformPropertyValidation(actionArgsMap, ctx)

	return true, nil

}



func (fe *Execution) El_e___63adChangeActiveState() bool {
	if !fe.State.El_e___63adActive {
		return false
	}

	// previous elements <- false
	fe.State.El_e___63adActive = false

	// next elements <- true
	fe.State.El_End___e153Active = true

    return true
}

func (fe *Execution) El_e___63ad_PerformPropertyValidation(actionArgsMap map[string]interface{}, ctx contractapi.TransactionContextInterface) (bool, error) {

         
    fe.State.El_e___63adVar.ElementExecutionCompleted = true
    fe.State.El_e___63adVar.ElementPropertiesFulfilled = true
    fe.State.El_e___63adVar.P_Deadline = actionArgsMap["P_Deadline"].(string)
    
    retVal, _ := isBeforeToday(actionArgsMap["P_Deadline"].(string))
    if retVal {
        fe.State.El_e___63adVar.P_DeadlineFulfilled = true
    } else {
        fe.State.El_e___63adVar.P_DeadlineFulfilled = false
        fe.State.ServicePropertiesFulfilled = false
        fe.State.El_e___63adVar.ElementPropertiesFulfilled = false

    }
	return true, nil
}

func (fe *Execution) El_e___63adFunc(actionArgsMap map[string]interface{}, ctx contractapi.TransactionContextInterface) (bool, error) {
	stateChangeSuccessful := fe.El_e___63adChangeActiveState()

	if !stateChangeSuccessful {
		return false, nil
	}

	fe.El_e___63ad_PerformPropertyValidation(actionArgsMap, ctx)

	return true, nil

}


func (fe *Execution) El_End___e153ChangeActiveState() bool {
	if !fe.State.El_End___e153Active {
		return false
	}

	// previous elements <- false
	fe.State.El_End___e153Active = false

	fe.State.TerminationActivated = true

    return true
}

func (fe *Execution) El_End___e153_PerformPropertyValidation(actionArgsMap map[string]interface{}, ctx contractapi.TransactionContextInterface) (bool, error) {

        	return true, nil
}

func (fe *Execution) El_End___e153Func(actionArgsMap map[string]interface{}, ctx contractapi.TransactionContextInterface) (bool, error) {
	stateChangeSuccessful := fe.El_End___e153ChangeActiveState()

	if !stateChangeSuccessful {
		return false, nil
	}

	fe.El_End___e153_PerformPropertyValidation(actionArgsMap, ctx)

	return true, nil

}


func (fe *Execution) El_d___af32ChangeActiveState() bool {
	if !fe.State.El_d___af32Active {
		return false
	}

	// previous elements <- false
	fe.State.El_d___af32Active = false

	// next elements <- true
	fe.State.El_af3237e6_e858_44ed_9fc___39dfActive = true
    fe.El_Parallelism___472cFunc()

    return true
}

func (fe *Execution) El_d___af32_PerformPropertyValidation(actionArgsMap map[string]interface{}, ctx contractapi.TransactionContextInterface) (bool, error) {

         
    fe.State.El_d___af32Var.ElementExecutionCompleted = true
    fe.State.El_d___af32Var.ElementPropertiesFulfilled = true
    fe.State.El_d___af32Var.P_Deadline = actionArgsMap["P_Deadline"].(string)
    
    retVal, _ := isBeforeToday(actionArgsMap["P_Deadline"].(string))
    if retVal {
        fe.State.El_d___af32Var.P_DeadlineFulfilled = true
    } else {
        fe.State.El_d___af32Var.P_DeadlineFulfilled = false
        fe.State.ServicePropertiesFulfilled = false
        fe.State.El_d___af32Var.ElementPropertiesFulfilled = false

    }
	return true, nil
}

func (fe *Execution) El_d___af32Func(actionArgsMap map[string]interface{}, ctx contractapi.TransactionContextInterface) (bool, error) {
	stateChangeSuccessful := fe.El_d___af32ChangeActiveState()

	if !stateChangeSuccessful {
		return false, nil
	}

	fe.El_d___af32_PerformPropertyValidation(actionArgsMap, ctx)

	return true, nil

}


func (fe *Execution) El_c___caccChangeActiveState() bool {
	if !fe.State.El_c___caccActive {
		return false
	}

	// previous elements <- false
	fe.State.El_c___caccActive = false

	// next elements <- true
	fe.State.El_caccd44f_0668_4aff_985___58e5Active = true
    fe.El_Parallelism___472cFunc()

    return true
}

func (fe *Execution) El_c___cacc_PerformPropertyValidation(actionArgsMap map[string]interface{}, ctx contractapi.TransactionContextInterface) (bool, error) {

         
    fe.State.El_c___caccVar.ElementExecutionCompleted = true
    fe.State.El_c___caccVar.ElementPropertiesFulfilled = true
    fe.State.El_c___caccVar.P_Deadline = actionArgsMap["P_Deadline"].(string)
    
    retVal, _ := isBeforeToday(actionArgsMap["P_Deadline"].(string))
    if retVal {
        fe.State.El_c___caccVar.P_DeadlineFulfilled = true
    } else {
        fe.State.El_c___caccVar.P_DeadlineFulfilled = false
        fe.State.ServicePropertiesFulfilled = false
        fe.State.El_c___caccVar.ElementPropertiesFulfilled = false

    }
	return true, nil
}

func (fe *Execution) El_c___caccFunc(actionArgsMap map[string]interface{}, ctx contractapi.TransactionContextInterface) (bool, error) {
	stateChangeSuccessful := fe.El_c___caccChangeActiveState()

	if !stateChangeSuccessful {
		return false, nil
	}

	fe.El_c___cacc_PerformPropertyValidation(actionArgsMap, ctx)

	return true, nil

}


func (fe *Execution) El_b___1b86ChangeActiveState() bool {
	if !fe.State.El_b___1b86Active {
		return false
	}

	// previous elements <- false
	fe.State.El_b___1b86Active = false

	// next elements <- true
	fe.State.El_d___af32Active = true

    return true
}

func (fe *Execution) El_b___1b86_PerformPropertyValidation(actionArgsMap map[string]interface{}, ctx contractapi.TransactionContextInterface) (bool, error) {

         
    fe.State.El_b___1b86Var.ElementExecutionCompleted = true
    fe.State.El_b___1b86Var.ElementPropertiesFulfilled = true
    fe.State.El_b___1b86Var.P_Deadline = actionArgsMap["P_Deadline"].(string)
    
    retVal, _ := isBeforeToday(actionArgsMap["P_Deadline"].(string))
    if retVal {
        fe.State.El_b___1b86Var.P_DeadlineFulfilled = true
    } else {
        fe.State.El_b___1b86Var.P_DeadlineFulfilled = false
        fe.State.ServicePropertiesFulfilled = false
        fe.State.El_b___1b86Var.ElementPropertiesFulfilled = false

    }
	return true, nil
}

func (fe *Execution) El_b___1b86Func(actionArgsMap map[string]interface{}, ctx contractapi.TransactionContextInterface) (bool, error) {
	stateChangeSuccessful := fe.El_b___1b86ChangeActiveState()

	if !stateChangeSuccessful {
		return false, nil
	}

	fe.El_b___1b86_PerformPropertyValidation(actionArgsMap, ctx)

	return true, nil

}


func (fe *Execution) El_a___2965ChangeActiveState() bool {
	if !fe.State.El_a___2965Active {
		return false
	}

	// previous elements <- false
	fe.State.El_a___2965Active = false

	// next elements <- true
	fe.State.El_c___caccActive = true

    return true
}

func (fe *Execution) El_a___2965_PerformPropertyValidation(actionArgsMap map[string]interface{}, ctx contractapi.TransactionContextInterface) (bool, error) {

         
    fe.State.El_a___2965Var.ElementExecutionCompleted = true
    fe.State.El_a___2965Var.ElementPropertiesFulfilled = true

	var relatedIPName string = "SampleIP"
	var channel string = "mychannel"

	countDto, b, err := getSuccessfulExecutionCountForRelatedIP(ctx, relatedIPName, fe.ID, channel)
	if err != nil {
		return b, err
	}

    if countDto.Count < 2 {
        fe.State.El_a___2965Var.P_PiecesFulfilled = false
        fe.State.ServicePropertiesFulfilled = false
        fe.State.El_a___2965Var.ElementPropertiesFulfilled = false
    } else {
        fe.State.El_a___2965Var.P_PiecesFulfilled = true
    }
    fe.State.El_a___2965Var.P_Pieces = countDto.Count

    fe.State.El_a___2965Var.P_Deadline = actionArgsMap["P_Deadline"].(string)
    
    retVal, _ := isBeforeToday(actionArgsMap["P_Deadline"].(string))
    if retVal {
        fe.State.El_a___2965Var.P_DeadlineFulfilled = true
    } else {
        fe.State.El_a___2965Var.P_DeadlineFulfilled = false
        fe.State.ServicePropertiesFulfilled = false
        fe.State.El_a___2965Var.ElementPropertiesFulfilled = false

    }
	return true, nil
}

func (fe *Execution) El_a___2965Func(actionArgsMap map[string]interface{}, ctx contractapi.TransactionContextInterface) (bool, error) {
	stateChangeSuccessful := fe.El_a___2965ChangeActiveState()

	if !stateChangeSuccessful {
		return false, nil
	}

	fe.El_a___2965_PerformPropertyValidation(actionArgsMap, ctx)

	return true, nil

}


func (fe *Execution) El_Parallelism___be81Func() bool {

    // previous elements <- false

        // next elements <- true
    fe.State.El_a___2965Active = true

    fe.State.El_b___1b86Active = true

    return true
}

func (fe *Execution) El_Parallelism___472cFunc() bool {
    if !fe.State.El_caccd44f_0668_4aff_985___58e5Active {
        return false
    }
    if !fe.State.El_af3237e6_e858_44ed_9fc___39dfActive {
        return false
    }

    // previous elements <- false
    fe.State.El_caccd44f_0668_4aff_985___58e5Active = false
    fe.State.El_af3237e6_e858_44ed_9fc___39dfActive = false

        // next elements <- true
    fe.State.El_e___63adActive = true

    return true
}
