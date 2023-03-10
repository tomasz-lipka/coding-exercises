package plainjava.designpatterns.structural.decorator.layer;

import plainjava.designpatterns.structural.decorator.road.Road;

public class AsphaltDecorator extends RoadDecorator {

    public AsphaltDecorator(Road road) {
        super(road);
    }

    @Override
    public void printLayer() {
        super.printLayer();
        System.out.println("asphalt layer");
    }
}
