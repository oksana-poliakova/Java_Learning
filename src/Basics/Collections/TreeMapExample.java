package Basics.Collections;

import java.util.Map;
import java.util.TreeMap;

/**
 * @author Oksana Poliakova on 08.06.2023
 * @projectName Lesson1
 */
public class TreeMapExample {
    public static void main(String[] args) {
        Person name1 = new Person(1, "Name1", "LastName1");
        Person name2 = new Person(41, "Name2", "LastName2");
        Person name3 = new Person(14, "Name3", "LastName3");
        Person name4 = new Person(13, "Name4", "LastName4");
        Person name5 = new Person(31, "Name5", "LastName5");
        Person name6 = new Person(17, "Name6", "LastName6");
        Person name7 = new Person(39, "Name7", "LastName7");

        // TreeMap sorts by key
        Map<Integer, Person> map = new TreeMap<>();
        map.put(name1.getId(), name1);
        map.put(name2.getId(), name2);
        map.putIfAbsent(name3.getId(), name3);
        map.putIfAbsent(name4.getId(), name4);
        map.putIfAbsent(name5.getId(), name5);
        map.putIfAbsent(name6.getId(), name6);
        map.putIfAbsent(name7.getId(), name7);

        for (Map.Entry<Integer, Person> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }
    }
}
