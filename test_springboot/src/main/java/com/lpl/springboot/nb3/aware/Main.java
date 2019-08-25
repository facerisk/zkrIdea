package com.lpl.springboot.nb3.aware;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    /*
    *@data 2019/8/24
    *@descrption 让Bean 获得Spring 容器的服务
    *
    */
    
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AwareConfig.class);

        AwareService awareService = context.getBean(AwareService.class);
        awareService.outputResult();

        context.close();
    }
}
