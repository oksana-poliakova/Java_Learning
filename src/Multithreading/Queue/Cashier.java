package Multithreading.Queue;

/**
 * @author Oksana Poliakova on 26.06.2023
 * @projectName Lesson1
 */
class Cashier implements Runnable {
    private Store store;

    public Cashier(Store store) {
        this.store = store;
    }

    @Override
    public void run() {
        while (true) {
            try {
                Customer customer = store.getNextCustomer();
                // Process the customer's purchase
                Thread.sleep(2000); // Simulating processing time
                System.out.println("Customer " + customer.getName() + " has been served.");
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                break;
            }
        }
    }
}
