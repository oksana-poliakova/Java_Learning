package Basics.FunctionalProgramming;

/**
 * @author Oksana Poliakova on 12.06.2023
 * @projectName Lesson1
 */

/**
 * MyFunction is a functional interface that has only one abstract method, doSomething().
 * Note the @FunctionalInterface annotation, which informs the compiler
 * that this interface should be treated as a functional interface.
 */

@FunctionalInterface
public interface MyFunction {
    void doSomething();
}
