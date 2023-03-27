package designpatterns.creational.factory.factories;

import designpatterns.creational.factory.model.ApocalypseNow;
import designpatterns.creational.factory.model.Movie;

public class ApocalypseNowFactory extends MovieFactory {

    @Override
    public Movie createMovie() {
        return new ApocalypseNow();
    }
}
