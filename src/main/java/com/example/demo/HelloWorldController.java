package com.example.demo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {

    private static final Logger logger = LoggerFactory.getLogger(HelloWorldController.class);

    private final HelloWorldService helloWorldService;
    private final ConfigProperties configProperties;

    public HelloWorldController(HelloWorldService helloWorldService, ConfigProperties configProperties) {
        this.helloWorldService = helloWorldService;
        this.configProperties = configProperties;
    }

    @GetMapping("/say-hello/{person}")
    public String sayHello(@PathVariable("person") String person) {
        return this.helloWorldService.sayHello(person);
    }

    @GetMapping("/feature-flags")
    public ConfigProperties getProperties() {
        return this.configProperties;
    }
}
