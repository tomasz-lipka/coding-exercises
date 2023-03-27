package designpatterns.structural.composite.composite;

import designpatterns.structural.composite.PlantItem;

import java.util.ArrayList;
import java.util.List;

public class Branch implements PlantItem {

    private List<PlantItem> plantItems = new ArrayList<>();

    @Override
    public int getAmount() {
        int amount = 0;
        for (PlantItem plantItem : plantItems) {
            amount += plantItem.getAmount();
        }
        return amount;
    }

    public void addPlantItem(PlantItem plantItem) {
        plantItems.add(plantItem);
    }
}
