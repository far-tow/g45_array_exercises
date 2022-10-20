package se.lexicon;

public class Exercise04 {

    /**
     * 4. Write a program which will copy the elements of one array into another array.
     * Expected output:
     * Elements from first array: 1 15 20
     * Elements from second array: 1 15 20
     */
    public static void ex4() {
        int[] arryOne = {1, 15, 20};
        int[] arrayTwo = new int[arryOne.length];

        for (int i = 0; i < arryOne.length; i++) {
            arrayTwo[i] = arryOne[i];


        }
        System.out.println("copy of arrayOne: ");
        for (int i = 0; i < arrayTwo.length; i++) {
            System.out.println(arrayTwo[i]);
        }


    }

}
