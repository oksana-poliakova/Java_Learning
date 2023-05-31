package Practice;

/**
 * @author Oksana Poliakova on 31.05.2023
 * @projectName Lesson1
 */

/*
* 1. Replace all sad emojis with funny ones.
* 2. Write a function that takes two parameters: a string and a word, and return true if the string starts and ends with that word.
*  */

public class StringPractice {
    public static void main(String[] args) {
        String value = "emoji1 :( emoji2 :) emoji3 :) emoji4 :) emoji5 :(";
        String result = replace(value);
        System.out.println(result);
    }

    public static String replace(String value) {
        return value.replace(":(", ":)");
    }
}
