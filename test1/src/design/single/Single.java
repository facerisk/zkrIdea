package design.single;

/**
 * 单例的设计原则：
 * ①声明私有静态的实例
 * ②私有化构造，防止其他类创建实例
 * ③静态的返回实例的方法（类可以直接调用）
 */
public class Single {
    //懒汉模式是非线程安全的，所以要同步块 和 关键字
    private static volatile Single s = null;//线程可见性 加关键字volatile
    private Single() {}//①
    public static Single getInstance() {//②
        if (s == null) {
            synchronized (Single.class) {
                if (s == null) {//双重检验
                    s = new Single();
                }
            }
        }
        return s;
    }
}
/**
 * 恶汉模式
 */
class Single1{
    private static Single1 s1 = new Single1();
    private Single1(){}
    public static Single1 getInstance(){
        return s1;
    }

}