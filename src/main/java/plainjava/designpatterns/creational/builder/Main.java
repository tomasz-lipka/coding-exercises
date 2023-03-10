package plainjava.designpatterns.creational.builder;

public class Main {
    public static void main(String[] args) {
        Planet earth = new Planet.PlanetBuilder("Earth")
                .setDiameter(12742)
                .supplyWater()
                .create();
        System.out.println(earth.toString());

        Planet mars = new Planet.PlanetBuilder("Mars")
                .setDiameter(6779)
                .create();
        System.out.println(mars.toString());
    }
}