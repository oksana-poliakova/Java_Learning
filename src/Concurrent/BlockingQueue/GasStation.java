package Concurrent.BlockingQueue;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

/**
 * @author Oksana Poliakova on 27.06.2023
 * @projectName Lesson1
 */
public class GasStation {
    private BlockingQueue<String> carQueue = new ArrayBlockingQueue<>(10);  // Create a blocking queue to hold cars

    public void addCarToQueue(String car) throws InterruptedException {
        carQueue.put(car);  // Add a car to the queue
        System.out.println("Car " + car + " added to the queue.");
    }

    public void serveNextCar() throws InterruptedException {
        String car = carQueue.take();  // Remove and retrieve the next car from the queue
        System.out.println("Serving car " + car);
    }
}
