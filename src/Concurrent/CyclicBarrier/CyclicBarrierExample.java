package Concurrent.CyclicBarrier;

import java.util.concurrent.CyclicBarrier;

/**
 * @author Oksana Poliakova on 27.06.2023
 * @projectName Lesson1
 */
public class CyclicBarrierExample {
    private static final int THREAD_COUNT = 3;

    public static void main(String[] args) {
        // Create a CyclicBarrier specifying the number of threads required to reach the barrier
        CyclicBarrier barrier = new CyclicBarrier(THREAD_COUNT, () -> {
            // This code will be executed after all threads have reached the barrier
            System.out.println("All threads have reached the barrier. Continuing...");
        });

        // Create and start threads
        for (int i = 0; i < THREAD_COUNT; i++) {
            Thread thread = new Thread(new Worker(barrier));
            thread.start();
        }
    }
}
