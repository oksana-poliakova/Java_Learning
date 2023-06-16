package Basics.FunctionalProgramming.Optional;

import java.util.Optional;

/**
 * @author Oksana Poliakova on 14.06.2023
 * @projectName Lesson1
 */
public class NewStudent {
    private String name;
    private int age;

    public NewStudent(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Optional<String> getName() {
        return Optional.ofNullable(name);
    }

    public Optional<Integer> getAge() {
        return Optional.ofNullable(age);
    }

    // checks if the Student object is empty (does not have a name and age)
    public boolean isEmpty() {
        return !getName().isPresent() && !getAge().isPresent();
    }

    // performs the specified action if the student's name is present
    public void ifPresent(Runnable action) {
        getName().ifPresent(name -> {
            System.out.println("Name: " + name);
            action.run();
        });
    }

    // converts the student's name to uppercase using the map() method
    public Optional<String> mapNameToUpper() {
        return getName().map(String::toUpperCase);
    }

    // filters the student's age, leaving only values greater than the specified value.
    public Optional<Integer> filterAgeGreaterThan(int value) {
        return getAge().filter(age -> age > value);
    }

    public Optional<String> flatMapNameWithPrefix(String prefix) {
        return getName().flatMap(name -> {
            String modifiedName = prefix + name;
            return Optional.of(modifiedName);
        });
    }
}
