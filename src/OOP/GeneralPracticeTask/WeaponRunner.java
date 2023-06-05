package OOP.GeneralPracticeTask;

import OOP.GeneralPracticeTask.Heroes.Archer;
import OOP.GeneralPracticeTask.Heroes.Hero;
import OOP.GeneralPracticeTask.Heroes.Warrior;
import OOP.GeneralPracticeTask.Weapon.Bow;
import OOP.GeneralPracticeTask.Weapon.Sword;
import OOP.GeneralPracticeTask.Weapon.Weapon;

/**
 * @author Oksana Poliakova on 05.06.2023
 * @projectName Lesson1
 */
public class WeaponRunner {
    public static void main(String[] args) {
        Archer<Bow> archer = new Archer<>("Jack", 15);
        archer.setWeapon(new Bow());

        Warrior<Sword> warrior = new Warrior<>("John", 10);
        warrior.setWeapon(new Sword());

        printWeaponDamage(archer);
    }

    public static <T extends Weapon> void printWeaponDamage(Hero<T> hero) {
        System.out.println(hero.getWeapon().getDamage());
    }
}
