package Multithreading;

/**
 * @author Oksana Poliakova on 26.06.2023
 * @projectName Lesson1
 */
public class SimpleThread extends Thread {
    @Override
    public void run() {
        System.out.println("Hello " + getName());
    }
}
