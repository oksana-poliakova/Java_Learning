package Basics.Collections.Iterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * @author Oksana Poliakova on 06.06.2023
 * @projectName Lesson1
 */
public class IteratorExample {
    public static void main(String[] args) {
        final List<Integer> sourceList = List.of(1, 2, 3, 4, 5, 6);
        final List<Integer> list = new ArrayList<>(sourceList);

        for (Integer integer : sourceList) {
            System.out.println(integer);
        }

        System.out.println();

        Iterator<Integer> iterator = sourceList.iterator();
        while (iterator.hasNext()) {
            Integer next = iterator.next();
            System.out.println(next);
        }

        System.out.println();

        // An iterator is created for the list collection.
        // The iterator allows for sequentially iterating over the elements of the collection.
        // Checks if there are more elements to iterate over in the list collection. If there are, the loop continues.
        for (Iterator<Integer> iterator2 = list.iterator(); iterator2.hasNext();) {
            // Retrieves the next element from the collection using the next() method and assigns it to the variable next.
            Integer next = iterator2.next();
            // Checks if the current element next is equal to 3 or 4.
            if (next == 3 || next == 4) {
                // If the current element is equal to 3 or 4 =>
                // the remove() method of the iterator is called to remove that element from the list collection.
                iterator2.remove();
            }
        }
        System.out.println(list);

        List<String> newList = new ArrayList<>();
        newList.add("A");
        newList.add("B");
        newList.add("C");

        Iterator<String> newIterator = newList.iterator();
        while (newIterator.hasNext()) {
            String element = newIterator.next();
            if (element.equals("B")) {
                newIterator.remove(); // Remove the element
            }
        }

        System.out.println(newList);
    }
}
