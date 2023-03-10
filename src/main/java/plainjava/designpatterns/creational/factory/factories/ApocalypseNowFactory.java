package plainjava.designpatterns.creational.factory.factories;

import plainjava.designpatterns.creational.factory.model.ApocalypseNow;
import plainjava.designpatterns.creational.factory.model.Movie;

public class ApocalypseNowFactory extends MovieFactory{

    @Override
    public Movie createMovie() {
        return new ApocalypseNow();
    }
}
