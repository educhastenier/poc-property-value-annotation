package com.bonitasoft.propertyvalue;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;

@Data
@ConfigurationProperties(prefix = "simple")
public class AppProperties {

    private static final String UNSET = "__UNDEFINED__";

    private String newValue = UNSET;

    @Deprecated
    private String oldValue = UNSET;

    public String getNewValue() {
        if (isOldNameUsed(newValue, oldValue)) {
            System.out.println("'simple.old-value' is deprecated, please use 'simple.new-value' instead");
            newValue = oldValue;
        }
//        System.out.println("AppProperties: " + newValue);
        return newValue;
    }

    private static boolean isOldNameUsed(String newName, String oldName) {
        return UNSET.equals(newName) && !UNSET.equals(oldName);
    }
}
