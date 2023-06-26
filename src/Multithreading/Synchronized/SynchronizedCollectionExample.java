package Multithreading.Synchronized;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * @author Oksana Poliakova on 26.06.2023
 * @projectName Lesson1
 */
public class SynchronizedCollectionExample {
    public static void main(String[] args) {
        // Create a synchronized list
        List<String> synchronizedList = Collections.synchronizedList(new ArrayList<>());

        // Add elements to the list in multiple threads
        Thread thread1 = new Thread(() -> {
            for (int i = 0; i < 1000; i++) {
                synchronizedList.add("Element " + i);
            }
        });

        Thread thread2 = new Thread(() -> {
            for (int i = 0; i < 1000; i++) {
                synchronizedList.add("Element " + i);
            }
        });

        thread1.start();
        thread2.start();

        try {
            thread1.join();
            thread2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Size of synchronized list: " + synchronizedList.size());
    }
}
