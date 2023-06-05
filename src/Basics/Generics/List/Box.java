package Basics.Generics.List;

/**
 * @author Oksana Poliakova on 05.06.2023
 * @projectName Lesson1
 */
public class Box<T> {
    private T content;

    public void setContent(T content) {
        this.content = content;
    }

    public T getContent() {
        return content;
    }
}
