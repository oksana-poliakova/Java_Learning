package Basics.Collections;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Oksana Poliakova on 05.06.2023
 * @projectName Lesson1
 */
public class ArrayListRunner {
    public static void main(String[] args) {
        List<Integer> integers = new ArrayList<>(3);
        integers.add(1);
        integers.add(23);
        integers.add(4);

        System.out.println(integers.get(2));
        System.out.println(integers.contains(23));
    }
}
