package OOP.GeneralPracticeTask.Heroes;

import OOP.GeneralPracticeTask.Enemy.Enemy;
import OOP.GeneralPracticeTask.Weapon.MeleeWeapon;

/**
 * @author Oksana Poliakova on 02.06.2023
 * @projectName Lesson1
 */
public class Warrior<T extends MeleeWeapon> extends Hero<T> {
    public Warrior(String name, int damage) {
        super(name, damage);
    }

    @Override
    public void attackEnemy(Enemy enemy) {
        System.out.println("Warrior has attacked " + enemy.getName());
        enemy.takeDamage(getDamage());
    }
}
