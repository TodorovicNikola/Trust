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




docker exec cli peer chaincode invoke -C orgchannel -n cbp-cc -c '{"Args":["InitFlowExecution","b"]}' --peerAddresses nd-t2cfbfug3vgefite2aiaal5na4.m-dfvwe5sq4ndlpiroaf5wmqyosm.n-k37i3lbewvdy3ivdsi7ghjg6rm.managedblockchain.us-east-1.amazonaws.com:30004 --tlsRootCertFiles /opt/home/managedblockchain-tls-chain.pem --peerAddresses nd-m5b4pkiuubgljlyirnfa63gpqi.m-ymkv76jtfjelxfrllpo4y4ljlq.n-k37i3lbewvdy3ivdsi7ghjg6rm.managedblockchain.us-east-1.amazonaws.com:30006 --tlsRootCertFiles /opt/home/managedblockchain-tls-chain.pem -o orderer.n-k37i3lbewvdy3ivdsi7ghjg6rm.managedblockchain.us-east-1.amazonaws.com:30001 --cafile /opt/home/managedblockchain-tls-chain.pem --tls