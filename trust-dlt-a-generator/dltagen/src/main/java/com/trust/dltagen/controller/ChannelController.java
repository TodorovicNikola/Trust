package com.trust.dltagen.controller;

import com.trust.dltagen.dto.ChannelProcessDTO;
import com.trust.dltagen.service.ChannelService;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

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
}
