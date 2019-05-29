package com.example.demo;

import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.Bean;

@org.springframework.context.annotation.Configuration
public class Configuration {

    @Bean
    @ConditionalOnProperty(prefix = "features", name = "hello-world-service.experimental", matchIfMissing = true, havingValue = "false")
    public HelloWorldService helloWorldService(NameCapitalizer nameCapitalizer) {
        return new DefaultHelloWorldService(nameCapitalizer);
    }

    @Bean
    @ConditionalOnProperty(prefix = "features", name = "hello-world-service.experimental", havingValue = "true")
    public HelloWorldService experimentalHelloWorldService(NameCapitalizer nameCapitalizer) {
        return new ExperimentalHelloWorldService(nameCapitalizer);
    }
}
