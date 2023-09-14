package com.bonitasoft.propertyvalue;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class SimpleBean {

    @Value("${simple.new.value:${simple.old.value:}}")
    private String myValue;

    @PostConstruct
    void logBeanValues() {
        System.out.println("Simple bean value: " + this.myValue);
    }
}
