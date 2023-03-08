package designpatterns.creational.factory;

import designpatterns.creational.factory.factories.ApocalypseNowFactory;
import designpatterns.creational.factory.factories.InglouriousBasterdsFactory;
import designpatterns.creational.factory.factories.MovieFactory;
import designpatterns.creational.factory.model.Movie;

public class Main {
    public static void main(String[] args) {
        MovieFactory apocalypseNowFactory = new ApocalypseNowFactory();
        Movie apocalypseNow = apocalypseNowFactory.create();

        MovieFactory inglouriousBasterdsFactory = new InglouriousBasterdsFactory();
        Movie inglouriousBasterds = inglouriousBasterdsFactory.create();
    }
}
