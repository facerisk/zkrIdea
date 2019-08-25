package com.lpl.springboot.nb2.prepost;
/*
*@data 2019/8/21
*@descrption 使用@Bean行式的Bean
*
*/
public class BeanWayService {
    public void init(){
        System.out.println("@Bean-init-method");
    }

    public BeanWayService() {
        super();
        System.out.println("初始化构造函数-BeanWayService");
    }
    public void destroy(){
        System.out.println("@Bean-destroy-method");
    }
}
