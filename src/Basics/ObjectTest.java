package Basics;

/**
 * @author oksanapoliakova on 30.05.2023
 * @projectName Lesson1
 */
public class ObjectTest {

    public static void main(String [] args) {
        Obj obj1 = new Obj("Some name", 25);
        obj1.toString(); // returns hash code for this object
        // printLn, print calls the method toString()
        System.out.println(obj1);
    }

}

class Obj {
    private final String name;
    private final int age;

    public Obj(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String toString() {
        return name + ", " + age;
    }
}