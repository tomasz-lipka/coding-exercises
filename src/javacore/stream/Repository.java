package javacore.stream;

import javacore.stream.enums.Color;
import javacore.stream.enums.Type;

import java.util.ArrayList;
import java.util.List;

class Repository {

    private final List<ClothingItem> clothingItems = new ArrayList<>();

    Repository() {
        clothingItems.add(new ClothingItem("T-shirt", Color.BLACK, Type.UPPER, 25));
        clothingItems.add(new ClothingItem("Jeans", Color.BLUE, Type.BOTTOM, 250));
        clothingItems.add(new ClothingItem("T-shirt", Color.RED, Type.UPPER, 30));
        clothingItems.add(new ClothingItem("Jeans", Color.BLACK, Type.BOTTOM, 200));
        clothingItems.add(new ClothingItem("Shoes", Color.BLACK, Type.BOTTOM, 300));
    }

    List<ClothingItem> getClothingItems() {
        return clothingItems;
    }
}
