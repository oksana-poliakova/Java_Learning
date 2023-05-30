package Basics;

import java.util.Scanner;

public class Input {
    public static void main(String [] args) {
        // The Scanner class is responsible for entering data from the console and getting input data.
        // We create a new object of the class Scanner, scan has a reference to the object
        Scanner scan = new Scanner(System.in);
//        System.out.println("Enter something");
        // Read an input data from the user's keyboards
        String str = scan.nextLine();
//        System.out.println("You entered: " + str);

//        System.out.println("Enter some integer");
        int x = scan.nextInt();
//        System.out.println("You entered: " + x);
    }
}
