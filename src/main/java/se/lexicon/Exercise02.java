package se.lexicon;

import java.util.Scanner;

public class Exercise02 {

    /**
     * 2. Create a program and create a method with name ‘indexOf’ which will find and return the index of an element in the array.
     * If the element does not exist your method should return -1 as value.
     * Expected output: Index position of number 5 is: 2.
     */
    public static void ex2() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int input = scanner.nextInt();
        int result = indexOf(input);
        System.out.println("result = " + result);


    }

    //a method with name ‘indexOf’
    //return the index of an element in the array ?
    public static int indexOf(int inputNumber) {
        int[] numbers = new int[]{44, 4, 56, 33, 22, 14, 2};
        int size = numbers.length;
        for (int i = 0; i < size; i++) {
            //return the index of an element in the array
            if (numbers[i] == inputNumber) {
                return i;
            }
        }
        //If the element doesn’t exist your method should return -1 as value.
        return -1;


    }
}

