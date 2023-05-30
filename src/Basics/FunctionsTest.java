package Basics;

/**
 * @author Oksana Poliakova on 30.05.2023
 * @projectName Lesson1
 */
public class FunctionsTest {

    // String[] args - parameter with the array of strings
    public static void main(String[] args) {
        int value1 = 5;
        int value2 = 10;

        int factorial = factorial(5);
        System.out.println(factorial);
    }

    public static int getMaxValue(int firstValue, int secondValue) {
        if (firstValue > secondValue) {
            return firstValue;
        } else {
            return secondValue;
        }
    }

    // Recursion example. Write the factorial of the entered number
    // 1 * 2 * 3 * 4 * 5 * 6 = 6!

    public static int factorial(int value) {
        if (value == 1) {
            return 1;
        }
        // 5 * (5-1) * (4-1) * (3-1) * (2-1) * 1 = 120
        return value * factorial(value - 1);
    }
}

