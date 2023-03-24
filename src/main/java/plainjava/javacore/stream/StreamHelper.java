package plainjava.javacore.stream;

import plainjava.javacore.stream.enums.Color;
import plainjava.javacore.stream.enums.Type;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

class StreamHelper {

    List<ClothingItem> filterByBottom(List<ClothingItem> allClothingItems) {
        return allClothingItems.stream()
                .filter(item -> item.getType().equals(Type.BOTTOM))
                .collect(Collectors.toList());
    }

    List<ClothingItem> sortByPrice(List<ClothingItem> allClothingItems) {
        return allClothingItems.stream()
                .sorted(Comparator.comparing(ClothingItem::getPrice))
                .collect(Collectors.toList());
    }

    boolean areAllItemsBlue(List<ClothingItem> allClothingItems) {
        return allClothingItems.stream()
                .allMatch(item -> item.getColor().equals(Color.BLUE));
    }

    boolean isAnyItemBlue(List<ClothingItem> allClothingItems) {
        return allClothingItems.stream()
                .anyMatch(item -> item.getColor().equals(Color.BLUE));
    }

    Optional<ClothingItem> getMostExpensive(List<ClothingItem> allClothingItems) {
        return allClothingItems.stream()
                .max(Comparator.comparing(ClothingItem::getPrice));
    }

    Map<Type, Long> countGroupByType(List<ClothingItem> allClothingItems) {
        return allClothingItems.stream()
                .collect(Collectors.groupingBy(ClothingItem::getType, Collectors.counting()));
    }

    Map<Type, Integer> aggregatePriceGroupByType(List<ClothingItem> allClothingItems) {
        return allClothingItems.stream()
                .collect(Collectors.groupingBy(ClothingItem::getType, Collectors.summingInt(ClothingItem::getPrice)));
    }
}
