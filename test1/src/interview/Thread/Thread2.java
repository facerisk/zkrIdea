package interview.Thread;


public class Thread2 {

    public static void main(String[] args) {
        MyThread T1 = new MyThread("A");
        MyThread T2 = new MyThread("B");
        T1.start();
//        T1.start();//同时有两个T1会报错
        T2.start();


    }

}

class MyThread extends Thread {
    private String name;
    public MyThread(String name) {
        this.name = name;
    }

    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println(name+":"+i);
            try {
                sleep(1000); //休眠1秒，避免太快导致看不到同时执行
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

    }
}