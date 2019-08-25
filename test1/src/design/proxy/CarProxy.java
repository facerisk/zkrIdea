package design.proxy;

public class CarProxy implements Car {
    private CarImp car;
    public CarProxy() {
    }
    public CarProxy(CarImp car) {
        this.car = car;
    }

    @Override
    public void move() {
        System.out.println("前面");
        car.move();

    }
}
