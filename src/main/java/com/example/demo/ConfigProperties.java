package com.example.demo;

import java.util.Optional;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import static java.util.Optional.ofNullable;

@Component
@ConfigurationProperties(prefix = "features")
public class ConfigProperties {

    private HelloWorldService helloWorldService;

    public Optional<HelloWorldService> getHelloWorldService() {
        return ofNullable(this.helloWorldService);
    }

    public void setHelloWorldService(HelloWorldService helloWorldService) {
        this.helloWorldService = helloWorldService;
    }

    public static class HelloWorldService {

        private boolean experimental;

        public boolean isExperimental() {
            return this.experimental;
        }

        public void setExperimental(boolean experimental) {
            this.experimental = experimental;
        }
    }
}
