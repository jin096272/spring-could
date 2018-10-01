package com.configclient.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
class HelloController {
    @Value("${username}")
    private String username;

    @RequestMapping("/hello")
    public String from() {
        return this.username;
    }
}