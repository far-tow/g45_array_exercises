package se.lexicon;

import java.util.Arrays;

public class Exercise07 {

  /**
   * 7. Write a program which will set up an array to hold 10 numbers and print out only the uneven numbers.
   * Expected output: Array: 1 2 4 7 9 12
   * Odd Array: 1 7 9
   */
  public static void ex7() {
    int [] arrays = {1,2,3,4,5,6,7,8,9,10};
    System.out.println("Arrays: " + Arrays.toString(arrays));
    int length = arrays.length;

    for(int i = 0; i < length; i++){

      if(arrays[i] % 2 != 0 ){
        System.out.println(arrays[i]);

      }

    }

  }

}
