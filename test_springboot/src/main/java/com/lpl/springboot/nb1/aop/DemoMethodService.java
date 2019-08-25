package com.lpl.springboot.nb1.aop;

import org.springframework.stereotype.Service;
/*
*@data 2019/8/19
*@descrption 使用方法规则被拦截
*
*/

@Service
public class DemoMethodService {
    public void add(){
        System.out.println("我是 method add");
    }
}
