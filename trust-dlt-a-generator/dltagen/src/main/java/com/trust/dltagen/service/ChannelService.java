package com.trust.dltagen.service;

import com.trust.dltagen.dto.ChannelProcessDTO;
import com.trust.dltagen.model.Channel;
import com.trust.dltagen.model.ChannelStatus;
import com.trust.dltagen.model.Organization;
import com.trust.dltagen.model.OrganizationStatus;
import com.trust.dltagen.repository.ChannelRepository;
import com.trust.dltagen.utils.FilesystemUtil;
import com.trust40.multi_pro_lan.parser.impl.CBPParser;
import com.trust40.multi_pro_lan.parser.model.OrganizationRole;
import com.trust40.multi_pro_lan.parser.model.Pool;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;
import org.xml.sax.SAXException;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.xpath.XPathExpressionException;
import java.io.File;
import java.io.FileOutputStream;
import java.io.OutputStream;
import java.io.IOException;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

@Service
public class ChannelService {

    private final ChannelRepository repository;
    private final OrganizationService organizationService;
    private final FilesystemUtil fsUtil;

    public ChannelService(ChannelRepository repository, OrganizationService organizationService, FilesystemUtil fsUtil) {
        this.repository = repository;
        this.organizationService = organizationService;
        this.fsUtil = fsUtil;
    }

    public ChannelProcessDTO process(MultipartFile multipartFile) {
        String filePath = "";
        try {
            filePath = fsUtil.saveToFile(multipartFile.getBytes(), multipartFile.getOriginalFilename(), "cbp");
        } catch (IOException e) {
            //TODO: exception handling
            e.printStackTrace();
        }

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
        Pool pool = null;
        try {
            pool = parser.parsePool(path);
        } catch (ParserConfigurationException|IOException|SAXException|XPathExpressionException e) {
            //TODO: exception handling
            e.printStackTrace();
        }

        return new Channel(pool);
    }

}
