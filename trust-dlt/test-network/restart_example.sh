#!/bin/bash
./network.sh down
./network.sh up
./network.sh up createChannel -c mychannel -i 2.3.2
./network.sh deployCC -ccn cbp-cc
./network.sh deployCC -ccn ip-cc