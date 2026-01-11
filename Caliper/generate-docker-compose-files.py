import configparser

DC_FILE_TEMPLATE = """
version: '2.2'

services:
  cli:
    container_name: cli
    image: hyperledger/fabric-tools:2.2.3
    tty: true
    environment:
    - GOPATH=/opt/gopath
    - CORE_VM_ENDPOINT=unix:///host/var/run/docker.sock
    - FABRIC_LOGGING_SPEC=info
    - CORE_PEER_ID=cli
    - CORE_CHAINCODE_KEEPALIVE=10
    - CORE_PEER_TLS_ENABLED=true
    - CORE_PEER_TLS_ROOTCERT_FILE=/opt/home/managedblockchain-tls-chain.pem
    - CORE_PEER_LOCALMSPID={member_id}
    - CORE_PEER_MSPCONFIGPATH=/opt/home/{org_name}/admin-msp
    - CORE_PEER_ADDRESS={peer_endpoint}
    working_dir: /opt/home
    command: /bin/bash
    volumes:
    - /var/run/:/host/var/run/
    - /home/ec2-user/fabric-samples/chaincode:/opt/gopath/src/github.com/
    - /home/ec2-user:/opt/home
"""

INI_FILE_PATH = "./organization-descriptions.ini"

config = configparser.ConfigParser()
config.read(INI_FILE_PATH)

for section in config.sections():
    if section == 'default':
        continue

    with open(f"./output/{config[section]['org_name']}/docker-compose-cli.yaml", "w") as f:
        file_contents = DC_FILE_TEMPLATE.format(member_id=config[section]['member_id'], org_name=config[section]['org_name'], peer_endpoint=config[section]['peer_endpoint'])
        f.write(file_contents)
