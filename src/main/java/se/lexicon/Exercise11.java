package se.lexicon;

import java.util.Arrays;
import java.util.Scanner;

public class Exercise11 {

    /**
     * 11.Write a program that ask the user for an integer and repeat that
     * question until user give you a specific value that user already has been
     * told about as a message in your program. Store these values in an array
     * and print that array. After that reverse the array elements so that the
     * first element becomes the last element, the second element becomes
     * the second to last element, etc. Do not just reverse the order in which
     * they are printed. You need to change the way they are stored in the
     * array.
     */
    public static void ex11() {
        int[] arrays = new int[2];
        System.out.println("How many numbers (at least 2) do you want to add: ");

        Scanner scan = new Scanner(System.in);
        int moreNumber = scan.nextInt();
        int tmp1 = moreNumber - arrays.length;
        int tmp2 = arrays.length + tmp1;


        arrays = Arrays.copyOf(arrays, tmp2);
        //int[] revArray = Arrays.copyOf(arrays, arrays.length);
        int[] revArray = new int[arrays.length];
        System.out.println("Please enter your " + moreNumber + " numbers here:");
        for (int i = 0; i < arrays.length; i++) {
            arrays[i] = scan.nextInt();
        }

        int i = arrays.length - 1;

        for (int j = 0; j < revArray.length; j++) {
            revArray[j] = arrays[i];
            i--;
        }
        System.out.println("Your Numbers: ");
        System.out.println(Arrays.toString(arrays));

        System.out.println("...and your numbers in reverse: ");
        System.out.println(Arrays.toString(revArray));

    }

}