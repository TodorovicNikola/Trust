package com.trust40.col_pro_lan.generator.util;

public interface Templates {
    String IP_FLOW_EXECUTION_FTL = "flow/ip/flow_execution.ftl";
    String IP_FLOW_EXECUTION_STATE_FTL = "flow/ip/flow_execution_state.ftl";
    String IP_FLOW_STATE_TRANSITION_TEST_FTL = "flow/ip/test_state_transition.ftl";
    String IP_FLOW_LOGICAL_CONDITION_BVA_TEST_FTL = "flow/ip/test_logical_conditions_bva.ftl";
    String IP_FLOW_LOGICAL_CONDITION_PBT_TEST_FTL = "flow/ip/test_logical_conditions_pbt.ftl";

    
    String CBP_FLOW_EXECUTION_FTL = "flow/cbp/flow_execution.ftl";
    String CBP_FLOW_EXECUTION_STATE_FTL = "flow/cbp/flow_execution_state.ftl";
    String CBP_FLOW_STATE_TRANSITION_TEST_FTL = "flow/cbp/test_state_transition.ftl";
    String CBP_FLOW_LOGICAL_CONDITION_BVA_TEST_FTL = "flow/cbp/test_logical_conditions_bva.ftl";
    String CBP_FLOW_LOGICAL_CONDITION_PBT_TEST_FTL = "flow/cbp/test_logical_conditions_pbt.ftl";

}
