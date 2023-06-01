package Practice;

import Practice.Encapsulation.TestTask.Point;
import Practice.Encapsulation.TestTask.Rectangle;

/**
 * @author Oksana Poliakova on 31.05.2023
 * @projectName Lesson1
 */
public class EncapsulationPractice {
    public static void main(String[] args) {
        Point coordinate1 = new Point(4,6);
        Point coordinate2 = new Point(10,18);

        System.out.println(coordinate1.distance(coordinate2));
        System.out.println(coordinate2.distance(coordinate1));

        Rectangle rectangle = new Rectangle(coordinate1, coordinate2);
        System.out.println(rectangle.getArea());
        System.out.println(rectangle.getDiagonal());
    }
}




