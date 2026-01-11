package com.trust40.multi_pro_lan.generator.hyperledger.golang;

import freemarker.template.Template;
import freemarker.template.TemplateException;
import com.trust40.multi_pro_lan.generator.util.FreeMarkerGeneratorConfig;
import com.trust40.multi_pro_lan.generator.util.Templates;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.util.Map;

import static com.trust40.multi_pro_lan.generator.util.PathFormats.PATH_FORMAT_FLOW_EXECUTION;

public class HyperledgerGolangGenerator {
    public static void generateForIP(Map<String, Object> valueMap) {
        String pathFlowExecutionState = String.format(PATH_FORMAT_FLOW_EXECUTION, "masl", "flow_execution_state");
        generateForTemplate(valueMap, pathFlowExecutionState, Templates.MASL_PPM_FLOW_EXECUTION_STATE_FTL);

        String pathFlowExecution = String.format(PATH_FORMAT_FLOW_EXECUTION, "masl", "flow_execution");
        generateForTemplate(valueMap, pathFlowExecution, Templates.MASL_PPM_FLOW_EXECUTION_FTL);
    }

    public static void generateForCBP(Map<String, Object> valueMap) {
        String pathFlowExecutionState = String.format(PATH_FORMAT_FLOW_EXECUTION, "cbp", "flow_execution_state");
        generateForTemplate(valueMap, pathFlowExecutionState, Templates.CBP_FLOW_EXECUTION_STATE_FTL);

        String pathFlowExecution = String.format(PATH_FORMAT_FLOW_EXECUTION, "cbp", "flow_execution");
        generateForTemplate(valueMap, pathFlowExecution, Templates.CBP_FLOW_EXECUTION_FTL);
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
