package designpatterns.structural.decorator;

import designpatterns.structural.decorator.layer.AsphaltDecorator;
import designpatterns.structural.decorator.layer.GravelDecorator;
import designpatterns.structural.decorator.road.BaseLayer;
import designpatterns.structural.decorator.road.Road;

public class Main {
    public static void main(String[] args) {
        System.out.println("The A4 road is made of:");
        Road a4 = new AsphaltDecorator(new GravelDecorator(new BaseLayer()));
        a4.printLayer();

        System.out.println("\nThe local road is made of:");
        Road localRoad = new GravelDecorator(new BaseLayer());
        localRoad.printLayer();

        System.out.println("\nThe forest road is made of:");
        Road forestRoad = new BaseLayer();
        forestRoad.printLayer();
    }
}
