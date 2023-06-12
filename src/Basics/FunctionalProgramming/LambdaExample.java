package Basics.FunctionalProgramming;

import java.util.Comparator;

/**
 * @author Oksana Poliakova on 12.06.2023
 * @projectName Lesson1
 */
public class LambdaExample {
    public static void main(String[] args) {
        // first form of lambda
        Comparator<Integer> newComparator = (o1, o2) -> Integer.compare(o1, o2);
        // shorter form, it's a reference to the method inside the class
        Comparator<Integer> newComparator2 = Integer::compare;

        System.out.println(newComparator.compare(34, 55));
        System.out.println(newComparator2.compare(23, 3));
    }
}
