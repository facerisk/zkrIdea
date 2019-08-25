package com;

import org.quartz.Scheduler;
import org.quartz.SchedulerException;
import org.quartz.impl.StdSchedulerFactory;

public class StdSchedulerFactory1 {

    public static Scheduler getScheduler(){
        try {
            return StdSchedulerFactory.getDefaultScheduler();
        } catch (SchedulerException e) {
            e.printStackTrace();
        }
        return null;
    }
}
