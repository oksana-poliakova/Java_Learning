package OOP.GeneralPracticeTask;

/**
 * @author Oksana Poliakova on 02.06.2023
 * @projectName Lesson1
 */
public class Archer extends Hero {

    private Wolf wolf;

    public Archer(String name, int damage) {
        super(name, damage);
        this.wolf = new Wolf("Wolf", 8);
    }

    @Override
    public void attackEnemy(Enemy enemy) {
        System.out.println("Archer has attacked " + enemy.getName());
        enemy.takeDamage(getDamage());
        wolf.attackEnemy(enemy);
    }

    // Inner class: can be private, public
    private class Wolf {
        private final String name;
        private final int damage;

        public Wolf(String name, int damage) {
            this.name = name;
            this.damage = damage;
        }

        public void attackEnemy(Enemy enemy) {
            enemy.takeDamage(damage + Archer.this.getDamage());

            // Local class
            class LocalTestClass {

            }

            LocalTestClass localTestClass = new LocalTestClass();
        }
    }

    static class SecondWolf {

        String name;

        public SecondWolf(String name) {
            this.name = name;
        }
    }
}
