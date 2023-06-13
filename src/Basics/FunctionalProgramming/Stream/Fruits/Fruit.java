package Basics.FunctionalProgramming.Stream.Fruits;

/**
 * @author Oksana Poliakova on 13.06.2023
 * @projectName Lesson1
 */
public class Fruit {
    private String name;
    private String color;

    public Fruit(String name, String color) {
        this.name = name;
        this.color = color;
    }

    public String getName() {
        return name;
    }

    public String getColor() {
        return color;
    }
}
