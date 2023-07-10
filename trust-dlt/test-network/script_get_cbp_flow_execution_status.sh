# !/bin/bash
# set -x
cbp_id=$1
./invoke.sh cbp-cc "{\"function\":\"GetFlowStatus\",\"Args\":[\"{\\\"ID\\\":\\\"$cbp_id\\\", \\\"Action\\\": \\\"None\\\", \\\"ActionArgs\\\": {}}\"]}"