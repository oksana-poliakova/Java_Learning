package Regex.SubstringReplacement;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author Oksana Poliakova on 28.06.2023
 * @projectName Lesson1
 */
public class StringReplacementExample {
    public static void main(String[] args) {
        String text = "The quick brown fox jumps over the lazy dog.";
        String regex = "\\b(\\w{5})\\w*\\b";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(text);

        StringBuffer stringBuffer = new StringBuffer();

        // find words with 5 letters and make to uppercase register
        while (matcher.find()) {
            String match = matcher.group();
            String replacement = match.toUpperCase();
            matcher.appendReplacement(stringBuffer, replacement);
        }

        matcher.appendTail(stringBuffer);
        String replacedText = stringBuffer.toString();
        System.out.println(replacedText);
    }
}
