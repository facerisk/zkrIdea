package com.lpl.springboot.nb2.el;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service
public class DemoService {
    @Value("其他类的属性")
    private String anothoer;

    public String getAnothoer() {
        return anothoer;
    }

    public void setAnothoer(String anothoer) {
        this.anothoer = anothoer;
    }
}
