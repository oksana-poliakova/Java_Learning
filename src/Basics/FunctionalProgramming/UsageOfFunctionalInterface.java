package Basics.FunctionalProgramming;

/**
 * @author Oksana Poliakova on 12.06.2023
 * @projectName Lesson1
 */

/** In this example, we create an object of type MyFunction using a lambda expression
() -> { System.out.println("Doing something"); }.
We then call the doSomething() method of this object, which prints the message "Doing something" to the console.
 */

public class UsageOfFunctionalInterface {
    public static void main(String[] args) {
        MyFunction func = () -> {
            System.out.println("Do something");
        };
    }
}
