package Basics;

public class ClassesAndObjects {
    public static void main(String [] args) {
        // object
        Person person1 = new Person();
        person1.setNameAndAge("John", 42);
        person1.sayHello();

        Person person2 = new Person();
        person2.setNameAndAge("Alice", 20);
        person2.introduce();
        int year2 = person2.calculateYearsToRetirement();
//        System.out.println("Number of years until retirement: " + year2 + " years");

        Person [] people = new Person[] { person1, person2 };
//        System.out.println(people[0].age);
    }
}

class Person {
    String name;
    int age;

    void introduce() {
//        System.out.println("My name is " + name + " and I'm " + age + " years old");
    }

    void sayHello() {
//        System.out.println("Hello from " + name);
    }

    int calculateYearsToRetirement() {
        int years = 65 - age;
        return years;
    }

    void setNameAndAge(String username, int userAge) {
        name = username;
        age = userAge;
    }
}
