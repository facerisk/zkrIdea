package com.lpl.springboot.nb2.event;

import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

/*
*@data 2019/8/21
*@descrption 监听器
*
*/
@Component
public class DemoListener implements ApplicationListener<DemoEvent> {//实现ApplicationListener接口，并指定监听的事件类型
    /*
     *@data 2019/8/21
     *@descrption 对消息进行接收处理
     *
     */
    public void onApplicationEvent(DemoEvent demoEvent) {
        String msg = demoEvent.getMsg();
        System.out.println("我（bean-demoListener）接收到了bean-demoPublisher发布的消息：" + msg);
    }
}
