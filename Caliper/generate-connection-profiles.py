import configparser


TEMPLATE = """
---
name: {network_id}-{org_name}
version: 1.0.0

channels:
  {channel_name}:
    orderers:
      - {org_name}Orderer
    peers:
      {org_name}Peer1:
        endorsingPeer: true
        chaincodeQuery: true
        ledgerQuery: true
        eventSource: true

client:
  organization: {org_name}
  connection:
    timeout:
      peer:
        endorser: '300'

organizations:
  {org_name}:
    mspid: {member_id}
    peers:
    - {org_name}Peer1
    certificateAuthorities:
    - {org_name}CA

orderers:
  {org_name}Orderer:
    url: grpcs://{orderer_endpoint}
    grpcOptions:
      grpc-max-send-message-length: 4194304
    tlsCACerts:
      path: /home/ec2-user/managedblockchain-tls-chain.pem

peers:
  {org_name}Peer1:
    url: grpcs://{peer_endpoint}
    tlsCACerts:
      path: /home/ec2-user/managedblockchain-tls-chain.pem
    grpcOptions:
      ssl-target-name-override: {peer_host}
      grpc.keepalive_time_ms: 600000

certificateAuthorities:
  {org_name}CA:
    url: {ca_endpoint}
    tlsCACerts:
      path: /home/ec2-user/managedblockchain-tls-chain.pem
    httpOptions:
      verify: false
    registrar:
      - enrollId: {admin_username}
        enrollSecret: {admin_password}"""


INI_FILE_PATH = "./organization-descriptions.ini"

config = configparser.ConfigParser()
config.read(INI_FILE_PATH)

for section in config.sections():
    if section == 'default':
        continue

    with open(f"./output/{config[section]['org_name']}/connection_profile.yaml", "w") as f:
        file_contents = TEMPLATE.format(network_id=config[section]['network_id'], member_id=config[section]['member_id'], org_name=config[section]['org_name'], orderer_endpoint=config[section]['orderer_endpoint'], peer_endpoint=config[section]['peer_endpoint'], peer_host=config[section]['peer_endpoint'].split(':')[0], ca_endpoint=config[section]['ca_endpoint'], admin_username=config[section]['admin_username'], admin_password=config[section]['admin_password'], channel_name=config[section]['channel_name'])
        f.write(file_contents)