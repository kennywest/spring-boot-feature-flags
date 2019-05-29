package com.example.demo;

public class DefaultHelloWorldService implements HelloWorldService {

    private final NameCapitalizer nameCapitalizer;

    public DefaultHelloWorldService(NameCapitalizer nameCapitalizer) {
        this.nameCapitalizer = nameCapitalizer;
    }

    @Override
    public String sayHello(String person) {
        return "Hello, " + this.nameCapitalizer.capitalize(person);
    }
}
