package designpatterns.behavioral.strategy;

public class TravelByPlane implements TravelStrategy {

    @Override
    public void pack() {
        System.out.println("Pack suitcase for plane.");
    }

    @Override
    public void go() {
        System.out.println("Fly by plane!");
    }
}
