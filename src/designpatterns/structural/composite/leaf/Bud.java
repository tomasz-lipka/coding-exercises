package designpatterns.structural.composite.leaf;

import designpatterns.structural.composite.PlantItem;

public class Bud implements PlantItem {

    @Override
    public int getAmount() {
        return 1;
    }
}
