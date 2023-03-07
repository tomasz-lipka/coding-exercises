package designpatterns.factory.factory;

import designpatterns.factory.model.ApocalypseNow;
import designpatterns.factory.model.Movie;

public class ApocalypseNowFactory extends MovieFactory{

    @Override
    public Movie createMovie() {
        return new ApocalypseNow();
    }
}
