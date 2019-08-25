package design.proxy;

public class Test {
    //代理类 可以帮委托类做一些事情 日志或事物
    //aop 自认为可以看做是动态代理思想
    //有些场景下也符合开闭原则：对扩展开放，对修改关闭
    public static void main(String[]args){
        CarImp car = new CarImp();
        CarProxy carProxy = new CarProxy(car);
        carProxy.move();
    }
}
