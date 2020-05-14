package com.zyz.service.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class test {
    @GetMapping("/index")
    public String hello(@RequestParam String userName) {
        return "Hello,Welcome service2 " + userName;
    }
}
