package plainjava.javacore.stream;

import plainjava.javacore.stream.enums.Type;

import java.util.List;
import java.util.Map;
import java.util.Optional;

class Main {

    public static void main(String[] args) {
        StreamHelper streamHelper = new StreamHelper();
        Repository repository = new Repository();
        List<ClothingItem> allClothingItems = repository.getClothingItems();

        System.out.println("Filter by bottom:");
        List<ClothingItem> filteredByBottom = streamHelper.filterByBottom(allClothingItems);
        filteredByBottom.forEach(System.out::println);

        System.out.println("\nUnsorted:");
        allClothingItems.forEach(System.out::println);

        System.out.println("\nSorted by price:");
        List<ClothingItem> sortedByPrice = streamHelper.sortByPrice(allClothingItems);
        sortedByPrice.forEach(System.out::println);

        System.out.println("\nAre all item blue?");
        boolean areAllItemsBlue = streamHelper.areAllItemsBlue(allClothingItems);
        System.out.println(areAllItemsBlue);

        System.out.println("\nIs any item blue?");
        boolean isAnyItemBlue = streamHelper.isAnyItemBlue(allClothingItems);
        System.out.println(isAnyItemBlue);

        System.out.println("\nThe most expensive item:");
        Optional<ClothingItem> item = streamHelper.getMostExpensive(allClothingItems);
        item.ifPresentOrElse(System.out::println, () -> System.out.println("not found"));

        System.out.println("\nHow many items there of each type?");
        Map<Type, Long> countGroupByType = streamHelper.countGroupByType(allClothingItems);
        countGroupByType.forEach((type, count) -> System.out.println(type + " " + count));

        System.out.println("\nWhat is the summary cost of each type?");
        Map<Type, Integer> aggregatePriceGroupByType = streamHelper.aggregatePriceGroupByType(allClothingItems);
        aggregatePriceGroupByType.forEach((type, sum) -> System.out.println(type + " " + sum));
    }
}
