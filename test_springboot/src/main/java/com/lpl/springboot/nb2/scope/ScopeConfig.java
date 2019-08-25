package com.lpl.springboot.nb2.scope;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.lpl.springboot.nb2.scope") //一定注意直接 注解 括号 为空也行
public class ScopeConfig {
}
