package Basics;

/**
 * @author Oksana Poliakova on 29.05.2023
 * @projectName Lesson1
 */
public class StaticKeyword {
    public static void main(String [] args) {
        Dog dog1 = new Dog("Rex", 2);
        Dog.description = "It's a nice dog.";
        dog1.getAllProperties();
        Dog dog2 = new Dog("Bob", 2);
        dog2.printNumberOfDogs();
    }
}

class Dog {
    private String name;
    private int age;
    private static int countOfDogs;
    public static String description;

    public Dog(String name, int age) {
        this.name = name;
        this.age = age;
        countOfDogs++;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public static void getDescription() {
//        System.out.println(description);
    }

    public void getAllProperties() {
        System.out.println(name + ", " + age + ", " + description);

        // example of using static methods and vars without creating the class object
//        System.out.println(Math.pow(2, 4));
//        System.out.println(Math.PI);
    }

    public void printNumberOfDogs() {
//        System.out.println("Count of dogs is " + countOfDogs);
    }
}
