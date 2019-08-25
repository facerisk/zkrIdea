package interview.Thread;



public class CallbackThreadTest {

    public static void main(String[]args) throws InterruptedException{
        String f1 = "e:\\a.txt";
        String f2 = "e:\\b.txt";

        CallbackThreadTest t1 = new CallbackThreadTest();
        CallbackThreadTest t2 = new CallbackThreadTest();

        CallbackThread cb1 = new CallbackThread(t1, f1);
        CallbackThread cb2 = new CallbackThread(t2, f2);

        new Thread(cb1).start();
        new Thread(cb2).start();
    }

    public void receiveFileStr(String fileName,String readStr){
        StringBuffer sb = new StringBuffer();
        sb.append(fileName + ":" + readStr);
        System.out.println(sb.toString());
    }
}