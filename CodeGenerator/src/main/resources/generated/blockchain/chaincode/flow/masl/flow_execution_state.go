package flow

// ExecutionState struct
type ExecutionState struct {
    El_SA01_SideAssembling_L____bdc3Active bool
    El_SA01_SideAssembling_L____bdc3Var El_SA01_SideAssembling_L____bdc3Struct

    El_FA01_FrameAssembling___6d9cActive bool

    El_BAH01_BackSideHammerin___a27dActive bool

    El_BI01_BoxInspection___6ee4Active bool
    El_BI01_BoxInspection___6ee4Var El_BI01_BoxInspection___6ee4Struct

    El_Start___7defActive bool

    El_PA01_Packaging___8f3dActive bool

    El_End___ff1bActive bool

    El_SA01_SideAssembling_R____2d4eActive bool
    El_SA01_SideAssembling_R____2d4eVar El_SA01_SideAssembling_R____2d4eStruct


	TerminationActivated bool
	ConstraintsFulfilled bool
}


type El_SA01_SideAssembling_L____bdc3Struct struct {
    ElementExecutionCompleted bool
    ElementConstraintsFulfilled bool
    C_t float64
    C_tFulfilled bool
    IP_Bottomside_6dc4_ID_1 string
    IP_Bottomside_6dc4_ID_2 string
    IP_Leftside_6dc4_ID string
}


type El_FA01_FrameAssembling___6d9cStruct struct {
    ElementExecutionCompleted bool
    ElementConstraintsFulfilled bool
}


type El_BAH01_BackSideHammerin___a27dStruct struct {
    ElementExecutionCompleted bool
    ElementConstraintsFulfilled bool
}


type El_BI01_BoxInspection___6ee4Struct struct {
    ElementExecutionCompleted bool
    ElementConstraintsFulfilled bool
    C_WidthDev float64
    C_WidthDevFulfilled bool
    C_HeightDev float64
    C_HeightDevFulfilled bool
    C_DeptDev float64
    C_DeptDevFulfilled bool
    IP_Box_decd_ID string
}


type El_Start___7defStruct struct {
    ElementExecutionCompleted bool
    ElementConstraintsFulfilled bool
}


type El_PA01_Packaging___8f3dStruct struct {
    ElementExecutionCompleted bool
    ElementConstraintsFulfilled bool
}


type El_End___ff1bStruct struct {
    ElementExecutionCompleted bool
    ElementConstraintsFulfilled bool
}


type El_SA01_SideAssembling_R____2d4eStruct struct {
    ElementExecutionCompleted bool
    ElementConstraintsFulfilled bool
    C_t float64
    C_tFulfilled bool
}

