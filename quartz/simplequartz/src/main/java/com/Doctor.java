package com;

import java.util.Calendar;
import java.util.Date;

public class Doctor {
    private static Bootstrap bo = new Bootstrap();
    public static void main(String[]args){
        domedicine();
    }


    public static void domedicine(){
        System.out.println("我抓完了药，请于预约时间前2个小时提醒来复查！");
        Date date = new Date();
        Calendar rightNow = Calendar.getInstance();
        rightNow.setTime(date);
        rightNow.add(Calendar.MINUTE,+2);
        Date enddates = rightNow.getTime();
        bo.quartz(enddates);
    }
}