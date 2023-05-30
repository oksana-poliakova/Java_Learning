package OOP;

/**
 * @author Oksana Poliakova on 30.05.2023
 * @projectName Lesson1
 */
public class Inheritance {
    public static void main(String [] args) {
        Dog dog = new Dog();
        dog.eat();
    }
}

class Animal {
    public void eat() {
//        System.out.println("I can eat");
    }

    public void sleep() {
//        System.out.println("I can sleep");
    }
}

class Dog extends Animal {
    public void bark() {
//        System.out.println("I can bark");
    }

    public void eat() { // overriding
//        System.out.println("Dog can eat");
    }
}