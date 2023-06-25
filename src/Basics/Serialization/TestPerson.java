package Basics.Serialization;

import java.io.Serial;
import java.io.Serializable;

/**
 * @author Oksana Poliakova on 25.06.2023
 * @projectName Lesson1
 */
public class TestPerson implements Serializable {
    public void setAge(int age) {
        this.age = age;
    }

    @Serial
    private static final long serialVersionUID = 1L;
    // marks a field as not being serialized when an object is saved
    private transient int age;
    private String firstName;
    

    public TestPerson(int age, String firstName) {
        this.age = age;
        this.firstName = firstName;
    }

    public int getAge() {
        return age;
    }

    public String getFirstName() {
        return firstName;
    }

    @Override
    public String toString() {
        return "TestPerson{" +
                "age=" + age +
                ", firstName='" + firstName + '\'' +
                '}';
    }
}
