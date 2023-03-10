package plainjava.designpatterns.structural.decorator.road;

public class BaseLayer implements Road {

    @Override
    public void printLayer() {
        System.out.println("dirt layer");
    }
}
