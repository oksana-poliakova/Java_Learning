package Practice.Exceptions;

/**
 * @author Oksana Poliakova on 12.06.2023
 * @projectName Lesson1
 */

/**
 * Declare a variable with null value. Call a method on this variable. Catch the thrown exception.
 */

public class Task1 {
    public static void main(String[] args) {
        String value = null;
        try {
            value.length();
        } catch (NullPointerException exception) {
            System.err.println("Catch");
            exception.printStackTrace();
        }
    }
}
