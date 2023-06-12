package Practice.Exceptions;

/**
 * @author Oksana Poliakova on 12.06.2023
 * @projectName Lesson1
 */

/**
 *  Write code that will create and catch ArrayIndexOutOfBoundsException
 */
public class Task2 {
    public static void main(String[] args) {
        int[] values = {4, 54, 43, 23, 432};

        try {
            for (int i = 0; i <= values.length; i++) {
                System.out.println(values[i]);
            }
        } catch (ArrayIndexOutOfBoundsException exception) {
            System.err.println("Catch");
            exception.printStackTrace();
        }
    }
}
