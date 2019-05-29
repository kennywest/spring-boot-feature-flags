package com.example.demo;

public class ExperimentalHelloWorldService implements HelloWorldService {

    private final NameCapitalizer nameCapitalizer;

    public ExperimentalHelloWorldService(NameCapitalizer nameCapitalizer) {
        this.nameCapitalizer = nameCapitalizer;
    }

    @Override
    public String sayHello(String person) {
        return "Hello, " + this.nameCapitalizer.capitalize(person) + ", how are you today?";
    }
}
