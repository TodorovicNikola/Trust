package flow

// ExecutionState struct
type ExecutionState struct {
    El_FA01_FrameAssembling___6d9cActive bool

    El_BAH01_BackSideHammerin___a27dActive bool

    El_NT_SQ_04_PI001_Discard___bdecActive bool

    El_BI01_BoxInspection___6ee4Active bool
    El_BI01_BoxInspection___6ee4Var El_BI01_BoxInspection___6ee4Struct


    El_2d4ef802_435c_4bc4_96b___6ff1Active bool

    El_SA01_SideAssembling_L____bdc3Active bool
    El_SA01_SideAssembling_L____bdc3Var El_SA01_SideAssembling_L____bdc3Struct

    El_Start___7defActive bool

    El_bdc3eee5_8c52_47fa_a3e___e4b7Active bool


    El_PA01_Packaging___8f3dActive bool

    El_End___ff1bActive bool

    El_SA01_SideAssembling_R____2d4eActive bool
    El_SA01_SideAssembling_R____2d4eVar El_SA01_SideAssembling_R____2d4eStruct


	TerminationActivated bool
	ConstraintsFulfilled bool
}


type El_BI01_BoxInspection___6ee4Struct struct {
    C_WidthDev float64
    C_WidthDevFulfilled bool
    C_HeightDev float64
    C_HeightDevFulfilled bool
    C_DeptDev float64
    C_DeptDevFulfilled bool
    IP_Box_decd_ID string
}


type El_SA01_SideAssembling_L____bdc3Struct struct {
    C_t float64
    C_tFulfilled bool
    IP_Bottomside_6dc4_ID_1 string
    IP_Bottomside_6dc4_ID_2 string
    IP_Leftside_6dc4_ID string
}


type El_SA01_SideAssembling_R____2d4eStruct struct {
    C_t float64
    C_tFulfilled bool
}

