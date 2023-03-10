package plainjava.designpatterns.structural.decorator.layer;

import plainjava.designpatterns.structural.decorator.road.Road;

abstract class RoadDecorator implements Road {

    private Road road;

    RoadDecorator(Road road) {
        this.road = road;
    }

    @Override
    public void printLayer() {
        road.printLayer();
    }
}
