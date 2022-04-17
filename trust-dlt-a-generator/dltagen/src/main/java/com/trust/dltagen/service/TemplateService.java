package com.trust.dltagen.service;

import com.trust.dltagen.model.CertificateAuthority;
import com.trust.dltagen.model.Organization;
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

    public byte[] getCAEnrollmentScript(Organization organization, String pemFilePath, String caClientHome, String peerHome) throws IOException, TemplateException {
        Template tmpl = TemplateUtil.getTemplate("ca-enroll.tmpl");
        Map<String, Object> input = new HashMap<>();
        input.put("organization", organization);
        input.put("FABRIC_CA_CLIENT_HOME", caClientHome);
        input.put("PEER_HOME", peerHome);
        input.put("PEM_FILE", pemFilePath);

        return getTemplateData(tmpl, input);
    }

    public byte[] getCAConfig(String organizationName, CertificateAuthority ca) throws IOException, TemplateException {
        Template tmpl = TemplateUtil.getTemplate("ca-docker.tmpl");
        Map<String, Object> input = new HashMap<>();
        input.put("ca", ca);
        input.put("orgName", organizationName);

        return getTemplateData(tmpl, input);
    }

    private byte[] getTemplateData(Template template, Map<String, Object> input) throws IOException, TemplateException {
        try(ByteArrayOutputStream out = new ByteArrayOutputStream();
            OutputStreamWriter writer = new OutputStreamWriter(out)) {
            template.process(input, writer);

            return out.toByteArray();
        }
    }
}
