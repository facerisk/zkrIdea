package test.泰康;

import test.泰康.TestFileBO;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Test1 {
    public static void main(String[] args) {
        long l = System.currentTimeMillis();
        TestFileBO TestFileBO = new TestFileBO();
        TestFileBO.setBussion("123");
        TestFileBO.setBussion2("123");
        TestFileBO.setBussion3("123");


        long l1 = System.currentTimeMillis();
        SimpleDateFormat formatter = new SimpleDateFormat("yyyy年-MM月dd日-HH时mm分ss秒");

        Date date = new Date(l1);

        System.out.println(formatter.format(date));
        System.out.println(l1);

    }
}
