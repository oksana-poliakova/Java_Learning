package Basics.FunctionalProgramming.Stream.Fruits;

import java.util.Arrays;
import java.util.List;

/**
 * @author Oksana Poliakova on 13.06.2023
 * @projectName Lesson1
 */
public class FruitRunner {
    public static void main(String[] args) {
        filterFruits();
    }

    public static void filterFruits() {
        List<Fruit> fruitList = Arrays.asList(
                new Fruit("Apple", "Red"),
                new Fruit("Banana", "Yellow"),
                new Fruit("Orange", "Orange"),
                new Fruit("Cherry", "Red"),
                new Fruit("Grape", "Green")
        );

        // Filtering and displaying fruits of a certain color (in the case of red fruits).
        fruitList.stream()
                .filter(fruit -> fruit.getColor().equals("Red"))
                .forEach(fruit -> System.out.println(fruit.getName()));
        System.out.println("====");

        // Convert fruits to a list of their colors using the map() operation and the getColor() method.
        List<String> fruitColors = fruitList.stream()
                .map(fruit -> fruit.getColor())
                .toList();
        System.out.println(fruitColors);
    }
}
