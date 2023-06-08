package Basics.Collections.Set;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

/**
 * @author Oksana Poliakova on 08.06.2023
 * @projectName Lesson1
 */

//  new LinkedHashSet<>();
//  new HashSet<>() includes HashMap
//  new TreeSet<>() includes TreeMap, for sorting

public class SetExample {
    public static void main(String[] args) {

        Set<String> set = new HashSet<>();
        set.add("aaa");
        set.add("bbb");
        set.add("ccc");
        set.add("ddd");
        set.add("eee");
        set.add("aaa");

        System.out.println(set);

        // sorted
        Set<String> orderedSet = new LinkedHashSet<>();
        orderedSet.add("value1");
        orderedSet.add("value2");
        orderedSet.add("value3");

        System.out.println(orderedSet);

    }
}
