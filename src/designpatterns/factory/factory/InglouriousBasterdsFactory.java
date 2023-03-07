package designpatterns.factory.factory;

import designpatterns.factory.model.InglouriousBasterds;
import designpatterns.factory.model.Movie;

public class InglouriousBasterdsFactory extends MovieFactory{

    @Override
    public Movie createMovie() {
        return new InglouriousBasterds();
    }
}
