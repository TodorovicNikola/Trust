package com.trust.dltagen.service;

import com.trust.dltagen.model.CcpType;
import com.trust.dltagen.model.CertificateAuthority;
import com.trust.dltagen.model.Channel;
import com.trust.dltagen.model.Organization;
import com.trust.dltagen.utils.FilesystemUtil;
import com.trust.dltagen.utils.TemplateUtil;
import freemarker.template.Template;
import freemarker.template.TemplateException;
import org.apache.tomcat.util.http.fileupload.ByteArrayOutputStream;
import org.springframework.stereotype.Service;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

@Service
public class TemplateService {

    private final FilesystemUtil filesystemUtil;

    public TemplateService(FilesystemUtil filesystemUtil) {
        this.filesystemUtil = filesystemUtil;
    }

    public byte[] getCAEnrollmentScript(Organization organization, String pemFilePath, String caClientHome, String peerHome) throws IOException, TemplateException {
        return getCAEnrollmentScript("ca-enroll.tmpl", organization, pemFilePath, caClientHome, peerHome);
    }
    public byte[] getOrdererCAEnrollmentScript(Organization organization, String pemFilePath, String caClientHome, String peerHome) throws TemplateException, IOException {
        return getCAEnrollmentScript("orderer-ca-enroll.tmpl", organization, pemFilePath, caClientHome, peerHome);
    }

    private byte[] getCAEnrollmentScript(String template, Organization organization, String pemFilePath, String caClientHome, String peerHome) throws IOException, TemplateException {
        Template tmpl = TemplateUtil.getTemplate(template);
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

    public byte[] getPeercfg(Organization organization) throws IOException, TemplateException {
        Template tmpl = TemplateUtil.getTemplate("core.tmpl");
        HashMap<String, Object> input = new HashMap<>();
        input.put("organization", organization);
        return getTemplateData(tmpl, input);
    }

    public byte[] getCCPjson(Organization organization) throws IOException, TemplateException {
        Template tmpl = TemplateUtil.getTemplate("ccp-json.tmpl");
        return getTemplateData(tmpl, getCCPdata(organization, CcpType.JSON));
    }

    public byte[] getCCPyaml(Organization organization) throws IOException, TemplateException {
        Template tmpl = TemplateUtil.getTemplate("ccp-yaml.tmpl");
        return getTemplateData(tmpl, getCCPdata(organization, CcpType.YAML));
    }

    private Map<String, Object> getCCPdata(Organization organization, CcpType type) throws IOException {
        Map<String, Object> input = new HashMap<>();
        input.put("organization", organization);

        List<String> peerpems = filesystemUtil.read("organizations/peerOrganizations/" + organization.getName() + "/tlsca/tlsca." + organization.getName() + "-cert.pem");
        List<String> capems = filesystemUtil.read("organizations/peerOrganizations/" + organization.getName() + "/ca/ca." + organization.getName() + "-cert.pem");

        String peerpem = "";
        String capem = "";

        if(type == CcpType.JSON) {
            peerpem = peerpems.stream().map(s -> s + "\\n").collect(Collectors.joining());
            capem = capems.stream().map(s -> s + "\\n").collect(Collectors.joining());
        } else {
            peerpem = peerpems.stream().map(s -> "          " + s + "\n").collect(Collectors.joining());
            capem = capems.stream().map(s -> "          " + s + "\n").collect(Collectors.joining());
        }

        input.put("PEERPEM", peerpem);
        input.put("CAPEM", capem);
        return input;
    }

    private byte[] getTemplateData(Template template, Map<String, Object> input) throws IOException, TemplateException {
        try(ByteArrayOutputStream out = new ByteArrayOutputStream();
            OutputStreamWriter writer = new OutputStreamWriter(out)) {
            template.process(input, writer);

            return out.toByteArray();
        }
    }

    public byte[] getConfig(Organization organization) throws IOException, TemplateException {
        Template tmpl = TemplateUtil.getTemplate("org-docker.tmpl");
        Map<String, Object> input = new HashMap<>();
        input.put("organization", organization);

        return getTemplateData(tmpl, input);
    }

    public byte[] getOrdererConfig(Organization organization) throws IOException, TemplateException {
        Template tmpl = TemplateUtil.getTemplate("orderer-docker.tmpl");
        Map<String, Object> input = new HashMap<>();
        input.put("organization", organization);

        return getTemplateData(tmpl, input);
    }

    public byte[] getConfigtx(Channel channel, Organization orderer) throws IOException, TemplateException {
        Template tmpl = TemplateUtil.getTemplate("configtx.tmpl");

        Map<String, Object> input = new HashMap<>();
        input.put("channel", channel);
        input.put("orderer", orderer);

        return getTemplateData(tmpl, input);
    }

    public byte[] getChannelArtifactScript(Channel channel, Organization orderer) throws IOException, TemplateException {
        Template tmpl = TemplateUtil.getTemplate("createChannel.tmpl");

        Map<String, Object> input = new HashMap<>();
        input.put("channel", channel);
        input.put("orderer", orderer);
        input.put("organization", channel.getOrganizations().get(0));

        return getTemplateData(tmpl, input);
    }
}
