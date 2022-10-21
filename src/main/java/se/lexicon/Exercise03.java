package se.lexicon;

import java.util.Arrays;

public class Exercise03 {

    /**
     * 3. Write a program which will sort string array.
     * Expected output:
     * String array: [Paris, London, New York, Stockholm]
     * Sort string array: [London, New York, Paris, Stockholm]
     */
    public static void ex3() {
        //This is my first solution to solve it
        /*String[] cityNames = {"Paris", "London", "New York", "Stockholm"};
        int size = cityNames.length;

        for (int i = 0; i < size ; i++) {
            for (int j = i ; j < size; j++) {
                if (cityNames[i].compareTo(cityNames[j]) > 0) {
                    String temp = cityNames[i];
                    cityNames[i] = cityNames[j];
                    cityNames[j] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(cityNames));*/

        //but this is much better and easier way :-)
        String[] cityNames = {"Paris", "London", "New York", "Stockholm"};

        System.out.println("Unsorted Cities: " + Arrays.toString(cityNames));
        Arrays.sort(cityNames);

        System.out.println("Sorted Cities: " + Arrays.toString(cityNames));

    }


}