package chaincode

import (
	"encoding/json"
	"fmt"

	"github.com/hyperledger/fabric-samples/asset-transfer-basic/chaincode-go/chaincode/flow"

	"github.com/hyperledger/fabric-contract-api-go/contractapi"
)

// SmartContract provides functions for managing production batches
type SmartContract struct {
	contractapi.Contract
}

// InitLedger adds a base set of materials to the ledger
func (s *SmartContract) InitFlowExecution(ctx contractapi.TransactionContextInterface, id string) error {
	flowExecution := flow.NewFlowExecution(id)

	flowExecutionStateJSON, err := json.Marshal(flowExecution)
	if err != nil {
		return err
	}

	err = ctx.GetStub().PutState(id, flowExecutionStateJSON) // TODO: how to determine world state id?
	if err != nil {
		return fmt.Errorf("failed to put to world State. %v", err)
	}

	return nil
}

// GetAllMaterials returns all materials found in world State
func (s *SmartContract) GetAllFlowExecutions(ctx contractapi.TransactionContextInterface) ([]*flow.Execution, error) {
	// range query with empty string for startKey and endKey does an
	// open-ended query of all assets in the chaincode namespace.
	resultsIterator, err := ctx.GetStub().GetStateByRange("", "")
	if err != nil {
		return nil, err
	}
	defer resultsIterator.Close()

	var flowExecutions []*flow.Execution
	for resultsIterator.HasNext() {
		queryResponse, err := resultsIterator.Next()
		if err != nil {
			return nil, err
		}

		var flowExecution flow.Execution
		err = json.Unmarshal(queryResponse.Value, &flowExecution)
		if err != nil {
			return nil, err
		}
		flowExecutions = append(flowExecutions, &flowExecution)
	}

	return flowExecutions, nil
}

type ActionExecutionDto struct {
	ID         string                 `json:"ID"`
	Action     string                 `json:"Action"`
	ActionArgs map[string]interface{} `json:"ActionArgs"`
}

func (s *SmartContract) ExecuteActionOnFlow(ctx contractapi.TransactionContextInterface, actionExecutionDto ActionExecutionDto) (*flow.Execution, error) {
	FlowExecutionJSON, err := ctx.GetStub().GetState(actionExecutionDto.ID)
	if err != nil {
		return nil, fmt.Errorf("failed to read from world State: %v", err)
	}
	if FlowExecutionJSON == nil {
		return nil, fmt.Errorf("the flow execution with id %s does not exist", actionExecutionDto.ID)
	}

	var flowExecution flow.Execution
	err = json.Unmarshal(FlowExecutionJSON, &flowExecution)
	if err != nil {
		return nil, err
	}

	err = flowExecution.Execute(actionExecutionDto.Action, actionExecutionDto.ActionArgs)
	if err != nil {
		return nil, err
	}

	flowExecutionJSON, err := json.Marshal(flowExecution)
	if err != nil {
		return nil, err
	}

	err = ctx.GetStub().PutState(flowExecution.ID, flowExecutionJSON)
	if err != nil {
		return nil, fmt.Errorf("failed to put to world State. %v", err)
	}

	return &flowExecution, nil
}

type CountDto struct {
	CBP_ID string `json:"CBP_ID"`
	Count  int    `json:Count`
}

// ReadFlowExecutionState returns the current flow execution state stored in the world State with given id.
func (s *SmartContract) ReadIPFlowCount(ctx contractapi.TransactionContextInterface, id string) (*CountDto, error) {

	params := []string{"GetSuccessfulFlowExecutionCount", "cbp_fe1"}
	queryArgs := make([][]byte, len(params))
	for i, arg := range params {
		queryArgs[i] = []byte(arg)
	}

	response := ctx.GetStub().InvokeChaincode("ip-cc", queryArgs, "mychannel")

	var countDto CountDto
	err := json.Unmarshal(response.Payload, &countDto)
	if err != nil {
		return nil, err
	}

	return &countDto, nil
}
