package interview.Thread;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;



public class ThreadWithCallbackTest {
    public static void main(String[] args) {
        ExecutorService executors = Executors.newFixedThreadPool(10);
        try {
            /* 启动线程时会返回一个Future对象。
             * 可以通过future对象获取现成的返回值。
             * 在执行future.get()时，主线程会堵塞，直至当前future线程返回结果。
             */
            Future future1 = executors.submit(new ThreadWithCallback(20));
            Future future2 = executors.submit(new ThreadWithCallback(30));
            System.out.println(future1.get());
            System.out.println(future2.get());

        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            e.printStackTrace();
        } finally {
            executors.shutdown();
        }
    }
}

