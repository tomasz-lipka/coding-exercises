package designpatterns.creational.factory.factories;

import designpatterns.creational.factory.model.InglouriousBasterds;
import designpatterns.creational.factory.model.Movie;

public class InglouriousBasterdsFactory extends MovieFactory{

    @Override
    public Movie createMovie() {
        return new InglouriousBasterds();
    }
}
