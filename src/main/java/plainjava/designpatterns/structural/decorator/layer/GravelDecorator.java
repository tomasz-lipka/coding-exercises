package plainjava.designpatterns.structural.decorator.layer;

import plainjava.designpatterns.structural.decorator.road.Road;

public class GravelDecorator extends RoadDecorator {

    public GravelDecorator(Road road) {
        super(road);
    }

    @Override
    public void printLayer() {
        super.printLayer();
        System.out.println("gravel layer");
    }
}
