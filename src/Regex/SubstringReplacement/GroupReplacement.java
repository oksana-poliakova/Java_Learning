package Regex.SubstringReplacement;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author Oksana Poliakova on 28.06.2023
 * @projectName Lesson1
 */
public class GroupReplacement {
    public static void main(String[] args) {
        String text = "Hello, John Doe";
        String regex = "(\\w+), (\\w+) (\\w+)";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(text);

        if (matcher.matches()) {
            String lastName = matcher.group(1);
            String firstName = matcher.group(2);
            String middleName = matcher.group(3);

            System.out.println("Last Name: " + lastName);
            System.out.println("First Name: " + firstName);
            System.out.println("Middle Name: " + middleName);
        }
    }
}
