#!/bin/bash
set -x
./invoke.sh ip-cc '{"function":"InitFlowExecution","Args":["cbp_fe1", "ip_fe2"]}'
sleep 5
./invoke.sh ip-cc '{"function":"GetAllFlowExecutions","Args":["cbp_fe1"]}'
sleep 5
./invoke.sh ip-cc '{"function":"ExecuteActionOnFlow","Args":["{\"CBP_ID\":\"cbp_fe1\", \"IP_ID\":\"ip_fe2\", \"Action\": \"El_Start___7def\", \"ActionArgs\": {}}"]}'
sleep 5
./invoke.sh ip-cc '{"function":"ExecuteActionOnFlow","Args":["{\"CBP_ID\":\"cbp_fe1\", \"IP_ID\":\"ip_fe2\", \"Action\": \"El_SA01_SideAssembling_R____2d4e\", \"ActionArgs\": { \"C_t\": 0.58, \"IP_Rightside_6dc4_ID\": \"id1\", \"IP_Upperside_6dc4_ID\": \"id2\"}}"]}'
sleep 5
./invoke.sh ip-cc '{"function":"ExecuteActionOnFlow","Args":["{\"CBP_ID\":\"cbp_fe1\", \"IP_ID\":\"ip_fe2\", \"Action\": \"El_SA01_SideAssembling_L____bdc3\", \"ActionArgs\": { \"C_t\": 0.585, \"IP_Bottomside_6dc4_ID_1\": \"id3\", \"IP_Bottomside_6dc4_ID_2\": \"id4\", \"IP_Leftside_6dc4_ID\": \"id5\"}}"]}'
sleep 5
./invoke.sh ip-cc '{"function":"ExecuteActionOnFlow","Args":["{\"CBP_ID\":\"cbp_fe1\", \"IP_ID\":\"ip_fe2\", \"Action\": \"El_FA01_FrameAssembling___6d9c\", \"ActionArgs\": {}}"]}'
sleep 5
./invoke.sh ip-cc '{"function":"ExecuteActionOnFlow","Args":["{\"CBP_ID\":\"cbp_fe1\", \"IP_ID\":\"ip_fe2\", \"Action\": \"El_BAH01_BackSideHammerin___a27d\", \"ActionArgs\": {}}"]}'
sleep 5
./invoke.sh ip-cc '{"function":"ExecuteActionOnFlow","Args":["{\"CBP_ID\":\"cbp_fe1\", \"IP_ID\":\"ip_fe2\", \"Action\": \"El_BI01_BoxInspection___6ee4\", \"ActionArgs\": {\"C_WidthDev\": 0.8, \"C_HeightDev\": 1.0, \"C_DeptDev\": 0.1, \"IP_Box_decd_ID\": \"id6\"}}"]}'
sleep 5
# either
./invoke.sh ip-cc '{"function":"ExecuteActionOnFlow","Args":["{\"CBP_ID\":\"cbp_fe1\", \"IP_ID\":\"ip_fe2\", \"Action\": \"El_PA01_Packaging___8f3d\", \"ActionArgs\": {}}"]}'
# or
#./invoke.sh ip-cc '{"function":"ExecuteActionOnFlow","Args":["{\"CBP_ID\":\"cbp_fe1\", \"IP_ID\":\"ip_fe2\", \"Action\": \"El_NT_SQ_04_PI001_Discard___bdec\", \"ActionArgs\": {}}"]}'
sleep 5
./invoke.sh ip-cc '{"function":"ExecuteActionOnFlow","Args":["{\"CBP_ID\":\"cbp_fe1\", \"IP_ID\":\"ip_fe2\", \"Action\": \"El_End___ff1b\", \"ActionArgs\": {}}"]}'


./invoke.sh ip-cc '{"function":"GetFlowExecutionCount","Args":["cbp_fe1"]}'