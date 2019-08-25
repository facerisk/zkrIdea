package com.lpl.springboot.nb1.aop;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@ComponentScan("com.lpl.springboot.nb1.aop")
@EnableAspectJAutoProxy  //开启spring 对 AspectJ 的支持
public class AopConfig {
}
