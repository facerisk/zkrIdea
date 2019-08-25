package design.proxy.jdk;


import sun.misc.ProxyGenerator;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class CodeUtil {

    public static void main(String[] args) throws IOException {
        //https://blog.csdn.net/zcc_0015/article/details/22695647
        //可以好好理解动态代理如何调用的invoke()方法
        byte[] classFile = ProxyGenerator.generateProxyClass("Proxy0", ProxyObjImpl.class.getInterfaces());

        File file = new File("e:/Proxy0.class");

        FileOutputStream fos = new FileOutputStream(file);

        fos.write(classFile);

        fos.flush();

        fos.close();

    }

}
