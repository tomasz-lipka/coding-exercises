package designpatterns.behavioral.strategy;

public class TravelByCar implements TravelStrategy {

    @Override
    public void go() {
        System.out.println("Go by car!");
    }

    @Override
    public void pack() {
        System.out.println("Pack the car trunk.");
    }
}
