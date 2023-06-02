package Interfaces.Restaurant;

import java.util.Random;

/**
 * @author Oksana Poliakova on 02.06.2023
 * @projectName Lesson1
 */

// Interface for restaurant staff
public interface RestaurantStaff {
    Random RANDOM = new Random();
    void greetCustomer();
    void takeOrder();
    void serveFood();

    default void printRandom() {
        System.out.println(generateRandom());
    }

    private int generateRandom() {
        return RANDOM.nextInt();
    }
}
