package Multithreading.Queue;

import java.util.LinkedList;
import java.util.Queue;

/**
 * @author Oksana Poliakova on 26.06.2023
 * @projectName Lesson1
 */

/*
wait: Suspends the current thread and releases the object's monitor.
notify: Wakes up one waiting thread on the object's monitor.
notifyAll: Wakes up all waiting threads on the object's monitor.
*/
class Store {
    private Queue<Customer> customerQueue;

    public Store() {
        customerQueue = new LinkedList<>();
    }

    public synchronized void addCustomer(Customer customer) {
        // Add the customer to the queue
        customerQueue.add(customer);
        // Print a message about the customer entering the store
        System.out.println("Customer " + customer.getName() + " entered the store.");
        // Notify all threads waiting on the object monitor
        notifyAll();
    }

    public synchronized Customer getNextCustomer() throws InterruptedException {
        while (customerQueue.isEmpty()) {
            // Wait until a new customer appears in the queue
            wait();
        }
        // Get the next customer from the front of the queue
        Customer nextCustomer = customerQueue.poll();
        System.out.println("Customer " + nextCustomer.getName() + " is being served.");
        // Return the customer for processing
        return nextCustomer;
    }
}