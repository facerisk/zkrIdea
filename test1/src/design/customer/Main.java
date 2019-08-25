package design.customer;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Object object = new Object();
        ArrayList<Integer> list = new ArrayList<Integer>();

        Produce p = new Produce(object, list);
        Consumer c = new Consumer(object, list);

//        ProduceThread[] pt = new ProduceThread[2];
//        ConsumeThread[] ct = new ConsumeThread[2];

        ProduceThread pt1 = new ProduceThread(p);
        pt1.setName("231");
        pt1.start();

//        pt[1] = new ProduceThread(p);
//        pt[1].setName("生产者 "+(1));
//        ct[1] = new ConsumeThread(c);
//        ct[1].setName("消费者"+(1));
//        pt[1].start();
//        ct[1].start();

//        for(int i=0;i<2;i++){
//            pt[i] = new ProduceThread(p);
//            pt[i].setName("生产者 "+(i+1));
//            ct[i] = new ConsumeThread(c);
//            ct[i].setName("消费者"+(i+1));
//            pt[i].start();
//            ct[i].start();
//        }
    }
}