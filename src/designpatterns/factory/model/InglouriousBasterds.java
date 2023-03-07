package designpatterns.factory.model;

public class InglouriousBasterds implements Movie {

    @Override
    public void build() {
        System.out.println("This is the 'Inglourious Basterds' movie!");
    }
}
