public class ClassesAndObjects {
    public static void main(String [] args) {
        // object
        Person person1 = new Person();
        person1.name = "John";
        person1.age = 20;

        Person person2 = new Person();
        person2.name = "Alice";
        person2.age = 25;

        Person [] people = new Person[] { person1, person2 };
        System.out.println(people[0].age);
    }
}

class Person {
    String name;
    int age;
}
