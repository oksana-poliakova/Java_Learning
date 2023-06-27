package Multithreading.Deadlock.Account;

/**
 * @author Oksana Poliakova on 27.06.2023
 * @projectName Lesson1
 */

public class AccountThread extends Thread {

    private final Account accountFrom;
    private final Account accountTo;

    public AccountThread(Account accountFrom, Account accountTo) {
        this.accountFrom = accountFrom;
        this.accountTo = accountTo;
    }

    @Override
    public void run() {
        // deadlock will be here if we'll make e.g. i < 2000
        for (int i = 0; i < 20; i++) {
            synchronized (accountFrom) {
                synchronized (accountTo) {
                    if (accountFrom.takeOff(10)) {
                        accountTo.add(10);
                    }
                }
            }
        }
    }
}