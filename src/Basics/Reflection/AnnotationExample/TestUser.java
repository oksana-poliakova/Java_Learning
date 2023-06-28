package Basics.Reflection.AnnotationExample;

/**
 * @author Oksana Poliakova on 28.06.2023
 * @projectName Lesson1
 */
public class TestUser {
    private String name;

    @MinAge(age = 21) // Applying the @MinAge annotation to the age field with a minimum age of 21
    private int age;

    public TestUser(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}
