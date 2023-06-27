package Multithreading.Deadlock;

/**
 * @author Oksana Poliakova on 27.06.2023
 * @projectName Lesson1
 */

/* We have two threads, thread1 and thread2, locking resources resource1 and resource2 respectively.
Both threads attempt to acquire resources held by the other thread, leading to a deadlock situation. */

public class DeadlockExample {
    private static Object resource1 = new Object();
    private static Object resource2 = new Object();

    public static void main(String[] args) {
        Thread thread1 = new Thread(() -> {
            synchronized (resource1) {
                System.out.println("Thread 1: Holding resource 1...");
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("Thread 1: Waiting for resource 2...");
                synchronized (resource2) {
                    System.out.println("Thread 1: Holding resource 1 and resource 2...");
                }
            }
        });

        Thread thread2 = new Thread(() -> {
            synchronized (resource2) {
                System.out.println("Thread 2: Holding resource 2...");
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("Thread 2: Waiting for resource 1...");
                synchronized (resource1) {
                    System.out.println("Thread 2: Holding resource 2 and resource 1...");
                }
            }
        });

        thread1.start();
        thread2.start();
    }
}

