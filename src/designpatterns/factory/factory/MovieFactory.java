package designpatterns.factory.factory;

import designpatterns.factory.model.Movie;

public abstract class MovieFactory {

    public Movie create() {
        Movie movie = createMovie();
        movie.build();
        return movie;
    }

    protected abstract Movie createMovie();
}
