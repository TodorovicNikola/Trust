# !/bin/bash
set -x
cbp_id=$1

./invoke.sh cbp-cc "{\"function\":\"InitFlowExecution\",\"Args\":[\"$cbp_id\"]}"
# sleep 30
# ./invoke.sh cbp-cc "{\"function\":\"GetAllFlowExecutions\",\"Args\":[]}"
sleep 60
./invoke.sh cbp-cc "{\"function\":\"ExecuteActionOnFlow\",\"Args\":[\"{\\\"ID\\\":\\\"$cbp_id\\\", \\\"Action\\\": \\\"El_Start___aa98\\\", \\\"ActionArgs\\\": {}}\"]}"
sleep 60
./invoke.sh cbp-cc "{\"function\":\"ExecuteActionOnFlow\",\"Args\":[\"{\\\"ID\\\":\\\"$cbp_id\\\", \\\"Action\\\": \\\"El_ProduceWoodenBox___665b\\\", \\\"ActionArgs\\\": {}}\"]}"
sleep 60
./invoke.sh cbp-cc "{\"function\":\"ExecuteActionOnFlow\",\"Args\":[\"{\\\"ID\\\":\\\"$cbp_id\\\", \\\"Action\\\": \\\"El_ShipWoodenBox___9607\\\", \\\"ActionArgs\\\": {\\\"C_Pieces\\\": 5}}\"]}"
sleep 60
./invoke.sh cbp-cc "{\"function\":\"ExecuteActionOnFlow\",\"Args\":[\"{\\\"ID\\\":\\\"$cbp_id\\\", \\\"Action\\\": \\\"El_EngraveAcrylicFrontCov___418f\\\", \\\"ActionArgs\\\": {\\\"C_Pieces\\\": 5}}\"]}"
sleep 60
./invoke.sh cbp-cc "{\"function\":\"ExecuteActionOnFlow\",\"Args\":[\"{\\\"ID\\\":\\\"$cbp_id\\\", \\\"Action\\\": \\\"El_ShipFrontCover___6cc0\\\", \\\"ActionArgs\\\": {\\\"C_Pieces\\\": 5}}\"]}"
sleep 60
./invoke.sh cbp-cc "{\"function\":\"ExecuteActionOnFlow\",\"Args\":[\"{\\\"ID\\\":\\\"$cbp_id\\\", \\\"Action\\\": \\\"El_PackWineBottle___e71b\\\", \\\"ActionArgs\\\": {\\\"C_Pieces\\\": 5}}\"]}"
sleep 60
./invoke.sh cbp-cc "{\"function\":\"ExecuteActionOnFlow\",\"Args\":[\"{\\\"ID\\\":\\\"$cbp_id\\\", \\\"Action\\\": \\\"El_End___696a\\\", \\\"ActionArgs\\\": {}}\"]}"