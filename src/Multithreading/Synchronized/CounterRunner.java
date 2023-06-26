package Multithreading.Synchronized;

/**
 * @author Oksana Poliakova on 26.06.2023
 * @projectName Lesson1
 */

/* In this example, the Counter class has two synchronized methods: increment() and getCount().
The thread1 and thread2 threads increment the count variable in the counter object.
Due to the use of synchronized, only one thread can perform the increment operation at any given time,
ensuring the correctness of the results.
 */

public class CounterRunner {
    public static void main(String[] args) {
        Counter counter = new Counter();

        Thread thread1 = new Thread(() -> {
            for (int i = 0; i < 1000; i++) {
                counter.increment();
            }
        });

        Thread thread2 = new Thread(() -> {
            for (int i = 0; i < 1000; i++) {
                counter.increment();
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

        System.out.println("Count: " + counter.getCount());
    }
}
