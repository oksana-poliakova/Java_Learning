package Basics.FunctionalProgramming.Stream;

import java.util.List;
import java.util.stream.Stream;

/**
 * @author Oksana Poliakova on 13.06.2023
 * @projectName Lesson1
 */

public class StreamExample {
    public static void main(String[] args) {
        final List<String> strings = List.of("11", "22", "84", "88", "33", "44", "55");

        // Converts the list strings into a stream to perform operations on its elements.
        strings.stream()
                //  Applies the string concatenation operation to each string, doubling its value.
                .map(string -> string + string)
                // Converts each string into an integer using the valueOf method of the Integer class.
                .map(Integer::valueOf)
                // Keeps only the even numbers by filtering the values based on the condition of being divisible by 2.
                .filter(value -> value % 2 == 0)
                // Sorts the remaining numbers in ascending order.
                .sorted()
                // Skips the first element of the stream.
                .skip(1)
                // Limits the stream to only two elements.
                .limit(2)
                // This operation transforms the elements of the stream into int values.
                .mapToInt(Integer::intValue)
                // Performs the operation of printing each element to the console.
                .forEach(System.out::println);
        System.out.println("===");

        final List<String> stringStream = Stream.of("1", "5", "545", "2")
                .peek(System.out::println)
                .toList();


    }
}
