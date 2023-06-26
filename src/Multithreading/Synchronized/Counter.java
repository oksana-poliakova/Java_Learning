package Multithreading.Synchronized;

/**
 * @author Oksana Poliakova on 26.06.2023
 * @projectName Lesson1
 */
public class Counter {
    private int count = 0;

    public synchronized void increment() {
        count++;
    }

    public synchronized int getCount() {
        return count;
    }
}