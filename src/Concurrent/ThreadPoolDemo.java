package Concurrent;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @author Oksana Poliakova on 27.06.2023
 * @projectName Lesson1
 */

/* a thread pool is created using the Executors.newFixedThreadPool() method with a fixed number of threads (5).
Tasks are then submitted to the thread pool using the submit() method,
and each task is executed concurrently by one of the available threads in the pool.
Finally, the thread pool is shut down using the shutdown() method to gracefully terminate all threads
* */
    
public class ThreadPoolDemo {
    public static void main(String[] args) {
        // Create a thread pool with a fixed number of threads
        ExecutorService executor = Executors.newFixedThreadPool(5);

        // Submit tasks to the thread pool
        for (int i = 0; i < 10; i++) {
            final int taskId = i;
            executor.submit(() -> {
                System.out.println("Task " + taskId + " executed by " + Thread.currentThread().getName());
            });
        }

        // Shut down the thread pool
        executor.shutdown();
    }
}
