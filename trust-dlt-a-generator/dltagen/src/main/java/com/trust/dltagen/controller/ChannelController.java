package com.trust.dltagen.controller;

import com.trust.dltagen.dto.ChannelProcessDTO;
import com.trust.dltagen.model.Channel;
import com.trust.dltagen.service.ChannelService;
import freemarker.template.TemplateException;
import org.springframework.core.io.InputStreamResource;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("channel")
public class ChannelController {

    private final ChannelService service;

    public ChannelController(ChannelService service) {
        this.service = service;
    }

    @PostMapping("")
    public ChannelProcessDTO processChannel(@RequestParam("channel") MultipartFile file) {
        return service.process(file);
    }

    @GetMapping("{id}/artifacts")
    public ResponseEntity<InputStreamResource> getArtifacts(@PathVariable String id) throws TemplateException, IOException {
        byte[] bytes = service.getArtifacts(id);

        InputStreamResource body = new InputStreamResource(new ByteArrayInputStream(bytes));

        return ResponseEntity.ok().contentType(MediaType.parseMediaType("application/zip"))
                .header("Content-Disposition", "attachment; filename=artifacts.zip")
                .body(body);
    }

    @GetMapping()
    public List<ChannelProcessDTO> getAll() {
        List<Channel> channels = service.getAll();
        List<ChannelProcessDTO> ret = new ArrayList<>();
        channels.forEach(ch -> ret.add(new ChannelProcessDTO(ch)));

        return ret;
    }

    @GetMapping("/{id}")
    public ChannelProcessDTO getById(@PathVariable String id) {
        Channel found = service.getById(id);
        return new ChannelProcessDTO(found);
    }
}
