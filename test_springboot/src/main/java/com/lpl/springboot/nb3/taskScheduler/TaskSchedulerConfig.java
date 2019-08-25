package com.lpl.springboot.nb3.taskScheduler;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableScheduling;

@Configuration
@ComponentScan("com.lpl.springboot.nb3.taskScheduler")
@EnableScheduling //开启对计划任务的支持
public class TaskSchedulerConfig {

}
