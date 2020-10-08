package com.docker.application;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication(exclude={DataSourceAutoConfiguration.class})
@ComponentScan(basePackages = {"com.docker"})
public class DockerApplication {
    public static void main(String[] args) {
        SpringApplication.run(DockerApplication.class,args);
    }
}
