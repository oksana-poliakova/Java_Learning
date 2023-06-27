package Concurrent.CountDownLatch;

import java.util.concurrent.CountDownLatch;

/**
 * @author Oksana Poliakova on 27.06.2023
 * @projectName Lesson1
 */

/* CountDownLatch with a count of 1 is created.
The rocket thread performs some preparation tasks and then initiates the launch sequence.
Once the rocket has successfully launched, it calls countDown() on the countdownLatch.
The main thread waits for the countdown to complete by calling await() on the countdownLatch. */

public class RocketLaunch {
    public static void main(String[] args) throws InterruptedException {
        // Create a CountDownLatch with a count of 1
        CountDownLatch countdownLatch = new CountDownLatch(1);

        // Create a thread for the rocket
        Thread rocketThread = new Thread(() -> {
            try {
                System.out.println("Rocket: Preparing for launch...");
                // Simulating some rocket preparation tasks
                Thread.sleep(2000);

                System.out.println("Rocket: All systems go! Ignition sequence started...");
                // Simulating the ignition sequence
                Thread.sleep(1000);

                System.out.println("Rocket: Liftoff!");
                // Rocket has successfully launched, countdown complete
                countdownLatch.countDown();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });

        // Start the rocket thread
        rocketThread.start();

        // Wait for the rocket launch
        countdownLatch.await();

        System.out.println("Mission Control: Rocket has launched into space!");
    }
}
