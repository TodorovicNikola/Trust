# TRUST_DLT

## Prerequisites
### Install Binaries and Docker Images
```curl -sSL https://bit.ly/2ysbOFE | bash -s -- 2.1.1 1.4.7 0.4.20 -s```

## Test Network
```sh
export PATH=$PATH:$PWD/bin
cd test-network
```
### Run test network and create a channel
```
./network.sh up createChannel -c mychannel -i 2.1.1
```
or run ``` ./network.sh ``` for more options.
### Deploy ```materials``` chaincode
```
./network.sh deployCC -ccn materials
```
### Init Ledger Materials
```
./invoke.sh materials '{"function":"InitLedgerMaterials","Args":[]}'
```

### Get All Materials
```
./invoke.sh materials '{"function":"GetAllMaterials","Args":[]}'
```

### Change Material State
```
./invoke.sh materials '{"function":"ChangeMaterialState","Args":["{\"ID\":\"material1\",\"state\":2}"]}'
```

###
```
./invoke.sh materials '{"function":"ReadMaterial","Args":["material1"]}'
```

### Bring down the network
```
./network.sh down
```