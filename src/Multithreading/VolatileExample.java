package Multithreading;

/**
 * @author Oksana Poliakova on 26.06.2023
 * @projectName Lesson1
 */
public class VolatileExample {
    // The volatile keyword guarantees the visibility of changes to this variable between threads.
    // Since the flag variable is declared as volatile, the change in the value of flag in thread2 guarantees its immediate visibility in thread1.
    // As a result, thread1 exits the loop, and the program execution completes.
    private static volatile boolean flag = false;

    public static void main(String[] args) throws InterruptedException {
        Thread thread1 = new Thread(() -> {
            while (!flag) {
                System.out.println("still false");
            }
        });
        thread1.start();

        Thread.sleep(5L);

        Thread thread2 = new Thread(() -> {
            flag = true;
            System.out.println("flag is set");
        });
        thread2.start();
    }
}
