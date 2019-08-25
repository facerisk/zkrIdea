package com.lpl.springboot.nb1.di;


import org.springframework.stereotype.Service;

@Service //声明当前类是spring管理的一个bean
public class FunctionService {
    public String sayHello(String word){
        return "Hello:"+word+"!";
    }
}
