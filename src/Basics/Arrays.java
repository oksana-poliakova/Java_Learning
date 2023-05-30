package Basics;

public class Arrays {
    public static void main(String [] args) {
        // String and Array are reference types
        // numbers has a reference to the array with 5 empty cells (for them the default init for each is 0)
        int value = 10;
        int[] numbers = new int[5];
        int[] values = {value, 108, 44, 21};
        printArray();

        for(int i = 0; i < numbers.length; i++) {
//            System.out.println("\nindex: " + i);
//            numbers[i] = i * 10;
//            System.out.print("\nvalue: " + numbers[i]);
        }
    }
    private static void printArray() {

    }
}
