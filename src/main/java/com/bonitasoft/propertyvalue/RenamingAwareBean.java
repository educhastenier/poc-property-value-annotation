package com.bonitasoft.propertyvalue;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class RenamingAwareBean {

    private static final String UNSET = "__UNDEFINED__";

    @Value("${simple.new.value:" + UNSET + "}")
    private String myProperty;
    @Value("${simple.old.value:" + UNSET + "}")
    private String oldProperty;

    @PostConstruct
    void logBeanValues() {
        if (isOldNameUsed(myProperty, oldProperty)) {
            System.out.println("'simple.old.value' is deprecated, please use 'simple.new.value' instead");
            myProperty = oldProperty;
        }
        System.out.println("myProperty: " + this.myProperty);
    }

    private static boolean isOldNameUsed(String newName, String oldName) {
        return UNSET.equals(newName) && !UNSET.equals(oldName);
    }
}
