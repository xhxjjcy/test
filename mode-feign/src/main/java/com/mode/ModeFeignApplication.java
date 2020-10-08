package com.mode;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
@ServletComponentScan
@EnableDiscoveryClient
public class ModeFeignApplication {

    public static void main(String[] args) {
        SpringApplication.run(ModeFeignApplication.class,args);
    }
}
