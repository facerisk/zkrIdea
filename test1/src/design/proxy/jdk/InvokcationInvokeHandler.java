package design.proxy.jdk;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.util.Arrays;

/**
 * JDK动态代理模式，主要用到java.lang.reflect包下的InvocationHandler,Poxy两个类
 */
public class InvokcationInvokeHandler implements InvocationHandler {
    //真实的对象
//    private ProxyObj proxyPbj;//这里声明委托类，不符合扩展性吧
    private Object target;

//    public InvokcationInvokeHandler(ProxyObj proxy) {
//        this.proxyPbj = proxy;
//    }
    public InvokcationInvokeHandler(Object target) {
        this.target = target;
    }

    /**
     * @param proxy  jvm生成的动态代理对象 $Proxy0
     * @param method 当前代理对象调用的方法对象，是代理对象实现接口中的方法
     * @param args   调用对象传入的参数
     * @return
     * @throws Throwable
     */
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("before call set proxy" + proxy.getClass() + " method=" + method + " args=" + Arrays.toString(args));
        method.invoke(target, args);
        //((ProxyObj)proxy).setName("2"); 会导致invoke方法循环调用导致StackoverflowError
        return null;
    }
}