package interview.Thread;


import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStreamReader;

public class CallbackThread implements Runnable{

    private String fileName;
    private CallbackThreadTest callBack;

    public CallbackThread(CallbackThreadTest callBack,String fileName) {
        this.fileName = fileName;
        this.callBack = callBack;
    }

    @Override
    public void run() {
        try {
            File file = new File(fileName);
            InputStreamReader in = new InputStreamReader(new FileInputStream(file),"gbk");
            BufferedReader br = new BufferedReader(in);
            String str = br.readLine();
            //通知线程调用者run方法执行结果
            callBack.receiveFileStr(fileName,str);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
