package OOP.GeneralPracticeTask;

import OOP.GeneralPracticeTask.Heroes.Archer;
import OOP.GeneralPracticeTask.Heroes.Warrior;
import OOP.GeneralPracticeTask.Weapon.Bow;
import OOP.GeneralPracticeTask.Weapon.Sword;

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
    }
}
