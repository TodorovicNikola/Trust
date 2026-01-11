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
	flowExecution.State.El_Start___14aeActive = true

	return flowExecution
}

func (fe *Execution) Execute(action string, actionArgsMap map[string]interface{}) (bool, error) {
	var retVal bool
    var err error

	switch action {
     case "El_b___fff2":
         retVal, err = fe.El_b___fff2Func(actionArgsMap)
     case "El_c___1f35":
         retVal, err = fe.El_c___1f35Func(actionArgsMap)
     case "El_a___2551":
         retVal, err = fe.El_a___2551Func(actionArgsMap)
     case "El_d___d331":
         retVal, err = fe.El_d___d331Func(actionArgsMap)
     case "El_Start___14ae":
         retVal, err = fe.El_Start___14aeFunc(actionArgsMap)
     case "El_End___b56b":
         retVal, err = fe.El_End___b56bFunc(actionArgsMap)
     case "El_f___8235":
         retVal, err = fe.El_f___8235Func(actionArgsMap)
     case "El_e___e20b":
         retVal, err = fe.El_e___e20bFunc(actionArgsMap)
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


    
    
func (fe *Execution) El_b___fff2ChangeActiveState() bool {
	if !fe.State.El_b___fff2Active {
		return false
	}

	// previous elements <- false
	fe.State.El_b___fff2Active = false

	// next elements <- true
	fe.State.El_fff25c35_4d03_421c_ad9___4dcdActive = true
    fe.El_Parallelism___e37eFunc()

    return true
}

func (fe *Execution) El_b___fff2_PerformConstraintValidation(actionArgsMap map[string]interface{}) (bool, error) {
		        
	return true, nil
}


    

func (fe *Execution) El_b___fff2Func(actionArgsMap map[string]interface{}) (bool, error) {
	stateChangeSuccessful := fe.El_b___fff2ChangeActiveState()

	if !stateChangeSuccessful {
		return false, nil
	}


	fe.El_b___fff2_PerformConstraintValidation(actionArgsMap) 

	return true, nil

}

func (fe *Execution) El_Parallelism___e37eFunc() bool {
    if !fe.State.El_25517609_b073_4626_84f___0f38Active {
        return false
    }
    if !fe.State.El_fff25c35_4d03_421c_ad9___4dcdActive {
        return false
    }

    // previous elements <- false
    fe.State.El_25517609_b073_4626_84f___0f38Active = false
    fe.State.El_fff25c35_4d03_421c_ad9___4dcdActive = false

        // next elements <- true
    fe.State.El_c___1f35Active = true

    return true
}


    
    
func (fe *Execution) El_c___1f35ChangeActiveState() bool {
	if !fe.State.El_c___1f35Active {
		return false
	}

	// previous elements <- false
	fe.State.El_c___1f35Active = false

	// next elements <- true
	fe.State.El_d___d331Active = true

    return true
}

func (fe *Execution) El_c___1f35_PerformConstraintValidation(actionArgsMap map[string]interface{}) (bool, error) {
		        
	return true, nil
}


    

func (fe *Execution) El_c___1f35Func(actionArgsMap map[string]interface{}) (bool, error) {
	stateChangeSuccessful := fe.El_c___1f35ChangeActiveState()

	if !stateChangeSuccessful {
		return false, nil
	}


	fe.El_c___1f35_PerformConstraintValidation(actionArgsMap) 

	return true, nil

}

    
    
func (fe *Execution) El_a___2551ChangeActiveState() bool {
	if !fe.State.El_a___2551Active {
		return false
	}

	// previous elements <- false
	fe.State.El_a___2551Active = false

	// next elements <- true
	fe.State.El_25517609_b073_4626_84f___0f38Active = true
    fe.El_Parallelism___e37eFunc()

    return true
}

func (fe *Execution) El_a___2551_PerformConstraintValidation(actionArgsMap map[string]interface{}) (bool, error) {
		 
    fe.State.El_a___2551Var.ElementExecutionCompleted = true
    fe.State.El_a___2551Var.ElementConstraintsFulfilled = true
    
    var tmpC_t_max = actionArgsMap["C_t_max"].(float64)
    fe.State.El_a___2551Var.C_t_max = tmpC_t_max

	isFulfilledEl_a___2551_C_t_max_lte := fe.El_a___2551__ValidateC_t_max_lteFunc(tmpC_t_max)
   	
	if isFulfilledEl_a___2551_C_t_max_lte {
		fe.State.El_a___2551Var.C_t_maxFulfilled = true
	} else {
        fe.State.El_a___2551Var.C_t_maxFulfilled = false
        fe.State.ConstraintsFulfilled = false
        fe.State.El_a___2551Var.ElementConstraintsFulfilled = false
	} 	            

         
    fe.State.El_a___2551Var.IP__645f_ID = actionArgsMap["IP__645f_ID"].(string)

	return true, nil
}

func (fe *Execution) El_a___2551__ValidateC_t_max_lteFunc(parC_t_max float64) bool {
	if parC_t_max <= 1 {
		return true
	} else {
		return false
	}
}

    

func (fe *Execution) El_a___2551Func(actionArgsMap map[string]interface{}) (bool, error) {
	stateChangeSuccessful := fe.El_a___2551ChangeActiveState()

	if !stateChangeSuccessful {
		return false, nil
	}


	fe.El_a___2551_PerformConstraintValidation(actionArgsMap) 

	return true, nil

}

    
    
func (fe *Execution) El_d___d331ChangeActiveState() bool {
	if !fe.State.El_d___d331Active {
		return false
	}

	// previous elements <- false
	fe.State.El_d___d331Active = false

	// next elements <- true
	fe.State.El_e___e20bActive = true

    return true
}

func (fe *Execution) El_d___d331_PerformConstraintValidation(actionArgsMap map[string]interface{}) (bool, error) {
		        
	return true, nil
}


    

func (fe *Execution) El_d___d331Func(actionArgsMap map[string]interface{}) (bool, error) {
	stateChangeSuccessful := fe.El_d___d331ChangeActiveState()

	if !stateChangeSuccessful {
		return false, nil
	}


	fe.El_d___d331_PerformConstraintValidation(actionArgsMap) 

	return true, nil

}

    
    
func (fe *Execution) El_Start___14aeChangeActiveState() bool {
	if !fe.State.El_Start___14aeActive {
		return false
	}

	// previous elements <- false
	fe.State.El_Start___14aeActive = false

	// next elements <- true
	fe.State.El_a___2551Active = true
	fe.State.El_b___fff2Active = true

    return true
}

func (fe *Execution) El_Start___14ae_PerformConstraintValidation(actionArgsMap map[string]interface{}) (bool, error) {
		        
	return true, nil
}


    

func (fe *Execution) El_Start___14aeFunc(actionArgsMap map[string]interface{}) (bool, error) {
	stateChangeSuccessful := fe.El_Start___14aeChangeActiveState()

	if !stateChangeSuccessful {
		return false, nil
	}


	fe.El_Start___14ae_PerformConstraintValidation(actionArgsMap) 

	return true, nil

}

    
    
func (fe *Execution) El_End___b56bChangeActiveState() bool {
	if !fe.State.El_End___b56bActive {
		return false
	}

	// previous elements <- false
	fe.State.El_End___b56bActive = false

	fe.State.TerminationActivated = true

    return true
}

func (fe *Execution) El_End___b56b_PerformConstraintValidation(actionArgsMap map[string]interface{}) (bool, error) {
		        
	return true, nil
}


    

func (fe *Execution) El_End___b56bFunc(actionArgsMap map[string]interface{}) (bool, error) {
	stateChangeSuccessful := fe.El_End___b56bChangeActiveState()

	if !stateChangeSuccessful {
		return false, nil
	}


	fe.El_End___b56b_PerformConstraintValidation(actionArgsMap) 

	return true, nil

}

func (fe *Execution) El_Parallelism___036dFunc() bool {

    // previous elements <- false

        // next elements <- true
    fe.State.El_a___2551Active = true

    fe.State.El_b___fff2Active = true

    return true
}

    
    
func (fe *Execution) El_f___8235ChangeActiveState() bool {
	if !fe.State.El_f___8235Active {
		return false
	}

	// previous elements <- false
	fe.State.El_f___8235Active = false

	// next elements <- true
	fe.State.El_End___b56bActive = true

    return true
}

func (fe *Execution) El_f___8235_PerformConstraintValidation(actionArgsMap map[string]interface{}) (bool, error) {
		        
	return true, nil
}


    

func (fe *Execution) El_f___8235Func(actionArgsMap map[string]interface{}) (bool, error) {
	stateChangeSuccessful := fe.El_f___8235ChangeActiveState()

	if !stateChangeSuccessful {
		return false, nil
	}


	fe.El_f___8235_PerformConstraintValidation(actionArgsMap) 

	return true, nil

}

    
    
func (fe *Execution) El_e___e20bChangeActiveState() bool {
	if !fe.State.El_e___e20bActive {
		return false
	}

	// previous elements <- false
	fe.State.El_e___e20bActive = false

	// next elements <- true
	fe.State.El_f___8235Active = true

    return true
}

func (fe *Execution) El_e___e20b_PerformConstraintValidation(actionArgsMap map[string]interface{}) (bool, error) {
		 
    fe.State.El_e___e20bVar.ElementExecutionCompleted = true
    fe.State.El_e___e20bVar.ElementConstraintsFulfilled = true
    
    var tmpC_HeightUSL = actionArgsMap["C_HeightUSL"].(float64)
    fe.State.El_e___e20bVar.C_HeightUSL = tmpC_HeightUSL

	isFulfilledEl_e___e20b_C_HeightUSL_lte := fe.El_e___e20b__ValidateC_HeightUSL_lteFunc(tmpC_HeightUSL)
   	
	if isFulfilledEl_e___e20b_C_HeightUSL_lte {
		fe.State.El_e___e20bVar.C_HeightUSLFulfilled = true
	} else {
        fe.State.El_e___e20bVar.C_HeightUSLFulfilled = false
        fe.State.ConstraintsFulfilled = false
        fe.State.El_e___e20bVar.ElementConstraintsFulfilled = false
	} 	            

    
    var tmpC_HeightLSL = actionArgsMap["C_HeightLSL"].(float64)
    fe.State.El_e___e20bVar.C_HeightLSL = tmpC_HeightLSL

	isFulfilledEl_e___e20b_C_HeightLSL_gte := fe.El_e___e20b__ValidateC_HeightLSL_gteFunc(tmpC_HeightLSL)
   	
	if isFulfilledEl_e___e20b_C_HeightLSL_gte {
		fe.State.El_e___e20bVar.C_HeightLSLFulfilled = true
	} else {
        fe.State.El_e___e20bVar.C_HeightLSLFulfilled = false
        fe.State.ConstraintsFulfilled = false
        fe.State.El_e___e20bVar.ElementConstraintsFulfilled = false
	} 	            

    
    var tmpC_WidthUSL = actionArgsMap["C_WidthUSL"].(float64)
    fe.State.El_e___e20bVar.C_WidthUSL = tmpC_WidthUSL

	isFulfilledEl_e___e20b_C_WidthUSL_lte := fe.El_e___e20b__ValidateC_WidthUSL_lteFunc(tmpC_WidthUSL)
   	
	if isFulfilledEl_e___e20b_C_WidthUSL_lte {
		fe.State.El_e___e20bVar.C_WidthUSLFulfilled = true
	} else {
        fe.State.El_e___e20bVar.C_WidthUSLFulfilled = false
        fe.State.ConstraintsFulfilled = false
        fe.State.El_e___e20bVar.ElementConstraintsFulfilled = false
	} 	            

    
    var tmpC_DepthLSL = actionArgsMap["C_DepthLSL"].(float64)
    fe.State.El_e___e20bVar.C_DepthLSL = tmpC_DepthLSL

	isFulfilledEl_e___e20b_C_DepthLSL_gte := fe.El_e___e20b__ValidateC_DepthLSL_gteFunc(tmpC_DepthLSL)
   	
	if isFulfilledEl_e___e20b_C_DepthLSL_gte {
		fe.State.El_e___e20bVar.C_DepthLSLFulfilled = true
	} else {
        fe.State.El_e___e20bVar.C_DepthLSLFulfilled = false
        fe.State.ConstraintsFulfilled = false
        fe.State.El_e___e20bVar.ElementConstraintsFulfilled = false
	} 	            

         
    fe.State.El_e___e20bVar.IP_Box_cdfa_ID = actionArgsMap["IP_Box_cdfa_ID"].(string)

	return true, nil
}

func (fe *Execution) El_e___e20b__ValidateC_HeightUSL_lteFunc(parC_HeightUSL float64) bool {
	if parC_HeightUSL <= 0.365 {
		return true
	} else {
		return false
	}
}
func (fe *Execution) El_e___e20b__ValidateC_HeightLSL_gteFunc(parC_HeightLSL float64) bool {
	if parC_HeightLSL >= 0.355 {
		return true
	} else {
		return false
	}
}
func (fe *Execution) El_e___e20b__ValidateC_WidthUSL_lteFunc(parC_WidthUSL float64) bool {
	if parC_WidthUSL <= 0.365 {
		return true
	} else {
		return false
	}
}
func (fe *Execution) El_e___e20b__ValidateC_DepthLSL_gteFunc(parC_DepthLSL float64) bool {
	if parC_DepthLSL >= 0.145 {
		return true
	} else {
		return false
	}
}

    

func (fe *Execution) El_e___e20bFunc(actionArgsMap map[string]interface{}) (bool, error) {
	stateChangeSuccessful := fe.El_e___e20bChangeActiveState()

	if !stateChangeSuccessful {
		return false, nil
	}


	fe.El_e___e20b_PerformConstraintValidation(actionArgsMap) 

	return true, nil

}

