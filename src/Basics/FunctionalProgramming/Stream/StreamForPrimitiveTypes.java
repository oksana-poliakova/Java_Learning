package Basics.FunctionalProgramming.Stream;

import java.util.IntSummaryStatistics;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;

/**
 * @author Oksana Poliakova on 13.06.2023
 * @projectName Lesson1
 */
public class StreamForPrimitiveTypes {
    public static void main(String[] args) {
        IntStream.range(0, 5)
                .forEach(System.out::println);
        System.out.println("===");

        IntStream.range(1, 6)
                .filter(n -> n % 2 == 0)
                .forEach(System.out::println);

        double sum = DoubleStream.of(1.5, 2.7, 3.2, 4.9)
                .map(d -> d * 2)
                .sum();
        System.out.println("Sum: " + sum);
        System.out.println("===");

        IntStream stream = IntStream.of(1, 2, 3, 4, 5);
        IntSummaryStatistics stats = stream.summaryStatistics();

        System.out.println("Count: " + stats.getCount());
        System.out.println("Sum: " + stats.getSum());
        System.out.println("Average: " + stats.getAverage());
        System.out.println("Min: " + stats.getMin());
        System.out.println("Max: " + stats.getMax());
    }
}
