package designpatterns.factory.model;

public class ApocalypseNow implements Movie {

    @Override
    public void build() {
        System.out.println("This is the 'Apocalypse Now' movie!");
    }
}
