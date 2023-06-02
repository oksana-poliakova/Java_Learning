package Interfaces.Restaurant;

/**
 * @author Oksana Poliakova on 02.06.2023
 * @projectName Lesson1
 */

// Chef class that implements the RestaurantStaff interface
public class Chef implements RestaurantStaff {
    @Override
    public void greetCustomer() {
        System.out.println("Welcome to the restaurant!");
    }

    @Override
    public void takeOrder() {
        System.out.println("Please wait, the waiter will take your order.");
    }

    @Override
    public void serveFood() {
        System.out.println("Food is ready. Bon appétit!");
    }
}
