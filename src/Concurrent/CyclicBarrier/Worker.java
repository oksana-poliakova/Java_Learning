package Concurrent.CyclicBarrier;

import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;

/**
 * @author Oksana Poliakova on 27.06.2023
 * @projectName Lesson1
 */
class Worker implements Runnable {
    private final CyclicBarrier barrier;

    public Worker(CyclicBarrier barrier) {
        this.barrier = barrier;
    }

    public void run() {
        try {
            System.out.println("Thread " + Thread.currentThread().getId() + " is performing some work.");

            // Perform some work

            // Wait for all threads to reach the barrier
            barrier.await();

            System.out.println("Thread " + Thread.currentThread().getId() + " continues its work.");
        } catch (InterruptedException | BrokenBarrierException e) {
            e.printStackTrace();
        }
    }
}
