package Practice.Encapsulation.TestTask;

/**
 * @author Oksana Poliakova on 31.05.2023
 * @projectName Lesson1
 */
public class Rectangle {
    private final Point leftUpperCorner;
    private final Point rightLowerCorner;

    public Rectangle(Point leftUpperCorner, Point rightLowerCorner) {
        this.leftUpperCorner = leftUpperCorner;
        this.rightLowerCorner = rightLowerCorner;
    }

    public double getArea() {
        return (rightLowerCorner.getX() - leftUpperCorner.getX()) * (leftUpperCorner.getY() - rightLowerCorner.getY());
    }

    public double getDiagonal() {
        return leftUpperCorner.distance(rightLowerCorner);
    }
}
