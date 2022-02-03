#!/bin/bash
set -x
./invoke.sh cbp-cc '{"function":"InitFlowExecution","Args":["cbpfe1"]}'
sleep 5
./invoke.sh cbp-cc '{"function":"GetAllFlowExecutions","Args":[]}'
sleep 5
./invoke.sh cbp-cc '{"function":"ExecuteActionOnFlow","Args":["{\"ID\":\"cbpfe1\", \"Action\": \"El_Start___51d2\", \"ActionArgs\": {}}"]}' 