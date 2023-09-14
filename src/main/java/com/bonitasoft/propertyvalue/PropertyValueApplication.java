package com.bonitasoft.propertyvalue;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

@SpringBootApplication
@EnableConfigurationProperties(AppProperties.class)
public class PropertyValueApplication {

    public static void main(String[] args) {
        SpringApplication.run(PropertyValueApplication.class, args);
    }

}
