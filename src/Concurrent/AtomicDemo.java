package Concurrent;

import java.util.concurrent.atomic.AtomicInteger;

/**
 * @author Oksana Poliakova on 27.06.2023
 * @projectName Lesson1
 */
public class AtomicDemo {
    public static void main(String[] args) {
        AtomicInteger atomicInteger = new AtomicInteger();
        int value = atomicInteger.incrementAndGet();
        System.out.println(value);

        int newValue = atomicInteger.addAndGet(20);
        System.out.println(newValue);
    }
}
