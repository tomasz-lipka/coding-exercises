package designpatterns.factory;

import designpatterns.factory.factory.ApocalypseNowFactory;
import designpatterns.factory.factory.InglouriousBasterdsFactory;
import designpatterns.factory.factory.MovieFactory;
import designpatterns.factory.model.Movie;

public class Main {
    public static void main(String[] args) {
        MovieFactory apocalypseNowFactory = new ApocalypseNowFactory();
        Movie apocalypseNow = apocalypseNowFactory.create();

        MovieFactory inglouriousBasterdsFactory = new InglouriousBasterdsFactory();
        Movie inglouriousBasterds = inglouriousBasterdsFactory.create();
    }
}
