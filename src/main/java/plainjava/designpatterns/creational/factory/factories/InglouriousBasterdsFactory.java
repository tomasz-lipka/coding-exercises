package plainjava.designpatterns.creational.factory.factories;

import plainjava.designpatterns.creational.factory.model.InglouriousBasterds;
import plainjava.designpatterns.creational.factory.model.Movie;

public class InglouriousBasterdsFactory extends MovieFactory{

    @Override
    public Movie createMovie() {
        return new InglouriousBasterds();
    }
}
