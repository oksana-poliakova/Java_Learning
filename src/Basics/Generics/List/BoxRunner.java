package Basics.Generics.List;

/**
 * @author Oksana Poliakova on 05.06.2023
 * @projectName Lesson1
 */
public class BoxRunner {
    public static void main(String[] args) {

        Box<String> box1 = new Box<>();
        box1.setContent("Some text");

        Box<Integer> box2 = new Box<>();
        box2.setContent(42);

        Box<Boolean> box3 = new Box<>();
        box3.setContent(true);

        // (?) is used as a type argument to allow the array to hold any type of Box, regardless of the generic type argument
        Box<?>[] boxes = new Box<?>[2];
        boxes[0] = box1;
        boxes[1] = box2;
        boxes[3] = box3;

        System.out.println(boxes.length);
    }
}
