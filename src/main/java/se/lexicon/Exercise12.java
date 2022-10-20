package se.lexicon;

public class Exercise12 {

    /**
     * 12.Write a program which will print the diagonal elements of two dimensional array.
     * Expected output: 1 4 9
     */
    public static void ex12() {
        int[][] numbers = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};

        for (int i = 0; i < 3; i++) {
            System.out.print(numbers[i][i] + " ");
        }
        System.out.println();

    }

}
