package interview.Thread;

import java.util.concurrent.Callable;

/**
 *  一个包含返回值的线程类
 * @author xiezd 2018-01-14 21:40
 *
 */
public class ThreadWithCallback implements Callable {
    private int number;

    public ThreadWithCallback(int number) {
        this.number = number;
    }

    //相当于Thread的run方法
    @Override
    public Object call() throws Exception {
        long begin = System.currentTimeMillis();
        int index = (int) (Math.random() * 99999999);
        int result = number;
        //随便写的
        for (int i = 1; i < index; i++) {
            result = (result / i) * index;
        }
        long end = System.currentTimeMillis();
        return "计算数值为" + number + "的线程，花费：" + (end - begin) + "毫秒。";
    }

}
