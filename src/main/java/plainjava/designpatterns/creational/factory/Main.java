package plainjava.designpatterns.creational.factory;

import plainjava.designpatterns.creational.factory.factories.ApocalypseNowFactory;
import plainjava.designpatterns.creational.factory.factories.InglouriousBasterdsFactory;
import plainjava.designpatterns.creational.factory.factories.MovieFactory;
import plainjava.designpatterns.creational.factory.model.Movie;

public class Main {
    public static void main(String[] args) {
        MovieFactory apocalypseNowFactory = new ApocalypseNowFactory();
        Movie apocalypseNow = apocalypseNowFactory.create();

        MovieFactory inglouriousBasterdsFactory = new InglouriousBasterdsFactory();
        Movie inglouriousBasterds = inglouriousBasterdsFactory.create();
    }
}
