package com.lpl.springboot.nb1.javaconfig;


public class UseFunctionService {

    FunctionService functionService;

    public FunctionService setFunctonService(FunctionService functionService) {
        return this.functionService = functionService;
    }

    public String sayHello(String word) {
        return functionService.sayHello(word);
    }
}
