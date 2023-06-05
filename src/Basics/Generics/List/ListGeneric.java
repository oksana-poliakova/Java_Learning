package Basics.Generics.List;

/**
 * @author Oksana Poliakova on 05.06.2023
 * @projectName Lesson1
 */
public class ListGeneric<T> {

    private T[] objects;
    private int size;

    public ListGeneric(int initialSize) {
        this.objects = (T[]) new Object[initialSize];
    }

    public void add(T element) {
        objects[size++] = element;
    }

    public T get(int index) {
        return objects[index];
    }

    public int getSize() {
        return size;
    }
}
