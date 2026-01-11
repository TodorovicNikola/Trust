package flow

// ExecutionState struct
type ExecutionState struct {
    El_Start___ee01Active bool

    El_af3237e6_e858_44ed_9fc___39dfActive bool

    El_e___63adActive bool
    El_e___63adVar El_e___63adStruct

    El_End___e153Active bool

    El_d___af32Active bool
    El_d___af32Var El_d___af32Struct

    El_c___caccActive bool
    El_c___caccVar El_c___caccStruct

    El_b___1b86Active bool
    El_b___1b86Var El_b___1b86Struct

    El_a___2965Active bool
    El_a___2965Var El_a___2965Struct

    El_caccd44f_0668_4aff_985___58e5Active bool




	TerminationActivated bool
	ServicePropertiesFulfilled bool
}


type El_e___63adStruct struct {
    ElementExecutionCompleted bool
    ElementPropertiesFulfilled bool
    P_Pieces float64    			

    P_PiecesFulfilled bool
	P_Deadline string   			

    P_DeadlineFulfilled bool
}


type El_d___af32Struct struct {
    ElementExecutionCompleted bool
    ElementPropertiesFulfilled bool
    P_Pieces float64    			

    P_PiecesFulfilled bool
	P_Deadline string   			

    P_DeadlineFulfilled bool
}


type El_c___caccStruct struct {
    ElementExecutionCompleted bool
    ElementPropertiesFulfilled bool
    P_Pieces float64    			

    P_PiecesFulfilled bool
	P_Deadline string   			

    P_DeadlineFulfilled bool
}


type El_b___1b86Struct struct {
    ElementExecutionCompleted bool
    ElementPropertiesFulfilled bool
    P_Pieces float64    			

    P_PiecesFulfilled bool
	P_Deadline string   			

    P_DeadlineFulfilled bool
}


type El_a___2965Struct struct {
    ElementExecutionCompleted bool
    ElementPropertiesFulfilled bool
    P_Pieces float64    			

    P_PiecesFulfilled bool
	P_Deadline string   			

    P_DeadlineFulfilled bool
}


type CountDto struct {
	CBP_ID string `json:"CBP_ID"`
	Count  float64    `json:"Count"`
}