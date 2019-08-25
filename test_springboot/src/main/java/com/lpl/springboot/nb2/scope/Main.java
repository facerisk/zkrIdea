package com.lpl.springboot.nb2.scope;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ScopeConfig.class);
        DemoSingletonService s1 = context.getBean(DemoSingletonService.class);
        DemoPrototypeService p1 = context.getBean(DemoPrototypeService.class);
        DemoSingletonService s2 = context.getBean(DemoSingletonService.class);
        DemoPrototypeService p2 = context.getBean(DemoPrototypeService.class);
        
//@Scop 描述spring如何新建bean实例

//        s1与s2是否相等：true
//        p1与p2是否相等：false
        System.out.println("s1与s2是否相等：" + s1.equals(s2));
        System.out.println("p1与p2是否相等：" + p1.equals(p2));


    }
}
