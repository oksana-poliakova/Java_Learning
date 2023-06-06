package Basics.Collections;

/**
 * @author Oksana Poliakova on 06.06.2023
 * @projectName Lesson1
 */
public class PersonExample {
    public static void main(String[] args) {
        Person john = new Person(1, "John", "Dou");
        Person peter = new Person(1, "John", "Dou");

        System.out.println(john.hashCode());
        System.out.println(peter.hashCode());
        System.out.println(john.equals(peter));
    }
}
