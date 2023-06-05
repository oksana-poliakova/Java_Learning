package Basics.Generics;

/**
 * @author Oksana Poliakova on 05.06.2023
 * @projectName Lesson1
 */
public class ListRunner {
    public static void main(String[] args) {
        ListGeneric<String> list = new ListGeneric<>(8);
        list.add("String1");
        list.add("String2");

        final Object element = list.get(1);
        System.out.println(element);
    }
}
