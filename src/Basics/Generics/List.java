package Basics.Generics;

/**
 * @author Oksana Poliakova on 05.06.2023
 * @projectName Lesson1
 */
public class List {

    private final Object[] objects; // array of objects that will be used to store the elements of the list.
    private int size;       //  variable that indicates the current number of elements in the list

    // The List constructor takes an initial size (initialSize) and creates an array objects of the specified size
    public List(int initialSize) {
        this.objects = new Object[initialSize];
    }

    // The add method adds an element to the list. It takes an element object and puts it into the objects array at the size position.
    // Then, the value of size is incremented by 1 to indicate the next available position in the array.
    public void add(Object element) {
        objects[size++] = element;
    }

    // The get method returns an element from the list based on the specified index.
    // It simply retrieves the object stored in the objects array at the given index.
    public Object get(int index) {
        return objects[index];
    }

    public int getSize() {
        return size;
    }
}
