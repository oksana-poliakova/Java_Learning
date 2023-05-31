package Practice;

import java.util.Arrays;

/**
 * @author Oksana Poliakova on 31.05.2023
 * @projectName Lesson1
 */

public class StringPractice {
    public static void main(String[] args) {
        String emoji = "emoji1 :( emoji2 :) emoji3 :) emoji4 :) emoji5 :(";
        String str = "123 Lorem ipsum dolor 123d";
        String word = "123";
        String result = replace(emoji);
        String stringWithMarks = "Some text ,,, with !!! ...";
        String stringWithNumbers = "1234567890";
        int n = 3;
        String[] resultOffSplitedArray = split(stringWithNumbers, n);
        System.out.println(Arrays.toString(resultOffSplitedArray));

        System.out.println(result);
        System.out.println(isStartAndEnd(str, word));
        System.out.println(generateInitials("Oksana", "Poliakova", "Viktorovna"));
        System.out.println(countMarks(stringWithMarks));

    }

    // 1. Replace all sad emojis with funny ones.
    public static String replace(String value) {
        return value.replace(":(", ":)");
    }

    // 2. Write a function that takes two parameters: a string and a word, and return true if the string starts and ends with that word.
    public static boolean isStartAndEnd(String target, String word) {
        return target.startsWith(word) && target.endsWith(word);
    }

    // 3. Write a function with first name, last name and patronymic parameters and which returns initials in F.L.P format.
    // The input parameters can be in any case, and the string result must be in upper case.

    public static String generateInitials(String firstName, String lastName, String patronymicName) {
        char firstNameChar = firstName.toUpperCase().charAt(0);
        char lastNameChar = lastName.toUpperCase().charAt(0);
        char patronymicNameChar = patronymicName.toUpperCase().charAt(0);

//        return firstNameChar + "." + lastNameChar + "." + patronymicNameChar + ".";
        return String.format("%s.%s.%s", firstNameChar, lastNameChar, patronymicNameChar);
    }

    // 4. Count the number of all dots, commas, and exclamation marks in a string.
    public static int countMarks(String value) {
        String result = value.replace(".", "")
                .replace(",", "")
                .replace("!", "");
        return value.length() - result.length();
    }

    // 5. Write a function that splits a string into equal parts of n characters, and stores the individual parts in an array.
    // Output this array.

    public static String[] split(String value, int n) {
        int arraySize = (int) Math.ceil(value.length() / (double) n);
        String[] result = new String[arraySize];
        int counter = 0;
        for (int i = 0; i < value.length(); i += n) {
            int endIndex = Math.min(value.length(), i + n);
            String substring = value.substring(i, endIndex);
            result[counter] = substring;
            counter++;
        }
        return result;
    }
}
