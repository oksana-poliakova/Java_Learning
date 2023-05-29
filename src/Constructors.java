/**
 * @author Oksana Poliakova on 29.05.2023
 * @projectName Lesson1
 */
public class Constructors {
    public static void main(String [] args) {
        Persons person1 = new Persons("Anna", 4);
        Persons person2 = new Persons();
    }
}

class Persons {
    private String name;
    private int age;

    // MARK: - Inits
    // default init
    public Persons() {
        this.name = "Default name";
        this.age = 0;
    }
    public Persons(String name) {
        this.name = name;
    }
    public Persons(String name, int age) {
        this.name = name;
        this.age = age;
    }
}
