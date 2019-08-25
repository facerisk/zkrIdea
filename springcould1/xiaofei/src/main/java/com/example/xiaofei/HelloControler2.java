package com.example.xiaofei;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloControler2
{

    @Autowired
    HelloService helloService;

    @RequestMapping(value = "/ho")
    public String hi(@RequestParam String name)
    {
        return "hey " +
                name + ", there is heheh ";
    }
}

