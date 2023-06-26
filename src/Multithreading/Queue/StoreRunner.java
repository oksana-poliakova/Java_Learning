package Multithreading.Queue;

/**
 * @author Oksana Poliakova on 26.06.2023
 * @projectName Lesson1
 */
public class StoreRunner {
    public static void main(String[] args) {
        Store store = new Store();
        Thread cashierThread = new Thread(new Cashier(store));

        cashierThread.start();

        // Adding customers to the store
        store.addCustomer(new Customer("John"));
        store.addCustomer(new Customer("Alice"));
        store.addCustomer(new Customer("Bob"));

        try {
            // Process the customer's purchase
            Thread.sleep(5000); // Simulating store operation time
            cashierThread.interrupt(); // Stop the cashier thread after some time
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }
}
