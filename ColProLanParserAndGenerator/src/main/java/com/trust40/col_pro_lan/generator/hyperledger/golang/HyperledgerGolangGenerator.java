package com.trust40.col_pro_lan.generator.hyperledger.golang;

import freemarker.template.Template;
import freemarker.template.TemplateException;

import static com.trust40.col_pro_lan.generator.util.PathFormats.PATH_FORMAT_FLOW_EXECUTION;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.util.Map;

import com.trust40.col_pro_lan.generator.util.FreeMarkerGeneratorConfig;
import com.trust40.col_pro_lan.generator.util.Templates;

public class HyperledgerGolangGenerator {
    public static void generateForIP(Map<String, Object> valueMap) {
        String pathFlowExecutionState = String.format(PATH_FORMAT_FLOW_EXECUTION, "ip", "flow_execution_state");
        generateForTemplate(valueMap, pathFlowExecutionState, Templates.IP_FLOW_EXECUTION_STATE_FTL);

        String pathFlowExecution = String.format(PATH_FORMAT_FLOW_EXECUTION, "ip", "flow_execution");
        generateForTemplate(valueMap, pathFlowExecution, Templates.IP_FLOW_EXECUTION_FTL);
        
        String pathFlowStateTransitionTests = String.format(PATH_FORMAT_FLOW_EXECUTION, "ip", "t_state_transition_test");
        generateForTemplate(valueMap, pathFlowStateTransitionTests, Templates.IP_FLOW_STATE_TRANSITION_TEST_FTL);
        
        String pathLogicalConditionBVATests = String.format(PATH_FORMAT_FLOW_EXECUTION, "ip", "t_logical_conditions_bva_test");
        generateForTemplate(valueMap, pathLogicalConditionBVATests, Templates.IP_FLOW_LOGICAL_CONDITION_BVA_TEST_FTL);
        
        String pathLogicalConditionPBTTests = String.format(PATH_FORMAT_FLOW_EXECUTION, "ip", "t_logical_conditions_pbt_test");
        generateForTemplate(valueMap, pathLogicalConditionPBTTests, Templates.IP_FLOW_LOGICAL_CONDITION_PBT_TEST_FTL);
    }

    public static void generateForCBP(Map<String, Object> valueMap) {
        String pathFlowExecutionState = String.format(PATH_FORMAT_FLOW_EXECUTION, "cbp", "flow_execution_state");
        generateForTemplate(valueMap, pathFlowExecutionState, Templates.CBP_FLOW_EXECUTION_STATE_FTL);

        String pathFlowExecution = String.format(PATH_FORMAT_FLOW_EXECUTION, "cbp", "flow_execution");
        generateForTemplate(valueMap, pathFlowExecution, Templates.CBP_FLOW_EXECUTION_FTL);
        
        String pathFlowStateTransition = String.format(PATH_FORMAT_FLOW_EXECUTION, "cbp", "t_state_transition_test");
        generateForTemplate(valueMap, pathFlowStateTransition, Templates.CBP_FLOW_STATE_TRANSITION_TEST_FTL);
    }

    private static void generateForTemplate(Map<String, Object> valueMap, String path, String templatePath) {
        File file = new File(path);
        file.getParentFile().mkdirs();

        try (Writer fileWriter = new FileWriter(file)) {
            Template template = FreeMarkerGeneratorConfig.CONFIGURATION.getTemplate(templatePath);
            template.process(valueMap, fileWriter);

        } catch (IOException | TemplateException e) {
            e.printStackTrace();
        }
    }
}
