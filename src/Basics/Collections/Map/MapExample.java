package Basics.Collections.Map;

import Basics.Collections.Person;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Oksana Poliakova on 08.06.2023
 * @projectName Lesson1
 */
public class MapExample {
    public static void main(String[] args) {
        Person john = new Person(1, "John", "Dou");
        Person peter = new Person(2, "John", "Dou");

        Map<Integer, Person> map = new HashMap<>();
        map.put(john.getId(), john);
        map.put(peter.getId(), peter);

        System.out.println(map.get(2));
    }
}
