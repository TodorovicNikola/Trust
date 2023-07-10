package flow

import "fmt"

type Execution struct {
	CBP_ID string
	IP_ID  string
	State  ExecutionState
}

func NewFlowExecution(CBP_ID string, IP_ID string) Execution {
	flowExecution := Execution{}
    flowExecution.CBP_ID = CBP_ID
    flowExecution.IP_ID = IP_ID
	flowExecution.State.ConstraintsFulfilled = true
	flowExecution.State.El_Start___7defActive = true

	return flowExecution
}

func (fe *Execution) Execute(action string, actionArgsMap map[string]interface{}) (bool, error) {
	var retVal bool
    var err error

	switch action {
     case "El_SA01_SideAssembling_L____bdc3":
         retVal, err = fe.El_SA01_SideAssembling_L____bdc3Func(actionArgsMap)
     case "El_FA01_FrameAssembling___6d9c":
         retVal, err = fe.El_FA01_FrameAssembling___6d9cFunc(actionArgsMap)
     case "El_BAH01_BackSideHammerin___a27d":
         retVal, err = fe.El_BAH01_BackSideHammerin___a27dFunc(actionArgsMap)
     case "El_BI01_BoxInspection___6ee4":
         retVal, err = fe.El_BI01_BoxInspection___6ee4Func(actionArgsMap)
     case "El_Start___7def":
         retVal, err = fe.El_Start___7defFunc(actionArgsMap)
     case "El_PA01_Packaging___8f3d":
         retVal, err = fe.El_PA01_Packaging___8f3dFunc(actionArgsMap)
     case "El_End___ff1b":
         retVal, err = fe.El_End___ff1bFunc(actionArgsMap)
     case "El_SA01_SideAssembling_R____2d4e":
         retVal, err = fe.El_SA01_SideAssembling_R____2d4eFunc(actionArgsMap)
    default:
    	return false,  fmt.Errorf("Invalid Action Execution Attempted! No such action as: %s ", action)
    }

    if err != nil {
    		return false, err
    }

	if !retVal {
		return false, fmt.Errorf("Invalid Action Execution Attempted! State not adequate for action! State: %+v ", fe)
	}

	return true, nil
}



func (fe *Execution) El_SA01_SideAssembling_L____bdc3Func(actionArgsMap map[string]interface{}) (bool, error) {
	if !fe.State.El_SA01_SideAssembling_L____bdc3Active {
		return false, nil
	}

	// previous elements <- false
	fe.State.El_SA01_SideAssembling_L____bdc3Active = false

	// next elements <- true
	fe.State.