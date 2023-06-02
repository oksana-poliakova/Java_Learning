package Interfaces.Restaurant;

/**
 * @author Oksana Poliakova on 02.06.2023
 * @projectName Lesson1
 */

// Waiter class that implements the RestaurantStaff interface
public class Waiter implements RestaurantStaff {
    @Override
    public void greetCustomer() {
        System.out.println("Welcome to the restaurant!");
    }

    @Override
    public void takeOrder() {
        System.out.println("What would you like to order?");
    }

    @Override
    public void serveFood() {
        System.out.println("Here is your food. Enjoy!");
    }
}
