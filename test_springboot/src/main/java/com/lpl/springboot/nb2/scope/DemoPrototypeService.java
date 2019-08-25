package com.lpl.springboot.nb2.scope;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

@Service
@Scope("prototype") //每次调用返回一个bean实例
public class DemoPrototypeService {
}
