package Basics.FunctionalProgramming.Optional;

import Basics.FunctionalProgramming.Stream.MapReduce.Student;

import java.util.Optional;

/**
 * @author Oksana Poliakova on 14.06.2023
 * @projectName Lesson1
 */
public class OptionalExample {
    public static void main(String[] args) {
        NewStudent student1 = new NewStudent("John Doe", 20);
        NewStudent student2 = new NewStudent(null, 18);

        // Использование isEmpty()
        System.out.println("Is student1 empty? " + student1.isEmpty()); // Вывод: Is student1 empty? false
        System.out.println("Is student2 empty? " + student2.isEmpty()); // Вывод: Is student2 empty? true

        // Использование ifPresent()
        student1.ifPresent(() -> System.out.println("Action performed on student1"));
        student2.ifPresent(() -> System.out.println("Action performed on student2")); // Ничего не будет выведено

        // Использование map()
        student1.mapNameToUpper().ifPresent(name -> System.out.println("Upper case name: " + name)); // Вывод: Upper case name: JOHN DOE

        // Использование filter()
        student1.filterAgeGreaterThan(18).ifPresent(age -> System.out.println("Age greater than 18: " + age)); // Вывод: Age greater than 18: 20

        // Использование flatMap()
        student1.flatMapNameWithPrefix("Mr. ").ifPresent(name -> System.out.println("Modified name: " + name)); // Вывод: Modified name: Mr. John Doe

        // Использование ofNullable()
        Student student3 = new Student(null, 0);
        Optional<String> nameOptional = Optional.ofNullable(student3.getName());
        System.out.println("Name of student3: " + nameOptional.orElse("No name")); // Вывод: Name of student3: Unknown
    }
}
