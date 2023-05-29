/**
 * @author Oksana Poliakova on 29.05.2023
 * @projectName Lesson1
 */
public class ThisKeyword {
    public static void main(String [] args) {
        Human human1 = new Human();
        human1.setName("John");
        human1.setAge(12);
        human1.getInfoAboutHuman();
    }
}

class Human {
    private String name;
    private int age;

    public void setName(String name) {
        // a reference to the class property name to the current object (for example, human1, human2 etc.)
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void getInfoAboutHuman() {
//        System.out.println("Human's name is " + name + " and age is " + age);
    }
}
