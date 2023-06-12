package Basics.Exceptions;

import java.io.FileNotFoundException;
import java.util.concurrent.TimeoutException;

/**
 * @author Oksana Poliakova on 12.06.2023
 * @projectName Lesson1
 */
public class ExceptionExample {
    public static void main(String[] args) {
        System.out.println("Main starts");
        try {
            unsafe(-10);
        } catch (FileNotFoundException | TimeoutException exception) {
            // handle exception
            exception.printStackTrace();
        }
        System.out.println("Main ends");
        // code
    }

    public static void unsafe(int value) throws FileNotFoundException, TimeoutException {
        System.out.println("Unsafe method starts");
        if (value > 0) {
            throw new FileNotFoundException();
        }
        System.out.println("Unsafe method ends");
    }
}
