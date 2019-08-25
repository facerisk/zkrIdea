package com.lpl.springboot.nb2.event;


import org.springframework.context.ApplicationEvent;
/*
*@data 2019/8/21
*@descrption 自定义事件
*
*/
public class DemoEvent extends ApplicationEvent {
    private static final long serialVersionUID = 1L;
    private String msg;


    public DemoEvent(Object source, String msg) {
        super(source);
        this.msg = msg;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public void setMsg() {
        System.out.println("hahahahahah");
    }
}
