package com.lpl.springboot.nb1.aop;

import java.lang.annotation.*;

/*
*@data 2019/8/19
*@descrption 编写拦截规则的注解
*
*/
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface Action {
    String name();
}
