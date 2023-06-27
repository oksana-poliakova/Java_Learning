package Concurrent.BlockingQueue;

/**
 * @author Oksana Poliakova on 27.06.2023
 * @projectName Lesson1
 */
public class GasStationRunner {
    public static void main(String[] args) {
        GasStation gasStation = new GasStation();

        // Create a thread to add cars to the queue
        Thread carProducerThread = new Thread(() -> {
            try {
                gasStation.addCarToQueue("Car 1");  // Add a few cars to the queue
                Thread.sleep(1000);
                gasStation.addCarToQueue("Car 2");
                Thread.sleep(2000);
                gasStation.addCarToQueue("Car 3");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });

        // Create a thread to serve cars from the queue
        Thread carConsumerThread = new Thread(() -> {
            try {
                Thread.sleep(3000);
                gasStation.serveNextCar();  // Serve the cars from the queue
                Thread.sleep(1000);
                gasStation.serveNextCar();
                Thread.sleep(1500);
                gasStation.serveNextCar();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });

        // Start the threads
        carProducerThread.start();
        carConsumerThread.start();

    }
}
