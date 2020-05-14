package com.zyz.feign.controller;

import com.zyz.feign.client.ServiceFeignClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class test {
    @Autowired
    ServiceFeignClient serviceFeignClient;

    @GetMapping(value = "/testFeign")
    public String testFeign(@RequestParam String userName) {
        String result = serviceFeignClient.getIndex(userName);
        return result;
    }

    @GetMapping(value = "/index")
    public String testFeign() {
        return "result";
    }
}
