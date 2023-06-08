package Basics.Collections.Map;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Oksana Poliakova on 08.06.2023
 * @projectName Lesson1
 */
public class StudentScores {
    public static void main(String[] args) {
        // HashMap is a specific implementation of the Map interface
        Map<String, Integer> studentScores = new HashMap<>();
        studentScores.put("Alice", 90); // method is used to add key-value pairs
        studentScores.put("Bob", 85);
        studentScores.put("Charlie", 95);

        // get() retrieves the value associated with a specific key
        System.out.println(studentScores.get("Bob")); // 85

        studentScores.remove("Alice"); // removes a key-value pair

        // checks if a key exists in the map
        System.out.println(studentScores.containsKey("Alice")); // false

        // returns a set of all the keys in the map
        System.out.println(studentScores.keySet()); // [Bob, Charlie]
    }
}
