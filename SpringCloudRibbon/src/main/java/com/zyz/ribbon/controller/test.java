package com.zyz.ribbon.controller;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class test {
    @Autowired
    RestTemplate restTemplate;

    private static final String URL = "http://Service-A";

    @RequestMapping(value = "/getRibbon")
    @HystrixCommand(fallbackMethod = "ribbonFallBack")
    public String getIndex(@RequestParam("userName") String userName) {
        String result = this.restTemplate.getForObject(URL + "/index?userName="+userName, String.class);
        return result;
    }

    public String ribbonFallBack(@RequestParam("userName") String userName) {
        return "{\"status\":\"999\",\"msg\":\"服务调用失败\"}";
    }
}
