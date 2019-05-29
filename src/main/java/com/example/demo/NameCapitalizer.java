package com.example.demo;

import org.springframework.stereotype.Component;
import org.springframework.util.StringUtils;

@Component
public class NameCapitalizer {

    private final ConfigProperties configProperties;

    public NameCapitalizer(ConfigProperties configProperties) {
        this.configProperties = configProperties;
    }

    public String capitalize(String name) {
        if (this.configProperties.getHelloWorldService().map(ConfigProperties.HelloWorldService::isExperimental).orElse(false)) {
            return StringUtils.capitalize(name);
        }
        return name;
    }
}
