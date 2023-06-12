package Practice.Exceptions;

/**
 * @author Oksana Poliakova on 12.06.2023
 * @projectName Lesson1
 */
public class CustomException extends Exception {

    public CustomException(String message) {
        super(message);
    }

    public CustomException(Throwable cause) {
        super(cause);
    }
}
