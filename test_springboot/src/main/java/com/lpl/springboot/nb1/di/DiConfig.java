package com.lpl.springboot.nb1.di;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration //声明当前类是一个配置类
//自动扫描包下所有使用@Service@Component@Repository@Controller,并注册为bean
@ComponentScan("com.lpl.springboot.nb1.di")
public class DiConfig {

}
