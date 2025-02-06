package com.mytests.spring.springpropertiespropertmapper;

import org.springframework.boot.test.autoconfigure.properties.PropertyMapping;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;



@Target({ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface MyPropertyMappings {

    @PropertyMapping("spring.datasource.username")
    String username() default "";

    @PropertyMapping("spring.datasource.password")
    String password() default "";

    @PropertyMapping("spring.datasource.url")
    String url() default "";
}
