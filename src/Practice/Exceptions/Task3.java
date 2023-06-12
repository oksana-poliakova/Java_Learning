package Practice.Exceptions;

/**
 * @author Oksana Poliakova on 12.06.2023
 * @projectName Lesson1
 */

/**
 * Create your own exception class - an inheritor of the Exception class.
 * Create a method that throws this exception. Call this method and catch the exception.
 */

public class Task3 {
    public static void main(String[] args) {
        try {
            unsafe();
        } catch (CustomException e) {
            System.out.println(e.getCause());
            System.out.println(e.getMessage());
            throw new RuntimeException(e);
        }
    }

    public static void unsafe() throws CustomException {
        throw new CustomException("Test exception");
    }
}
