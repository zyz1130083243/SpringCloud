package com.zyz.feign.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Component
@FeignClient(value = "Service-A", fallback = ServiceFallback.class)
//@FeignClient(value = "Service-A")
public interface ServiceFeignClient {
    @RequestMapping(value = "/index")
    String getIndex(@RequestParam("userName") String userName);
}
