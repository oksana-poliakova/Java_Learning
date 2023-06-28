package Regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author Oksana Poliakova on 28.06.2023
 * @projectName Lesson1
 */
public class PatternFindExample {
    public static void main(String[] args) {
        String phoneNumber = "sddfg +38 (067) 898-33-13 sdfsdfsdf sdfsdg +38 (068) 777-12-13" +
                "sdsdf +38 (095) 657-13-29 sdfgsfgd +38 (097) 111-11-11 sdf";
        // ? -- optional
        // ?<code> -- name of the group
        // ?: -- exception
        // (...) -- group, can be by index
        String regex = "(?:\\+38)? ?\\((?<code>\\d{3})\\) ?\\d{3}-\\d{2}";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(phoneNumber);
        while (matcher.find()) {
            System.out.println(matcher.group());
            // search by index
            System.out.println(matcher.group(0));
            // search by name
            System.out.println(matcher.group("code"));
        }
    }
}
