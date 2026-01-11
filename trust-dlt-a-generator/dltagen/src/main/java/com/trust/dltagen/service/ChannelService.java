package com.trust.dltagen.service;

import com.trust.dltagen.dto.ChannelProcessDTO;
import com.trust.dltagen.model.Channel;
import com.trust.dltagen.model.ChannelStatus;
import com.trust.dltagen.model.Organization;
import com.trust.dltagen.model.OrganizationStatus;
import com.trust.dltagen.repository.ChannelRepository;
import com.trust40.multi_pro_lan.parser.impl.CBPParser;
import com.trust40.multi_pro_lan.parser.model.VirtualOrganization;
import freemarker.template.TemplateException;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;
import org.xml.sax.SAXException;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.xpath.XPathExpressionException;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@Service
public class ChannelService {

    private final ChannelRepository repository;
    private final OrganizationService organizationService;

    private final OrdererService ordererService;
    private final FileService fileService;

    private final TemplateService templateService;

    public ChannelService(ChannelRepository repository, OrganizationService organizationService, FileService multipartFileService, TemplateService templateService, OrdererService ordererService) {
        this.repository = repository;
        this.organizationService = organizationService;
        this.fileService = multipartFileService;
        this.templateService = templateService;
        this.ordererService = ordererService;
    }

    public ChannelProcessDTO process(MultipartFile multipartFile) {
        String filePath = fileService.store(multipartFile, "cbp");

        return process(filePath);
    }

    private ChannelProcessDTO process(String path) {
        Channel channel = parse(path);
        return process(channel);
    }

    private ChannelProcessDTO process(Channel channel) {
        ChannelProcessDTO processed = null;

        //TODO: set default orderer for channel

        if(repository.existsById(channel.getId())) {
            Channel existing = repository.getById(channel.getId());
            //TODO: channel already exists
        } else {
            //prepare new organization data
            channel.setStatus(ChannelStatus.NOT_CREATED);

            List<Organization> organizationList = new ArrayList<>();

            for (Organization organization: channel.getOrganizations()) {
                if(organizationService.existsById(organization.getId())) {
                    organizationList.add(organizationService.getById(organization.getId()));
                } else {
                    organization.setStatus(OrganizationStatus.NOT_CREATED);
                    organizationList.add(organization);
                }
            }

            channel.setOrganizations(organizationList);
            repository.save(channel);

            processed = new ChannelProcessDTO(channel);
        }

        return processed;
    }

    private Channel parse(String path) {
        CBPParser parser = new CBPParser();
        VirtualOrganization vo = null;
        try {
            vo = parser.parseVirtualOrganization(path);
        } catch (ParserConfigurationException|IOException|SAXException|XPathExpressionException e) {
            //TODO: exception handling
            e.printStackTrace();
        }

        return new Channel(vo);
    }

    public Channel getById(String id) {
        return repository.getById(id);
    }

    public List<Channel> getAll() {
        return repository.findAll();
    }

    public byte[] getArtifacts(String id) throws TemplateException, IOException {
        Channel channel = repository.getById(id);
        if(!channel.getOrganizations().stream().allMatch(organization -> organization.getStatus() == OrganizationStatus.UP)) {
            //TODO: throw error
            return null;
        }

        Organization orderer = ordererService.getOrderer();

        byte[] configtx = templateService.getConfigtx(channel, orderer);
        fileService.store("configtx.yaml", configtx, "channels", id, "config");
        byte[] artifactScript = templateService.getChannelArtifactScript(channel, orderer);
        fileService.store("createChannel.sh", artifactScript, "channels", id);

        byte[] zip = fileService.zipDir("channels" + File.separator + id);

        channel.setStatus(ChannelStatus.CREATED);
        repository.save(channel);

        return zip;
    }
}
