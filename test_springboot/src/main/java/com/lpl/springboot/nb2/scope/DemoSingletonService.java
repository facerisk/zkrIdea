package com.lpl.springboot.nb2.scope;

import org.springframework.stereotype.Service;

@Service //默认为 @Scop("singletion") spring容器中只有一个bean实例
public class DemoSingletonService {
}
