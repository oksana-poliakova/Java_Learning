package Regex.SubstringReplacement;

/**
 * @author Oksana Poliakova on 28.06.2023
 * @projectName Lesson1
 */
public class ReplacementDemo {
    public static void main(String[] args) {
        // Example 1
        String text = "Hello, World!";
        String newText = text.replace("Hello", "Hi");
        System.out.println(newText);  // Output: Hi, World!

        // Example 2
        StringBuilder sb = new StringBuilder("Hello, World!");
        sb.replace(7, 12, "Java");
        System.out.println(sb.toString());  // Output: Hello, Java!
    }
}
