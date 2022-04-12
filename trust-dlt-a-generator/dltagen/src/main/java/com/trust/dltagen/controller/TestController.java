package com.trust.dltagen.controller;

import com.trust.dltagen.service.TemplateService;
import freemarker.template.TemplateException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;

@RestController
@RequestMapping("test")
public class TestController {

    @Autowired
    private TemplateService service;

    @GetMapping("")
    public void test() throws IOException, TemplateException {
        //service.test();
    }
}
