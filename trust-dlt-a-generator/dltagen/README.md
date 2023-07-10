# DLT Artifact Generator - dltagen

## Prerequisites

1. MultiProLan parser jar as a dependency
2. A running Orderer node (TODO: more details)
3. Hyperledger Fabric's binary files available on path:
- [`fabric-ca-client`](https://github.com/hyperledger/fabric-ca/releases/tag/v1.5.2) v1.5.2
- [`configtxgen`](https://github.com/hyperledger/fabric/releases/tag/v2.4.0) v2.4.0
- [`osnadmin`](https://github.com/hyperledger/fabric/releases/tag/v2.4.0) v2.4.0
- [`peer`](https://github.com/hyperledger/fabric/releases/tag/v2.4.0) v2.4.0
3. Docker images
- `hyperledger/fabric-ca:1.5.2`
- `hyperledger/fabric-peer:2.4.0`
- `hyperledger/fabric-orderer:2.4.0`

## Process

1. CBP as an input is parsed by MultiProLan Parser which generates the Channel model with participating Organizations.
2. For each organization the user fills in additional information for the certificate authority (CA). The CA is then added to the organization.
3. Configuration files (docker-compose) gets generated for each CA config which is used by the DLT network administrator in order to create the CA instance on the network.
4. The generated public key file (ca-cert.pem) is further needed for cryptomaterial generation. The user uploads that file to the server and the server generates an archive consisting of all the cryptomaterials needed.
5. The network administrator extracts the archive, downloads the organization configuration file (docker-compose file) and creates the organization instance on the network.
