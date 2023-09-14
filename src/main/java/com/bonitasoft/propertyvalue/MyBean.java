package com.bonitasoft.propertyvalue;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class MyBean {

    @Value("${my.new.value:default-value}")
    private String myBeanValue;

    @BonitaProperty(value = "propName", old = "myOldPropName")
    private String myProp;

    @BonitaProperty("newPropName")
    private String myNewProp;

    @PostConstruct
    void logBeanValues(){
        System.out.println("my bean value: " + this.myBeanValue);
//        System.out.println("myNewProp: " + this.myProp);
//        System.out.println("myNewProp: " + this.myNewProp);
    }
}