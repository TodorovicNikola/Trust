# TRUST_DLT

## Prerequisites
### Install Binaries and Docker Images
Using a terminal, position yourself into *TRUST_DLT* dir.

If there are no bin & config dirs, or HLF docker images are missing, then download binaries using:
```curl -sSL https://bit.ly/2ysbOFE | bash -s -- 2.2.15 1.5.9```
```curl -sSL https://bit.ly/2ysbOFE | bash -s -- 2.3.2 1.5.1```
```curl -sSL https://bit.ly/2ysbOFE | bash -s -- 2.5.14 1.5.15```

After that, export bin to PATH variable: ```export PATH=$PATH:$PWD/bin```

## Bringing up the Test Network
Position yourself to the test-network dir: ```cd test-network```


### Run test network and create a channel
```
./network.sh up
./network.sh up createChannel -c mychannel -i 2.3.2
./network.sh up createChannel -c mychannel -i 2.5.14
```
or run ``` ./network.sh ``` for more options.

### Deploy chaincode
```
./network.sh deployCC -ccn **chaincode_name*** (cbp-cc or ip-cc)
```
### Playing with the Chaincode Scenarios

To invoke a smart contract function, call:
```
./invoke.sh <cc_name> '{"function":<cc_fn>,"Args":<cc_args>}'
```

Important!: *./play_produce_wooden_box_scenario.sh* and *./play_winery_scenario.sh* can be used to run whole scenarios!

### Bring down the network
```
./network.sh down
```

## Using HLF Explorer

Using a terminal, position yourself into *hlf-explorer* dir.

From there, run ```docker-compose up```.
After the HLF Explorer is successfully initialized, go to *http://localhost:8080/*

```
Uname: exploreradmin
Pass: exploreradminpw
```

Prilikom ```docker-compose down```, iz nekog razloga ne pobrise volumes, pa moras to rucno uraditi:

```
docker volume rm hlf-explorer_pgdata
docker volume rm hlf-explorer_walletstore
```

## Using CouchDB Explorer

Go to *http://localhost:7984/_utils/*.

```
Uname: admin
Pass: adminpw
```