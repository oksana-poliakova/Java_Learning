package Basics;

public class MultidimensionalArrays {
    public static void main(String [] args) {
        // one-dimensional array
        int[] numbers = {1, 2, 3};

        // two-dimensional array
        int[][] matrix = {{1, 2, 3},
                {4, 5},
                {6, 7},
                {8}};
//        System.out.println(matrix[3][0]);

        // array with two rows and three columns
        String[][] strings = new String[2][3];
        strings[0][1] = "Hello";
//        System.out.println(strings[0][1]);

        // table matrix
        int[][] table = {{1, 2, 3},
                        {4, 5, 6},
                        {7, 8, 9}};

        // table.length returns 3 rows (count of one-dimensional arrays)
        for (int i = 0; i < table.length; i++) {
            // returns amount of columns (number of elements in a one-dimensional array)
            for (int j = 0; j < table[i].length; j++) {
//                System.out.print(table[i][j] + " ");
            }
//            System.out.println();
        }

        // example with full name
        String [][] fullName = {{"John", "Dou"},
                                 {"Alice", "Smith"},
                                 {"Anna",  "Grimmer"}};
        for(int i = 0; i < fullName.length; i++) {
            for(int j = 0; j < fullName[i].length; j++) {
//                System.out.print(fullName[i][j] + " ");
            }
//            System.out.println();
        }
    }
}
