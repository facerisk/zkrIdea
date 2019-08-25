package com.lpl.springboot.nb1.di;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(DiConfig.class);
        UseFunctionService bean = context.getBean(UseFunctionService.class);

        System.out.println(bean.sayHello("springboot"));

        context.close();
    }
}
