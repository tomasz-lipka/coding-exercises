package designpatterns.behavioral.strategy;

public class Vacation {

    private TravelStrategy travelStrategy;

    public void startVacation() {
        travelStrategy.pack();
        travelStrategy.go();
    }

    public void setTravelStrategy(TravelStrategy travelStrategy) {
        this.travelStrategy = travelStrategy;
    }
}
