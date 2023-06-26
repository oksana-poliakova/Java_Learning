package Multithreading;

/**
 * @author Oksana Poliakova on 26.06.2023
 * @projectName Lesson1
 */
public class SimpleRunnable implements Runnable {

    @Override
    public void run() {
        System.out.println("Hello from runnable " + Thread.currentThread().getName());
    }
}
