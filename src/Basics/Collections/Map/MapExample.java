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
        Person alice = new Person(2, "Alice", "Dou");

        Map<Integer, Person> map = new HashMap<>();
        map.put(john.getId(), john);
        map.put(alice.getId(), alice);

        System.out.println(map.get(2));
        System.out.println(map.keySet()); // all keys
        System.out.println(map.values()); // all values
        System.out.println(map.entrySet()); // all pair keys-values

        for (Person person : map.values()) {
            System.out.println(person.getFirstName());
        }

        for (Map.Entry<Integer, Person> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }

        System.out.println(map.containsKey(2));;
        System.out.println(map.size());
        System.out.println(map.isEmpty());
        System.out.println(map.getOrDefault(5, alice));

    }
}
