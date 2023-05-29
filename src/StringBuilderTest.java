/**
 * @author Oksana Poliakova on 29.05.2023
 * @projectName Lesson1
 */
public class StringBuilderTest {
    public static void main(String [] args) {
        String str = "Hello";   // this object will be deleted from the memory automatically
        str = str.toUpperCase();    // a new object

        String str1 = "Hello ";
        String str2 = "my ";
        String str3 = "World!";
        String allStringsTogether = str1 + str2 + str3; // will be created a fourth string

        System.out.println(allStringsTogether);

        // StringBuilder is mutable (objects of class String can be changed during the program)
        StringBuilder strBuild = new StringBuilder("Hello ");    // also the initial value can be empty
        strBuild.append("my ").append("World").append("!!!");
        System.out.println(strBuild);
    }
}
