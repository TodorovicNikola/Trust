#!/bin/bash
set -x
export PATH=$PWD/bin/:$PATH
export PATH=$PWD/config/:$PATH

cd ./test-network/
./play_winery_scenario.sh