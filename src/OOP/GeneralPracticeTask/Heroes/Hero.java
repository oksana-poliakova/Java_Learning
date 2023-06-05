package OOP.GeneralPracticeTask.Heroes;

import OOP.GeneralPracticeTask.Enemy.Enemy;

/**
 * @author Oksana Poliakova on 02.06.2023
 * @projectName Lesson1
 */
public abstract class Hero<T> {

    private final String name;
    private final int damage;
    private T weapon;

    public Hero(String name, int damage) {
        this.name = name;
        this.damage = damage;
    }

    public abstract void attackEnemy(Enemy enemy);

    public String getName() {
        return name;
    }

    public int getDamage() {
        return damage;
    }

    public T getWeapon() {
        return weapon;
    }

    public void setWeapon(T weapon) {
        this.weapon = weapon;
    }
}
