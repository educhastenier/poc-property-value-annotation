package com.bonitasoft.propertyvalue;

import javax.annotation.PostConstruct;

import org.springframework.stereotype.Component;

@Component
public class MyInjectedProperties {

    private final AppProperties properties;

    public MyInjectedProperties(AppProperties properties) {
        this.properties = properties;
    }

    @PostConstruct
    public void initialize() {
        System.out.println("Java-injected property: "+ properties.getNewValue());
    }
}
