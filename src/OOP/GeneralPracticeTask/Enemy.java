package OOP.GeneralPracticeTask;

/**
 * @author Oksana Poliakova on 02.06.2023
 * @projectName Lesson1
 */
public class Enemy implements Mortal {
    private int health;
    private String name;

    public Enemy(String name, int health) {
        this.name = name;
        this.health = health;
    }

    @Override
    public boolean isAlive() {
        return health > 0;
    }

    public void takeDamage(int damage) {
        if (isAlive() && health <= damage) {
            health = 0;
            System.out.println(getName() + " is dead.");
        } else {
            this.health -= Math.min(health, damage);
            System.out.println(name + " took damage " + damage + ". Remaining Health: " + health);
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(String name, int health) {
        this.name = name;
        this.health = health;
    }
}
