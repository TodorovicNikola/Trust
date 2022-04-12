package com.trust.dltagen.utils;

import com.trust.dltagen.DltAGenApplication;
import freemarker.template.Configuration;
import freemarker.template.Template;
import freemarker.template.TemplateExceptionHandler;
import java.io.IOException;

public class TemplateUtil {

    private static Configuration instance;

    private TemplateUtil() {

    }

    public static Configuration getInstance() {
        if(instance == null) {
            instance = new Configuration(Configuration.VERSION_2_3_31);
            instance.setClassForTemplateLoading(DltAGenApplication.class, "/templates");
            instance.setTemplateExceptionHandler(TemplateExceptionHandler.RETHROW_HANDLER);
            instance.setLogTemplateExceptions(false);
            instance.setWrapUncheckedExceptions(true);
            instance.setFallbackOnNullLoopVariable(false);
        }

        return instance;
    }

    public static Template getTemplate(String name) throws IOException {
        return TemplateUtil.getInstance().getTemplate(name);
    }
}
