package Basics.Collections.Iterator;


import Basics.Generics.List.List;

/**
 * @author Oksana Poliakova on 06.06.2023
 * @projectName Lesson1
 */
public class ListExample {

    public static void main(String[] args) {
        List list = new List(10);
        list.add("string1");
        list.add("string2");
        list.add("string3");
        list.add("string4");

        System.out.println(list.getSize());
    }
}

