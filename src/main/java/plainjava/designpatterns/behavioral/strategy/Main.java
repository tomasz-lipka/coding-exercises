package plainjava.designpatterns.behavioral.strategy;

public class Main {

    public static void main(String[] args) {
        Vacation mySpanishVacation = new Vacation();
        mySpanishVacation.setTravelStrategy(new TravelByPlane());
        mySpanishVacation.startVacation();

        System.out.println();

        Vacation tripToTheLake = new Vacation();
        tripToTheLake.setTravelStrategy(new TravelByCar());
        tripToTheLake.startVacation();
    }
}