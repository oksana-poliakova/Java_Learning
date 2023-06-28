package Regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author Oksana Poliakova on 28.06.2023
 * @projectName Lesson1
 */
public class PatternExample {
    public static void main(String[] args) {
        // Phone number to be validated
        String phoneNumber = "+38 (067) 222-22-22";

        // Regular expression pattern for phone number format
        String regex = "(\\+38)? ?\\(\\d{3}\\) ?\\d{3}-\\d{2}-\\d{2}";

        // Compiling the regular expression pattern
        Pattern pattern = Pattern.compile(regex);

        // Creating a Matcher object with the input string and the pattern
        Matcher matcher = pattern.matcher(phoneNumber);
        System.out.println(matcher.matches());

        // Alternatively, using Pattern.matches() method to validate the phone number
        System.out.println(Pattern.matches(regex, phoneNumber));

        // Alternatively, using String.matches() method to validate the phone number
        System.out.println(phoneNumber.matches(regex));
    }
}
