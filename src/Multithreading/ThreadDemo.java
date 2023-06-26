package Multithreading;

/**
 * @author Oksana Poliakova on 26.06.2023
 * @projectName Lesson1
 */
public class ThreadDemo {
    public static void main(String[] args) {
        SimpleThread simpleThread = new SimpleThread();
        // starts a new thread that will run concurrently with the main thread
        simpleThread.start();
        try {
            // join() method blocks the main thread and waits for simpleThread to finish
            simpleThread.join();
        } catch (InterruptedException e) {
            //  if an InterruptedException occurs, it is caught, and a new RuntimeException is thrown
            throw new RuntimeException(e);
        }
        simpleThread.interrupt();
        System.out.println(Thread.currentThread().getName());

    }
}
