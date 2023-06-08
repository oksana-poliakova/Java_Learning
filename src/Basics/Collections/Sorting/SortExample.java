package Basics.Collections.Sorting;

import Basics.Collections.Person;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * @author Oksana Poliakova on 08.06.2023
 * @projectName Lesson1
 */

/** Class Person must implement Comparable and override methods
 * public class Person implements Comparable<Person>
 * Override
 *     public int compareTo(Person o) {
 *         return Integer.compare(id, o.id);
 * }
 */
public class SortExample {
    public static void main(String[] args) {
        final List<String> strings = Arrays.asList("123", "234", "32", "654");

        Collections.sort(strings);
        System.out.println(strings);

        List<Person> personList = Arrays.asList(
                new Person(1, "John", "Dou"),
                new Person(25, "Alice", "Smith"),
                new Person(3, "Mary", "Williams")
        );

        Collections.sort(personList);
        System.out.println(personList);
        System.out.println();

        // Sorting first names using comparator
        personList.sort(new FirstNameComparator());
        System.out.println(personList);

        // Sorting first names without creating comparator
        personList.sort(Comparator.comparing(Person::getFirstName));
        System.out.println(personList);
        System.out.println();

        // Sorting first name and last name
        personList.sort(Comparator.comparing(Person::getFirstName).thenComparing(Person::getLastName));
        System.out.println(personList);
    }

    public static class FirstNameComparator implements Comparator<Person> {
        @Override
        public int compare(Person o1, Person o2) {
            return o1.getFirstName().compareTo(o2.getFirstName());
        }
    }
}
