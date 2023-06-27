package Concurrent;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @author Oksana Poliakova on 27.06.2023
 * @projectName Lesson1
 */

/* In this example, LockExample contains a ReentrantLock lock that is used to synchronize access to the count variable.
The increment() method acquires the lock before incrementing the value of count and then releases the lock after the operation is performed.
This ensures safe access to the count variable from multiple threads.
*/
public class LockDemo {
    private Lock lock = new ReentrantLock();
    private int count = 0;

    public void increment() {
        lock.lock();
        try {
            count++;
        } finally {
            lock.unlock();
        }
    }

    public int getCount() {
        return count;
    }
}
