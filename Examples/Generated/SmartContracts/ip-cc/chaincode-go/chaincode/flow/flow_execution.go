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
     case "El_FA01_FrameAssembling___6d9c":
         retVal, err = fe.El_FA01_FrameAssembling___6d9cFunc(actionArgsMap)
     case "El_BAH01_BackSideHammerin___a27d":
         retVal, err = fe.El_BAH01_BackSideHammerin___a27dFunc(actionArgsMap)
     case "El_NT_SQ_04_PI001_Discard___bdec":
         retVal, err = fe.El_NT_SQ_04_PI001_Discard___bdecFunc(actionArgsMap)
     case "El_BI01_BoxInspection___6ee4":
         retVal, err = fe.El_BI01_BoxInspection___6ee4Func(actionArgsMap)
     case "El_SA01_SideAssembling_L____bdc3":
         retVal, err = fe.El_SA01_SideAssembling_L____bdc3Func(actionArgsMap)
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



func (fe *Execution) El_FA01_FrameAssembling___6d9cFunc(actionArgsMap map[string]interface{}) (bool, error) {
	if !fe.State.El_FA01_FrameAssembling___6d9cActive {
		return false, nil
	}

	// previous elements <- false
	fe.State.El_FA01_FrameAssembling___6d9cActive = false

	// next elements <- true
	fe.State.El_BAH01_BackSideHammerin___a27dActive = true
                
	return true, nil

}


func (fe *Execution) El_BAH01_BackSideHammerin___a27dFunc(actionArgsMap map[string]interface{}) (bool, error) {
	if !fe.State.El_BAH01_BackSideHammerin___a27dActive {
		return false, nil
	}

	// previous elements <- false
	fe.State.El_BAH01_BackSideHammerin___a27dActive = false

	// next elements <- true
	fe.State.El_BI01_BoxInspection___6ee4Active = true
                
	return true, nil

}


func (fe *Execution) El_NT_SQ_04_PI001_Discard___bdecFunc(actionArgsMap map[string]interface{}) (bool, error) {
	if !fe.State.El_NT_SQ_04_PI001_Discard___bdecActive {
		return false, nil
	}

	// previous elements <- false
	fe.State.El_NT_SQ_04_PI001_Discard___bdecActive = false
	fe.State.El_PA01_Packaging___8f3dActive = false

	// next elements <- true
	fe.State.El_End___ff1bActive = true
                
	return true, nil

}


func (fe *Execution) El_BI01_BoxInspection___6ee4Func(actionArgsMap map[string]interface{}) (bool, error) {
	if !fe.State.El_BI01_BoxInspection___6ee4Active {
		return false, nil
	}

	// previous elements <- false
	fe.State.El_BI01_BoxInspection___6ee4Active = false

	// next elements <- true
	fe.State.El_NT_SQ_04_PI001_Discard___bdecActive = true
	fe.State.El_PA01_Packaging___8f3dActive = true
         
    fe.State.El_BI01_BoxInspection___6ee4Var.ElementExecutionCompleted = true
    fe.State.El_BI01_BoxInspection___6ee4Var.ElementConstraintsFulfilled = true
    fe.State.El_BI01_BoxInspection___6ee4Var.C_WidthDev = actionArgsMap["C_WidthDev"].(float64)
    if actionArgsMap["C_WidthDev"].(float64) < 5 {
        fe.State.El_BI01_BoxInspection___6ee4Var.C_WidthDevFulfilled = true
    } else {
        fe.State.El_BI01_BoxInspection___6ee4Var.C_WidthDevFulfilled = false
        fe.State.ConstraintsFulfilled = false
        fe.State.El_BI01_BoxInspection___6ee4Var.ElementConstraintsFulfilled = false
    }
    fe.State.El_BI01_BoxInspection___6ee4Var.C_HeightDev = actionArgsMap["C_HeightDev"].(float64)
    if actionArgsMap["C_HeightDev"].(float64) < 3 {
        fe.State.El_BI01_BoxInspection___6ee4Var.C_HeightDevFulfilled = true
    } else {
        fe.State.El_BI01_BoxInspection___6ee4Var.C_HeightDevFulfilled = false
        fe.State.ConstraintsFulfilled = false
        fe.State.El_BI01_BoxInspection___6ee4Var.ElementConstraintsFulfilled = false
    }
    fe.State.El_BI01_BoxInspection___6ee4Var.C_DeptDev = actionArgsMap["C_DeptDev"].(float64)
    if actionArgsMap["C_DeptDev"].(float64) < 3 {
        fe.State.El_BI01_BoxInspection___6ee4Var.C_DeptDevFulfilled = true
    } else {
        fe.State.El_BI01_BoxInspection___6ee4Var.C_DeptDevFulfilled = false
        fe.State.ConstraintsFulfilled = false
        fe.State.El_BI01_BoxInspection___6ee4Var.ElementConstraintsFulfilled = false
    }
         
    fe.State.El_BI01_BoxInspection___6ee4Var.IP_Box_decd_ID = actionArgsMap["IP_Box_decd_ID"].(string)

	return true, nil

}

func (fe *Execution) El_Parallelism___9b28Func() {
    if !fe.State.El_2d4ef802_435c_4bc4_96b___6ff1Active {
        return
    }
    if !fe.State.El_bdc3eee5_8c52_47fa_a3e___e4b7Active {
        return
    }

    // previous elements <- false
    fe.State.El_2d4ef802_435c_4bc4_96b___6ff1Active = false
    fe.State.El_bdc3eee5_8c52_47fa_a3e___e4b7Active = false

        // next elements <- true
    fe.State.El_FA01_FrameAssembling___6d9cActive = true

}



func (fe *Execution) El_SA01_SideAssembling_L____bdc3Func(actionArgsMap map[string]interface{}) (bool, error) {
	if !fe.State.El_SA01_SideAssembling_L____bdc3Active {
		return false, nil
	}

	// previous elements <- false
	fe.State.El_SA01_SideAssembling_L____bdc3Active = false

	// next elements <- true
	fe.State.El_bdc3eee5_8c52_47fa_a3e___e4b7Active = true
    fe.El_Parallelism___9b28Func()
         
    fe.State.El_SA01_SideAssembling_L____bdc3Var.ElementExecutionCompleted = true
    fe.State.El_SA01_SideAssembling_L____bdc3Var.ElementConstraintsFulfilled = true
    fe.State.El_SA01_SideAssembling_L____bdc3Var.C_t = actionArgsMap["C_t"].(float64)
    if actionArgsMap["C_t"].(float64) <= 1 {
        fe.State.El_SA01_SideAssembling_L____bdc3Var.C_tFulfilled = true
    } else {
        fe.State.El_SA01_SideAssembling_L____bdc3Var.C_tFulfilled = false
        fe.State.ConstraintsFulfilled = false
        fe.State.El_SA01_SideAssembling_L____bdc3Var.ElementConstraintsFulfilled = false
    }
         
    fe.State.El_SA01_SideAssembling_L____bdc3Var.IP_Bottomside_6dc4_ID_1 = actionArgsMap["IP_Bottomside_6dc4_ID_1"].(string)
    fe.State.El_SA01_SideAssembling_L____bdc3Var.IP_Bottomside_6dc4_ID_2 = actionArgsMap["IP_Bottomside_6dc4_ID_2"].(string)
    fe.State.El_SA01_SideAssembling_L____bdc3Var.IP_Leftside_6dc4_ID = actionArgsMap["IP_Leftside_6dc4_ID"].(string)

	return true, nil

}


func (fe *Execution) El_Start___7defFunc(actionArgsMap map[string]interface{}) (bool, error) {
	if !fe.State.El_Start___7defActive {
		return false, nil
	}

	// previous elements <- false
	fe.State.El_Start___7defActive = false

	// next elements <- true
	fe.State.El_SA01_SideAssembling_L____bdc3Active = true
	fe.State.El_SA01_SideAssembling_R____2d4eActive = true
                
	return true, nil

}


// func (fe *Execution) El_Parallelism___1924Func() {
//     if !fe.State.El_Parallelism___1924Active {
//         return
//     }

//     // previous elements <- false
//     fe.State.El_Parallelism___1924Active = false

//         // next elements <- true
//     fe.State.El_SA01_SideAssembling_L____bdc3Active = true

//     fe.State.El_SA01_SideAssembling_R____2d4eActive = true

// }


func (fe *Execution) El_PA01_Packaging___8f3dFunc(actionArgsMap map[string]interface{}) (bool, error) {
	if !fe.State.El_PA01_Packaging___8f3dActive {
		return false, nil
	}

	// previous elements <- false
	fe.State.El_PA01_Packaging___8f3dActive = false
	fe.State.El_NT_SQ_04_PI001_Discard___bdecActive = false

	// next elements <- true
	fe.State.El_End___ff1bActive = true
                
	return true, nil

}


func (fe *Execution) El_End___ff1bFunc(actionArgsMap map[string]interface{}) (bool, error) {
	if !fe.State.El_End___ff1bActive {
		return false, nil
	}

	// previous elements <- false
	fe.State.El_End___ff1bActive = false

	fe.State.TerminationActivated = true
                
	return true, nil

}


func (fe *Execution) El_SA01_SideAssembling_R____2d4eFunc(actionArgsMap map[string]interface{}) (bool, error) {
	if !fe.State.El_SA01_SideAssembling_R____2d4eActive {
		return false, nil
	}

	// previous elements <- false
	fe.State.El_SA01_SideAssembling_R____2d4eActive = false

	// next elements <- true
	fe.State.El_2d4ef802_435c_4bc4_96b___6ff1Active = true
    fe.El_Parallelism___9b28Func()
         
    fe.State.El_SA01_SideAssembling_R____2d4eVar.ElementExecutionCompleted = true
    fe.State.El_SA01_SideAssembling_R____2d4eVar.ElementConstraintsFulfilled = true
    fe.State.El_SA01_SideAssembling_R____2d4eVar.C_t = actionArgsMap["C_t"].(float64)
    if actionArgsMap["C_t"].(float64) <= 1 {
        fe.State.El_SA01_SideAssembling_R____2d4eVar.C_tFulfilled = true
    } else {
        fe.State.El_SA01_SideAssembling_R____2d4eVar.C_tFulfilled = false
        fe.State.ConstraintsFulfilled = false
        fe.State.El_SA01_SideAssembling_R____2d4eVar.ElementConstraintsFulfilled = false
    }
        
	return true, nil

}
