package OOP.GeneralPracticeTask;

/**
 * @author Oksana Poliakova on 02.06.2023
 * @projectName Lesson1
 */
public class TrainingGround {
    public static void main(String[] args) {
        Archer hero2 = new Archer("Bob", 14);
        Mage hero3 = new Mage("John", 23);
        Warrior hero4 = new Warrior("Oliver", 2);
        Enemy enemy1 = new Enemy("James", 100);

        Archer.SecondWolf wolf = new Archer.SecondWolf("Wolf");

        killEnemy(enemy1, hero2, hero3, hero4);
    }

    public static void killEnemy(Enemy enemy, Hero... heroes) {
        while (enemy.isAlive()) {
            for (Hero hero : heroes) {
                if (enemy.isAlive()) {
                    hero.attackEnemy(enemy);
                }
            }
        }
    }
}
