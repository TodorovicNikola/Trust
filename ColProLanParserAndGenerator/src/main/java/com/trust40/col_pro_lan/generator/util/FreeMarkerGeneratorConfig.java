package com.trust40.col_pro_lan.generator.util;

import freemarker.template.Configuration;
import freemarker.template.TemplateExceptionHandler;
import freemarker.template.Version;

import java.util.Locale;

import com.trust40.col_pro_lan.SCGeneratorApplication;

public class FreeMarkerGeneratorConfig {
    public static final Configuration CONFIGURATION = new Configuration(new Version(2, 3, 28));

    static {
        CONFIGURATION.setClassForTemplateLoading(SCGeneratorApplication.class, "/templates");
        CONFIGURATION.setDefaultEncoding("UTF-8");
        CONFIGURATION.setLocale(Locale.US);
        CONFIGURATION.setTemplateExceptionHandler(TemplateExceptionHandler.RETHROW_HANDLER);
    }
}
