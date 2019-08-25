package com.lpl.springboot.nb2.prepost;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        /**
         * 初始化bean 可在构造函数之后 bean销毁之前做些事情
         */
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(PrePostConfig.class);
        System.out.println("11111");
        context.getBean(BeanWayService.class);
        context.getBean(JSR250WayService.class);
        //销毁Bean
        context.close();
    }
}
