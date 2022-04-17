package com.trust.dltagen.controller;

import com.trust.dltagen.dto.ChannelProcessDTO;
import com.trust.dltagen.model.Channel;
import com.trust.dltagen.service.ChannelService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

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
