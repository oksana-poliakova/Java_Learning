package OOP;

/**
 * @author Oksana Poliakova on 29.05.2023
 * @projectName Lesson1
 */
public class Encapsulation {
    public static void main(String [] args) {
        PersonsData person1 = new PersonsData();
        person1.setName("Maria");
        person1.setAge(9);
        person1.introduce();
//        System.out.println("Output from the main method: " + person1.getName() + " " + person1.getAge());
    }
}

// In this example, the name and age properties are declared as private, preventing direct access from outside the class.
// Instead, public getter and setter methods are provided to access and modify these properties.

class PersonsData {
    private String name;
    private int age;

    // setter
    public void setName(String username) {
        if (username.isEmpty()) {
//            System.out.println("Invalid name value");
        } else  {
            name = username;
        }
    }

    // getter
    public String getName() {
        return name;
    }

    // setter
    public void setAge(int userAge) {
        if (userAge >= 0) {
            age = userAge;
        } else {
//            System.out.println("Invalid age value.");
        }
    }

    // getter
    public int getAge() {
        return age;
    }

    void introduce() {
//        System.out.println("My name is " + name + " and I'm " + age + " years old");
    }
}
