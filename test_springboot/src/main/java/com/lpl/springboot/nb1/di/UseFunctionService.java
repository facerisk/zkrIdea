package com.lpl.springboot.nb1.di;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UseFunctionService {
    @Autowired //将FunctionService实体bean 注入到 UseFunctionService中
    FunctionService functionService;

    public String sayHello(String word){
        return functionService.sayHello(word);
    }
}
