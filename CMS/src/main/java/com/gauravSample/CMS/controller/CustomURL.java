package com.gauravSample.CMS.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CustomURL {

    @RequestMapping(value = "/")
    public String application(){
        return "Application is working";
    }
}
