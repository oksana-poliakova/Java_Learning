package Interfaces.Restaurant;

/**
 * @author Oksana Poliakova on 02.06.2023
 * @projectName Lesson1
 */
public class Restaurant {
    public static void main(String[] args) {
        Waiter waiter1 = new Waiter();
        Chef chef1 = new Chef();

        waiter1.greetCustomer();
        chef1.takeOrder();
        chef1.printRandom();
    }
}
