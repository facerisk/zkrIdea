package com.lpl.springboot.nb1.aop;

import org.springframework.stereotype.Service;
/*
*@data 2019/8/19
*@descrption 使用注解的被拦截类
*
*/
@Service
public class DemoAnnotationService {
    @Action(name="注解方式拦截add操作")
    public void add(){
        System.out.println("我是 annotation add");
    }
}
