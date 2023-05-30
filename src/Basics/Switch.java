package Basics;

import java.util.Scanner;

public class Switch {
    public static void main(String [] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your age");
        int age = scan.nextInt();
        // Can also be used with strings
        switch(age) {
            case 0:
//                System.out.println("You have born!");
                break;
            case 7:
//                System.out.println("You went to the school!");
                break;
            case 18:
//                System.out.println("You graduated from the school!");
                break;
            default:
//                System.out.println("Error! :(");
        }
    }
}
