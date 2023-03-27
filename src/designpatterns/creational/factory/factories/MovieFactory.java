package designpatterns.creational.factory.factories;

import designpatterns.creational.factory.model.Movie;

public abstract class MovieFactory {

    public Movie create() {
        Movie movie = createMovie();
        movie.play();
        return movie;
    }

    protected abstract Movie createMovie();
}
