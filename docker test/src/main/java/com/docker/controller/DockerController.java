package com.docker.controller;

import org.apache.log4j.Logger;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DockerController {

    Logger log=Logger.getLogger(DockerController.class);

    @GetMapping("/hello")
    public String hello(){
        log.info("controller:DockerController,method:hello");
        return "hello docker,this is my first test";
    }
}
