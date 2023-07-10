package flow

// ExecutionState struct
type ExecutionState struct {
    El_ShipFrontCover___6cc0Active bool
    El_ShipFrontCover___6cc0Var El_ShipFrontCover___6cc0Struct

    El_ProduceWoodenBox___665bActive bool
    El_ProduceWoodenBox___665bVar El_ProduceWoodenBox___665bStruct

    El_960773f4_1339_4673_896___9ec9Active bool

    El_6cc01341_3547_459c_aa0___2ad6Active bool



    El_PackWineBottle___e71bActive bool
    El_PackWineBottle___e71bVar El_PackWineBottle___e71bStruct

    El_End___696aActive bool

    El_Start___aa98Active bool

    El_EngraveAcrylicFrontCov___418fActive bool
    El_EngraveAcrylicFrontCov___418fVar El_EngraveAcrylicFrontCov___418fStruct

    El_ShipWoodenBox___9607Active bool
    El_ShipWoodenBox___9607Var El_ShipWoodenBox___9607Struct


	TerminationActivated bool
	ConstraintsFulfilled bool
}


type El_ShipFrontCover___6cc0Struct struct {
    ElementExecutionCompleted bool
    ElementConstraintsFulfilled bool
    C_Pieces float64
    C_PiecesFulfilled bool
}


type El_ProduceWoodenBox___665bStruct struct {
    ElementExecutionCompleted bool
    ElementConstraintsFulfilled bool
    C_Pieces float64
    C_PiecesFulfilled bool
}


type El_PackWineBottle___e71bStruct struct {
    ElementExecutionCompleted bool
    ElementConstraintsFulfilled bool
    C_Pieces float64
    C_PiecesFulfilled bool
}


type El_EngraveAcrylicFrontCov___418fStruct struct {
    ElementExecutionCompleted bool
    ElementConstraintsFulfilled bool
    C_Pieces float64
    C_PiecesFulfilled bool
}


type El_ShipWoodenBox___9607Struct struct {
    ElementExecutionCompleted bool
    ElementConstraintsFulfilled bool
    C_Pieces float64
    C_PiecesFulfilled bool
}


type CountDto struct {
	CBP_ID string `json:"CBP_ID"`
	Count  float64    `json:Count`
}