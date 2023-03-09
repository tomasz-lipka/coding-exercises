package designpatterns.structural.decorator.layer;

import designpatterns.structural.decorator.road.Road;

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
