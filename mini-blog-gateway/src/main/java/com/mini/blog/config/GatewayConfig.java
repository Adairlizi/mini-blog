package com.mini.blog.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;

/**
 * @author Administrator
 * @version 1.0
 * @description: TODO
 * @date 2022/4/5 11:43
 */
@Configuration
public class GatewayConfig {

    @Value("${spring.cloud.nacos.server-addr}")
    public void setNacosServerAddr(String nacosServerAddr){
            this.setNacosServerAddr(nacosServerAddr);
    }
}
