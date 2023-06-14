package Basics.FunctionalProgramming.Stream.MapReduce;

import java.util.stream.Stream;

/**
 * @author Oksana Poliakova on 13.06.2023
 * @projectName Lesson1
 */
public class MapReduceExample {
    public static void main(String[] args) {
        Stream.of(
                new Student("Alice", 20),
                new Student("Bob", 19),
                new Student("Charlie", 21),
                new Student("David", 18),
                new Student("Emma", 22)
        )
                .sequential() // one thread
                .parallel() // two and more threads, potentially improving performance
                .filter(student -> student.getAge() > 20) // filter the stream to keep only the students whose age is greater than 20
                .map(Student::getAge)// map the remaining students to their ages
                .reduce(Math:: min) // reduce the stream by finding the minimum age
                .ifPresent(System.out::println); // if a minimum age is present, we print it
    }
}
