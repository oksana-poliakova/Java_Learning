package Regex.SubstringReplacement;

/**
 * @author Oksana Poliakova on 28.06.2023
 * @projectName Lesson1
 */
public class ReplaceAllExample {
    public static void main(String[] args) {
        String input = "Hello, $1! How are you, $2 and $3?";
        String pattern1 = "\\$1";
        String replacement1 = "Alice";
        String pattern2 = "\\$2";
        String replacement2 = "Bob";
        String pattern3 = "\\$3";
        String replacement3 = "Charlie";
        String output = input.replaceAll(pattern1, replacement1)
                .replaceAll(pattern2, replacement2)
                .replaceAll(pattern3, replacement3);
        
        System.out.println(output);
    }
}
