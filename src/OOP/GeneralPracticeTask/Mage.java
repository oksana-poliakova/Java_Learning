package OOP.GeneralPracticeTask;

/**
 * @author Oksana Poliakova on 02.06.2023
 * @projectName Lesson1
 */
public class Mage extends Hero {
    public Mage(String name, int damage) {
        super(name, damage);
    }

    @Override
    public void attackEnemy(Enemy enemy) {
        System.out.println("Mage has attacked " + enemy.getName());
        enemy.takeDamage(getDamage());
    }
}
