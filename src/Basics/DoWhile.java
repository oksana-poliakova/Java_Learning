package Basics;

import java.util.Scanner;

public class DoWhile {
    public static void main(String [] args) {
        Scanner scan = new Scanner(System.in);
        int value;
        // The loop is guaranteed to run at least once
        do {
//            System.out.println("Enter 10");
            value = scan.nextInt();
        } while(value != 10); {
//            System.out.println("You entered 10!");
        }
    }
}
