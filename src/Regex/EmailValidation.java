package Regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author Oksana Poliakova on 28.06.2023
 * @projectName Lesson1
 */

/*
^ - start of the string.
[A-Za-z0-9._%+-]+ matches one or more characters that can be letters (both uppercase and lowercase), digits, periods, underscores, percent signs, plus signs, or hyphens. This represents the email username.
@ matches the "@" symbol.
[A-Za-z0-9.-]+ matches one or more characters that can be letters (both uppercase and lowercase), digits, periods, or hyphens. This represents the email domain name.
\\. matches a literal dot (escaped with backslash).
[A-Za-z]{2,} matches two or more letters, representing the top-level domain (e.g., com, net, org).
$ asserts the end of the string.
*/

public class EmailValidation {
    public static void main(String[] args) {
        String email = "email@gmail.com";
        String regex = "^[A-Za-z0-9._%+-]+@[A-Za-z0-9.-]+\\.[A-Za-z]{2,}$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(email);
        System.out.println(matcher.matches());
    }
}
