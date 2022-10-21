package se.lexicon;

import java.text.DecimalFormat;
import java.util.Arrays;

public class Exercise06 {

  /**
   * 6. Write a program which will set up an array to hold the next values in this order: 43, 5, 23, 17, 2, 14 and print the average of these 6 numbers.
   * Expected output: Average is: 17.3
   */
  public static void ex6() {
    //This is the right solution
    double[] numbers = {43, 5, 23, 17, 2, 14};
    double sum = 0;

    for (double i : numbers){
      sum += i ;
    }
    DecimalFormat df = new DecimalFormat("###.#");
    System.out.println("Average of" + Arrays.toString(numbers) +  " is: \n" + df.format(sum / numbers.length));


    // This is my solution, but couldn't make format to show with just 1 decimal!
    /*
    int [] numbers = {43, 5, 23, 17, 2, 14};
    double sum = 0;

    for (int i=0; i < numbers.length; i++){
      sum = sum + numbers[i];

    }

    double average = sum / numbers.length;

    System.out.println("the average is: " + average);*/


    }

  }


