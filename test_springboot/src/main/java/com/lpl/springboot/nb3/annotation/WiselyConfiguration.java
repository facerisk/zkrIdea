package com.lpl.springboot.nb3.annotation;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import java.lang.annotation.*;

@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Configuration //组合元注解
@ComponentScan //组合元注解
public @interface WiselyConfiguration {
    String[] value() default {};//覆盖value 值
}
