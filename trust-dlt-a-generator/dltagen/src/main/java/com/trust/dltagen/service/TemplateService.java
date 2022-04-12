package com.trust.dltagen.service;

import com.trust.dltagen.model.CertificateAuthority;
import com.trust.dltagen.utils.TemplateUtil;
import freemarker.template.Template;
import freemarker.template.TemplateException;
import org.apache.tomcat.util.http.fileupload.ByteArrayOutputStream;
import org.springframework.stereotype.Service;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.HashMap;
import java.util.Map;

@Service
public class TemplateService {

    public byte[] getCAConfig(String organizationName, CertificateAuthority ca) throws IOException, TemplateException {
        Template tmpl = TemplateUtil.getTemplate("ca-template.tmpl");
        try(ByteArrayOutputStream out = new ByteArrayOutputStream();
                OutputStreamWriter writer = new OutputStreamWriter(out)) {

            Map<String, Object> input = new HashMap<>();
            input.put("ca", ca);
            input.put("orgName", organizationName);

            tmpl.process(input, writer);

            return out.toByteArray();
        }
    }
}
