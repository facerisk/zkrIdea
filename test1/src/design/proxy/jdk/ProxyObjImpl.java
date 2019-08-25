package design.proxy.jdk;

/**
 * 委托类
 */

public class ProxyObjImpl implements  ProxyObj{

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        System.out.println("set name="+name);
        this.name = name;
    }


    public void setAge(Integer age) {
        System.out.println("set age="+age);
    }
}
