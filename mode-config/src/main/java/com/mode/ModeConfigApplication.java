package com.mode;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;


@SpringBootApplication
@EnableConfigServer
public class ModeConfigApplication {

    public static void main(String[] args) {
        SpringApplication.run(ModeConfigApplication.class,args);
    }
}
