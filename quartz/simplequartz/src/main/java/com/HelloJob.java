package com;

import org.quartz.Job;
import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class HelloJob implements Job {

    Logger logger = LoggerFactory.getLogger(this.getClass());

    public void execute(JobExecutionContext arg0) throws JobExecutionException {
        // 此任务仅打印日志便于调试、观察
        this.logger.debug(this.getClass().getName() + " 两小时后您xxx的检查将要开始");
    }

}