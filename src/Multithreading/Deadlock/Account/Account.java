package Multithreading.Deadlock.Account;

/**
 * @author Oksana Poliakova on 27.06.2023
 * @projectName Lesson1
 */
public class Account {

    private static int generator = 1;
    private int id;
    private int money;

    public Account(int money) {
        this.money = money;
        this.id = generator++;
    }

    public void add(int money) {
        this.money += money;
    }

    public boolean takeOff(int money) {
        if (this.money >= money) {
            this.money -= money;
            return true;
        }
        return false;
    }

    @Override
    public String toString() {
        return "Account{" +
                "id=" + id +
                ", money=" + money +
                '}';
    }
}