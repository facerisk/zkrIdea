package com;

import org.quartz.*;
import org.quartz.impl.StdSchedulerFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Date;
import java.util.concurrent.TimeUnit;

public class Bootstrap {
    private static Logger logger = LoggerFactory.getLogger(Bootstrap.class);
    private static Scheduler scheduler = StdSchedulerFactory1.getScheduler();

    public  void quartz(Date date) {

        try {
            // 获取Scheduler实例

            scheduler.start();

            // 具体任务
            JobDetail job = JobBuilder.newJob(HelloJob.class).withIdentity("job1", "group1").build();

            // 触发时间点
            SimpleTrigger trigger = (SimpleTrigger)TriggerBuilder.newTrigger()
                    .withIdentity("trigger1", "group1")
                    .startAt(date)                     // some Date
                    .forJob("job1", "group1")                 // identify job with name, group strings
                    .build();


//            SimpleScheduleBuilder simpleScheduleBuilder = SimpleScheduleBuilder.simpleSchedule()
//                    .withIntervalInSeconds(10).repeatForever();
//            Trigger trigger = TriggerBuilder.newTrigger().withIdentity("trigger1", "group1")
//                    .startNow().withSchedule(simpleScheduleBuilder).build();

            // 交由Scheduler安排触发
            scheduler.scheduleJob(job, trigger);

            /* 为观察程序运行，此设置主程序睡眠3分钟才继续往下运行（因下一个步骤是“关闭Scheduler”） */
            try {
                TimeUnit.MINUTES.sleep(3);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            // 关闭Scheduler
            scheduler.shutdown();

        } catch (SchedulerException se) {
            logger.error(se.getMessage(), se);
        }
    }

}

