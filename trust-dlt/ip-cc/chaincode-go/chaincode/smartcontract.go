package chaincode

import (
	"encoding/json"
	"fmt"

	"github.com/hyperledger/fabric-samples/asset-transfer-basic/chaincode-go/chaincode/flow"

	"github.com/hyperledger/fabric-contract-api-go/contractapi"
)

var indexName string = "cbp_id~ip_id"

// SmartContract provides functions for managing production batches
type SmartContract struct {
	contractapi.Contract
}

// InitLedger adds a base set of materials to the ledger
func (s *SmartContract) InitFlowExecution(ctx contractapi.TransactionContextInterface, cbp_id string, ip_id string) error {
	flowExecution := flow.NewFlowExecution(cbp_id, ip_id)

	colorNameIndexKey, err := ctx.GetStub().CreateCompositeKey(indexName, []string{cbp_id, ip_id})
	if err != nil {
		return err
	}

	flowExecutionStateJSON, err := json.Marshal(flowExecution)
	if err != nil {
		return err
	}

	err = ctx.GetStub().PutState(colorNameIndexKey, flowExecutionStateJSON)
	if err != nil {
		return fmt.Errorf("failed to put to world State. %v", err)
	}

	return nil
}

// GetAllFlowExecutions returns all flow executions for a given CBP_ID
func (s *SmartContract) GetAllFlowExecutions(ctx contractapi.TransactionContextInterface, cbp_id string) ([]*flow.Execution, error) {
	var keys []string
	keys = append(keys, cbp_id)
	resultsIterator, err := ctx.GetStub().GetStateByPartialCompositeKey(indexName, keys)
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

// GetFlowExecutionCount returns count of all flow executions for a given CBP_ID
func (s *SmartContract) GetFlowExecutionCount(ctx contractapi.TransactionContextInterface, cbp_id string) (*CountDto, error) {
	var keys []string
	keys = append(keys, cbp_id)
	resultsIterator, err := ctx.GetStub().GetStateByPartialCompositeKey(indexName, keys)
	if err != nil {
		return nil, err
	}
	defer resultsIterator.Close()

	var count int = 0
	for resultsIterator.HasNext() {
		resultsIterator.Next()
		count = count + 1
	}

	var countObj CountDto
	countObj.Count = count
	countObj.CBP_ID = cbp_id

	return &countObj, nil
}

// GetSuccessfulFlowExecutionCount returns count of all successful flow executions for a given CBP_ID
func (s *SmartContract) GetSuccessfulFlowExecutionCount(ctx contractapi.TransactionContextInterface, cbp_id string) (*CountDto, error) {
	var keys []string
	keys = append(keys, cbp_id)
	resultsIterator, err := ctx.GetStub().GetStateByPartialCompositeKey(indexName, keys)
	if err != nil {
		return nil, err
	}
	defer resultsIterator.Close()

	var count int = 0
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

		if flowExecution.State.TerminationActivated && flowExecution.State.ConstraintsFulfilled {
			count = count + 1
		}

	}

	var countObj CountDto
	countObj.Count = count
	countObj.CBP_ID = cbp_id

	return &countObj, nil
}

type ActionExecutionDto struct {
	CBP_ID     string                 `json:"CBP_ID"`
	IP_ID      string                 `json:"IP_ID"`
	Action     string                 `json:"Action"`
	ActionArgs map[string]interface{} `json:"ActionArgs"`
}

type CountDto struct {
	CBP_ID string `json:"CBP_ID"`
	Count  int    `json:Count`
}

func (s *SmartContract) ExecuteActionOnFlow(ctx contractapi.TransactionContextInterface, actionExecutionDto ActionExecutionDto) (*flow.Execution, error) {
	colorNameIndexKey, err := ctx.GetStub().CreateCompositeKey(indexName, []string{actionExecutionDto.CBP_ID, actionExecutionDto.IP_ID})
	if err != nil {
		return nil, fmt.Errorf("failed to create composite key: %v", err)
	}

	FlowExecutionJSON, err := ctx.GetStub().GetState(colorNameIndexKey)
	if err != nil {
		return nil, fmt.Errorf("failed to read from world State: %v", err)
	}
	if FlowExecutionJSON == nil {
		return nil, fmt.Errorf("the flow execution with id %s-%s does not exist", actionExecutionDto.CBP_ID, actionExecutionDto.IP_ID)
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

	err = ctx.GetStub().PutState(colorNameIndexKey, flowExecutionJSON)
	if err != nil {
		return nil, fmt.Errorf("failed to put to world State. %v", err)
	}

	return &flowExecution, nil
}
