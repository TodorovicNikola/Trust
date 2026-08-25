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

def get_all_org_member_peer_endpoints_prepared():
    section_generator = get_org_sections()
    return ["          - " + section["peer_endpoint"] for section in section_generator]

TEMPLATE_PT1 = """
test:
    name: basic-contract-benchmark
    description: test benchmark
    workers:
      number: 25
    rounds:
    - label: readFlow
      description: Read flows benchmark
      txDuration: 100
      rateControl:
        type: maximum-rate
        opts:
          tps: 800
          step: 80
          sampleInterval: 20
          includeFailed: true
      workload:
        module: workload/readFlowStatus.js
        arguments:
          processes: 2
          contractId: ip-cc
        targetPeers:
"""
TEMPLATE_PT2 = """
    - label: writeFlow
      description: Write flows benchmark
      txDuration: 100
      rateControl:
        type: maximum-rate
        opts:
          tps: 800
          step: 80
          sampleInterval: 20
          includeFailed: true
      workload:
        module: workload/writeFlow.js
        arguments:
          processes: 8
          contractId: ip-cc
          errorRateStateTransition: 2
          errorRateValueError: 2
        targetPeers:
"""

with open(f"./output/benchmark_config.yaml", "w") as f:
    f.write(TEMPLATE_PT1)
    f.write("\n".join(get_all_org_member_peer_endpoints_prepared()))
    f.write(TEMPLATE_PT2)
    f.write("\n".join(get_all_org_member_peer_endpoints_prepared()))