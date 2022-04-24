package com.mini.blog.user;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author Administrator
 * @version 1.0
 * @description: TODO
 * @date 2022/3/20 16:39
 */
@EnableDiscoveryClient
@SpringBootApplication
public class UserAppcation {

    public static void main(String[] args) {
        SpringApplication.run(UserAppcation.class,args);
    }
}
