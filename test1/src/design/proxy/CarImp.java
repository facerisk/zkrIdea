package design.proxy;

public class CarImp implements Car {
    @Override
    public void move() {
        System.out.println("车开了");
    }
}
