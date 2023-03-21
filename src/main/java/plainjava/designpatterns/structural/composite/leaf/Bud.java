package plainjava.designpatterns.structural.composite.leaf;

import plainjava.designpatterns.structural.composite.PlantItem;

public class Bud implements PlantItem {

    @Override
    public int getAmount() {
        return 1;
    }
}
