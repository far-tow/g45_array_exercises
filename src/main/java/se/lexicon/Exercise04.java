package se.lexicon;

import java.util.Arrays;

public class Exercise04 {

    /**
     * 4. Write a program which will copy the elements of one array into another array.
     * Expected output:
     * Elements from first array: 1 15 20
     * Elements from second array: 1 15 20
     */
    public static void ex4() {
        //This is easier way to solve this task:
        int[] arrays1 = {1, 15, 20};
        //int [] arrays2 = new int[3];
        System.out.println("Array No. 1: " + Arrays.toString(arrays1));
        int[] arrays2 = Arrays.copyOf(arrays1, arrays1.length);
        System.out.println("Array No. 2: " + Arrays.toString(arrays2));


        //This is my solution to this task.
        /*int[] arryOne = {1, 15, 20};
        int[] arrayTwo = new int[arryOne.length];

        for (int i = 0; i < arryOne.length; i++) {
            arrayTwo[i] = arryOne[i];


        }
        System.out.println("copy of arrayOne: ");
        for (int i = 0; i < arrayTwo.length; i++) {
            System.out.println(arrayTwo[i]);
        }*/


    }

}
