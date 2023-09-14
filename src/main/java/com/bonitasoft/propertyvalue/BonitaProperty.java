package com.bonitasoft.propertyvalue;

import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface BonitaProperty {

    String value();

    String old() default "";

}
