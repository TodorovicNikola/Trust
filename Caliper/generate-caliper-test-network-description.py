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


def generate_base_part_fn():
    base_part_template = """
name: Caliper Benchmarks
version: "2.0.0"

caliper:
  blockchain: fabric

channels:
- channelName: {channel_name}
  contracts:
"""

    org1_section = get_org1_section()
    base = base_part_template.format(channel_name=org1_section["channel_name"])
    for sc_name in org1_section["sc_names"].split(","):
        base += f"    - id: {sc_name}\n"

    return base


def generate_organizations_fn():
    org_template = """
  - mspid: {member_id}
    identities:
      certificates:
      - name: {admin_username}
        admin: true
        clientPrivateKey:
          path: '/home/ec2-user/{org_name}/admin-msp/keystore/{private_key_file_name}'
        clientSignedCert:
          path: '/home/ec2-user/{org_name}/admin-msp/signcerts/cert.pem'
    connectionProfile:
      path: '/home/ec2-user/{org_name}/connection_profile.yaml'
"""
    ret_val = "\norganizations:"
    section_generator = get_org_sections()
    for section in section_generator:
        ret_val += org_template.format(member_id=section["member_id"], admin_username=section["admin_username"], org_name=section["org_name"], private_key_file_name=section["private_key_file_name"], )

    return ret_val


def generate_clients_fn():
    client_template = """
  - client:
      organization: {member_id}
      identity: {admin_username}
"""
    ret_val = "\nclients:"
    section_generator = get_org_sections()
    for section in section_generator:
        ret_val += client_template.format(member_id=section["member_id"], admin_username=section["admin_username"])

    return ret_val

FILE_SECTIONS = [
    generate_base_part_fn,
    generate_organizations_fn,
    generate_clients_fn,
    ]


sections = ""
for fn in FILE_SECTIONS:
    fn_section = fn()
    sections += fn_section

with open(f"./output/test-network.yaml", "w") as f:
    f.write(sections)