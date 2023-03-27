package javacore.stream;

import javacore.stream.enums.Color;
import javacore.stream.enums.Type;

class ClothingItem {

    private final String name;
    private final Color color;
    private final Type type;
    private final int price;

    ClothingItem(String name, Color color, Type type, int price) {
        this.name = name;
        this.color = color;
        this.type = type;
        this.price = price;
    }

    Color getColor() {
        return color;
    }

    Type getType() {
        return type;
    }

    int getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return color + " " + name + ", type: " + type + ", price: " + price;
    }
}
