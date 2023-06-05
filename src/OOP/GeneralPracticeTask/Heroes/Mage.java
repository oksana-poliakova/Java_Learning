package OOP.GeneralPracticeTask.Heroes;

import OOP.GeneralPracticeTask.Enemy.Enemy;
import OOP.GeneralPracticeTask.Weapon.MagicWeapon;

/**
 * @author Oksana Poliakova on 02.06.2023
 * @projectName Lesson1
 */
public class Mage<T extends MagicWeapon> extends Hero<T> {
    public Mage(String name, int damage) {
        super(name, damage);
    }

    @Override
    public void attackEnemy(Enemy enemy) {
        System.out.println("Mage has attacked " + enemy.getName());
        enemy.takeDamage(getDamage());
    }
}
