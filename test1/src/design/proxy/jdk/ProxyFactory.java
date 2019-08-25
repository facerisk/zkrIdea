package design.proxy.jdk;

import java.lang.reflect.Proxy;

public class ProxyFactory {

    //获取代理对象
    public static ProxyObj getProxy(ProxyObj proxyObj) {
        /**
         * loader 指定加载jvm运行时动态生成的代理对象的加载器
         *
         * interface 真实对象实现的所有接口
         *
         * h 实现InvocationHandler接口对象
         */
        System.out.println(Thread.currentThread().getContextClassLoader());
        System.out.println(proxyObj.getClass().getInterfaces());
//终极问题invoke方法是如何被调用的？？？？
        return (ProxyObj) Proxy.newProxyInstance(Thread.currentThread().getContextClassLoader(),
                proxyObj.getClass().getInterfaces(), new InvokcationInvokeHandler(proxyObj));
    }

    public static void main(String[] args) {
        ProxyFactory.getProxy(new ProxyObjImpl()).setName("hh");
    }
}

