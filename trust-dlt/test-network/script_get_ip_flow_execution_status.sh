# !/bin/bash
# set -x
cbp_id=$1
ip_id=$2
./invoke.sh ip-cc "{\"function\":\"GetFlowStatus\",\"Args\":[\"{\\\"CBP_ID\\\":\\\"$cbp_id\\\", \\\"IP_ID\\\":\\\"$ip_id\\\", \\\"Action\\\": \\\"None\\\", \\\"ActionArgs\\\": {}}\"]}"