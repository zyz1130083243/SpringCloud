package com.zyz.feign.client;

import org.springframework.stereotype.Component;

/**
 * 熔断发生时处理
 */
@Component
public class ServiceFallback implements ServiceFeignClient {
    @Override
    public String getIndex(String userName) {
        return "{\"status\":\"999\",\"msg\":\"服务调用失败\"}";
    }
}
