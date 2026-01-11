import configparser

INI_FILE_PATH = "./organization-descriptions.ini"

config = configparser.ConfigParser()
config.read(INI_FILE_PATH)

def get_org_sections():
    for section in config.sections():
        if section == 'default':
            continue

        yield config[section]

def get_org1_section():
    return config["org1"]


def run_initial_configs_fn():
    RET_VAL = """########## run_initial_configs_fn ##########
set -o xtrace

"""
    return RET_VAL


def download_cert_file_fn():
    DOWNLOAD_CERT_FILE = """########## download_cert_file_fn ##########
aws s3 cp s3://us-east-1.managedblockchain/etc/managedblockchain-tls-chain.pem /home/ec2-user/managedblockchain-tls-chain.pem

"""
    return DOWNLOAD_CERT_FILE

def enrol_admin_users_fn():
    ENROLL_ADMIN_USERS_TEMPLATE = """##### {org_name} #####
fabric-ca-client enroll -u 'https://{admin_username}:{admin_password}@{ca_endpoint}' --tls.certfiles /home/ec2-user/managedblockchain-tls-chain.pem -M /home/ec2-user/{org_name}/admin-msp

"""

    ret_val = "########## enrol_admin_users_fn ##########\n"
    section_generator = get_org_sections()
    for section in section_generator:
        ret_val += ENROLL_ADMIN_USERS_TEMPLATE.format(admin_username=section["admin_username"], admin_password=section["admin_password"], ca_endpoint=section["ca_endpoint"], org_name=section["org_name"])

    return ret_val


def copy_certificates_for_msp_fn():
    COPY_TEMPLATE = """##### {org_name} #####
cp -r /home/ec2-user/{org_name}/admin-msp/signcerts /home/ec2-user/{org_name}/admin-msp/admincerts

"""

    ret_val = "########## copy_certificates_for_msp_fn ##########\n"
    section_generator = get_org_sections()
    for section in section_generator:
        ret_val += COPY_TEMPLATE.format(org_name=section["org_name"])

    return ret_val


def generate_configtx_and_create_channel_fn():
    org1_section = get_org1_section()
    CMND_TEMPLATE = """########## generate_configtx_and_create_channel_fn ##########
##### {org_name} #####
docker-compose -f "./{org_name}/docker-compose-cli.yaml" up -d

docker exec cli configtxgen -outputCreateChannelTx /opt/home/{channel_name}.pb -profile {channel_name} -channelID {channel_name} --configPath /opt/home/

docker exec cli peer channel create -c {channel_name} -f /opt/home/{channel_name}.pb -o {orderer_endpoint} --cafile /opt/home/managedblockchain-tls-chain.pem --tls

docker-compose -f "./{org_name}/docker-compose-cli.yaml" down -v

"""

    return CMND_TEMPLATE.format(channel_name=org1_section["channel_name"], org_name=org1_section["org_name"], orderer_endpoint=org1_section["orderer_endpoint"])


def get_genesis_block_and_join_channel_fn():
    CMND_TEMPLATE = """##### {org_name} #####
docker-compose -f "./{org_name}/docker-compose-cli.yaml" up -d

docker exec cli peer channel fetch oldest /opt/home/{channel_name}.block -c {channel_name} -o {orderer_endpoint} --cafile /opt/home/managedblockchain-tls-chain.pem --tls

docker exec cli peer channel join -b /opt/home/{channel_name}.block -o {orderer_endpoint} --cafile /opt/home/managedblockchain-tls-chain.pem --tls

docker-compose -f "./{org_name}/docker-compose-cli.yaml" down -v

"""

    ret_val = "########## get_genesis_block_and_join_channel_fn ##########\n"
    section_generator = get_org_sections()
    for section in section_generator:
        ret_val += CMND_TEMPLATE.format(org_name=section["org_name"], channel_name=section["channel_name"], orderer_endpoint=section["orderer_endpoint"])

    return ret_val

def install_chaincode_fn():
    CMND_TEMPLATE_ORG1 = """
##### {org_name} #####
docker-compose -f "./{org_name}/docker-compose-cli.yaml" up -d

docker exec cli peer lifecycle chaincode install {sc_name}.tar.gz

PACKAGE_ID=$(docker exec cli peer lifecycle chaincode queryinstalled | sed -n 's/.*Package ID: \\([^,]*\\),.*/\\1/p')

echo $PACKAGE_ID

docker exec cli peer lifecycle chaincode approveformyorg --orderer {orderer_endpoint} --tls --cafile /opt/home/managedblockchain-tls-chain.pem --channelID {channel_name} --name {sc_name} --version v0 --sequence 1 --package-id $PACKAGE_ID

# docker exec cli peer lifecycle chaincode checkcommitreadiness --orderer {orderer_endpoint} --tls --cafile /opt/home/managedblockchain-tls-chain.pem --channelID {channel_name} --name {sc_name} --version v0 --sequence 1

docker-compose -f "./{org_name}/docker-compose-cli.yaml" down -v
"""

    CMND_TEMPLATE_NON_ORG1 = """
##### {org_name} #####
docker-compose -f "./{org_name}/docker-compose-cli.yaml" up -d

docker exec cli peer lifecycle chaincode install {sc_name}.tar.gz

docker exec cli peer lifecycle chaincode approveformyorg --orderer {orderer_endpoint} --tls --cafile /opt/home/managedblockchain-tls-chain.pem --channelID {channel_name} --name {sc_name} --version v0 --sequence 1 --package-id $PACKAGE_ID

# docker exec cli peer lifecycle chaincode checkcommitreadiness --orderer {orderer_endpoint} --tls --cafile /opt/home/managedblockchain-tls-chain.pem --channelID {channel_name} --name {sc_name} --version v0 --sequence 1

docker-compose -f "./{org_name}/docker-compose-cli.yaml" down -v
"""

    CMND_COMMIT_CC = """
docker-compose -f "./{org_name}/docker-compose-cli.yaml" up -d

docker exec cli peer lifecycle chaincode commit --orderer {orderer_endpoint} --tls --cafile /opt/home/managedblockchain-tls-chain.pem --channelID {channel_name} --name {sc_name} --version v0 --sequence 1

docker-compose -f "./{org_name}/docker-compose-cli.yaml" down -v
"""

    section_org1 = get_org1_section()

    ret_val = "########## install_chaincode_fn ##########"
    for sc_name in section_org1["sc_names"].split(","):
        ret_val += f"\n##### {sc_name} #####"
        section_generator = get_org_sections()
        for section in section_generator:
            if section["org_name"] == "org1":
                ret_val += CMND_TEMPLATE_ORG1.format(org_name=section["org_name"], channel_name=section["channel_name"], orderer_endpoint=section["orderer_endpoint"], sc_name=sc_name)
            else:
                ret_val += CMND_TEMPLATE_NON_ORG1.format(org_name=section["org_name"], channel_name=section["channel_name"], orderer_endpoint=section["orderer_endpoint"], sc_name=sc_name)

        ret_val += CMND_COMMIT_CC.format(org_name=section_org1["org_name"], channel_name=section_org1["channel_name"], orderer_endpoint=section_org1["orderer_endpoint"], sc_name=sc_name)

    return ret_val

BASH_FILE_SECTIONS = [
    run_initial_configs_fn,
    download_cert_file_fn,
    enrol_admin_users_fn,
    copy_certificates_for_msp_fn,
    generate_configtx_and_create_channel_fn,
    get_genesis_block_and_join_channel_fn,
    install_chaincode_fn,
    ]


commands = ""
for fn in BASH_FILE_SECTIONS:
    fn_commands = fn()
    commands += fn_commands

with open(f"./output/configure_network.sh", "w") as f:
    f.write(commands)
