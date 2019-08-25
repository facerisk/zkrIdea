package com.example.zhuce;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class ZhuceApplication {

    public static void main(String[] args) {
        SpringApplication.run(ZhuceApplication.class, args);
    }

}
