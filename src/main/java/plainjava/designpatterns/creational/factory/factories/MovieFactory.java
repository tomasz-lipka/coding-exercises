package plainjava.designpatterns.creational.factory.factories;

import plainjava.designpatterns.creational.factory.model.Movie;

public abstract class MovieFactory {

    public Movie create() {
        Movie movie = createMovie();
        movie.play();
        return movie;
    }

    protected abstract Movie createMovie();
}
