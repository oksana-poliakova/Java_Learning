package Concurrent.Semaphore;

import java.util.concurrent.Semaphore;

class SemaphoreExample {
    private static final int PUPIL_COUNT = 5;
    private static final int MAX_CLASS_SIZE = 2;

    private static Semaphore classroomSemaphore = new Semaphore(MAX_CLASS_SIZE);

    public static void main(String[] args) {
        for (int i = 1; i <= PUPIL_COUNT; i++) {
            Thread thread = new Thread(new Pupil(i));
            thread.start();
        }
    }

    static class Pupil implements Runnable {
        private int id;

        public Pupil(int id) {
            this.id = id;
        }

        @Override
        public void run() {
            try {
                System.out.println("Pupil " + id + " is waiting to enter the classroom.");
                classroomSemaphore.acquire();
                System.out.println("Pupil " + id + " entered the classroom.");

                // Simulate attending the class
                Thread.sleep(2000);

                System.out.println("Pupil " + id + " finished attending the class.");

                classroomSemaphore.release();
                System.out.println("Pupil " + id + " left the classroom.");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
