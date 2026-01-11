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

def get_all_org_member_names_prepared():
    section_generator = get_org_sections()
    return ["'" + section["org_name"] + ".member'" for section in section_generator]

ORGANIZATION_TEMPLATE = """
  - &{org_name}
    Name: {member_id}
    ID: {member_id}
    SkipAsForeign: false
    Policies: &{org_name}Policies
      Readers:
        Type: Signature
        Rule: "{rule_readers}"
      Writers:
        Type: Signature
        Rule: "{rule_writers}"
      Admins:
        Type: Signature
        Rule: "OR('{org_name}.admin')"
    MSPDir: /opt/home/{org_name}/admin-msp
    AnchorPeers:
    - Host: {peer_host}
      Port: {peer_port}"""

def generate_organizations_fn():
    ret_val = """
Organizations:"""
    rule = f"OR({(', ').join(get_all_org_member_names_prepared())})"
    section_generator = get_org_sections()
    for section in section_generator:
        ret_val += ORGANIZATION_TEMPLATE.format(org_name=section["org_name"], member_id=section["member_id"], peer_host=section["peer_endpoint"].split(":")[0], peer_port=section["peer_endpoint"].split(":")[1], rule_readers=rule, rule_writers=rule)

    return ret_val


def generate_capabilities_channel_application_fn():
    RET_VAL = """
Capabilities:
  Channel: &ChannelCapabilities
    V2_0: true
  Orderer: &OrdererCapabilities
    V2_0: true
  Application: &ApplicationCapabilities
    V2_0: true
Channel: &ChannelDefaults
  Policies:
    Readers:
      Type: ImplicitMeta
      Rule: "ANY Readers"
    Writers:
      Type: ImplicitMeta
      Rule: "ANY Writers"
    Admins:
      Type: ImplicitMeta
      Rule: "MAJORITY Admins"
  Capabilities:
    <<: *ChannelCapabilities

Application: &ApplicationDefaults
  Policies: &ApplicationDefaultPolicies
    LifecycleEndorsement:
      Type: ImplicitMeta
      Rule: "ANY Readers"
    Endorsement:
      Type: ImplicitMeta
      Rule: "ANY Readers"
    Readers:
      Type: ImplicitMeta
      Rule: "ANY Readers"
    Writers:
      Type: ImplicitMeta
      Rule: "ANY Writers"
    Admins:
      Type: ImplicitMeta
      Rule: "MAJORITY Admins"
  Capabilities:
    <<: *ApplicationCapabilities"""
    return RET_VAL


def generate_profiles_fn():
    org1_section = get_org1_section()

    ret_val = ""
    base_part = """
Profiles:
  {channel_name}:
    <<: *ChannelDefaults
    Consortium: AWSSystemConsortium
    Application:
      <<: *ApplicationDefaults
      Organizations:
""".format(channel_name=org1_section["channel_name"])
    org_name_part = "        - *{org_name}\n"

    ret_val += base_part
    section_generator = get_org_sections()
    for section in section_generator:
        ret_val += org_name_part.format(org_name=section["org_name"])

    return ret_val


FILE_SECTIONS = [
    generate_organizations_fn,
    generate_capabilities_channel_application_fn,
    generate_profiles_fn,
    ]


sections = ""
for fn in FILE_SECTIONS:
    fn_section = fn()
    sections += fn_section

with open(f"./output/configtx.yaml", "w") as f:
    f.write(sections)