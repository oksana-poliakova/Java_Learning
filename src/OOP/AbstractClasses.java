package OOP;

/**
 * @author Oksana Poliakova on 02.06.2023
 * @projectName Lesson1
 */
public class AbstractClasses {
    public static void main(String[] args) {

    }
}

abstract class MainAbstractClass {
    public abstract void load();
}

class ChildClass extends MainAbstractClass {

    @Override
    public void load() {

    }
}

final class ClassCantBeInherited {

}