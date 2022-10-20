package se.lexicon;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Exercise09 {

    /**
     * 9. Write a method which will add elements in an array.
     * Remember that arrays are fixed in size so you need to come up with a
     * solution to “expand” the array
     */
    public static void ex9() {
        String[] things = {"Pen", "Pencils", "Laptop", "Notebook"};
        System.out.println("You have these items on your table: " + Arrays.toString(things));
        System.out.println("#################################");

        //String [] moreThings = new String[things.length + 1];
        String[] moreThings = Arrays.copyOf(things, things.length + 1);


        Scanner in = new Scanner(System.in);
        for (int i = 0; i < things.length; i++) {
            moreThings[i] = things[i];

        }
        System.out.println("What more item do you want to add? ");
        moreThings[moreThings.length - 1] = in.nextLine();
        System.out.println("Here is your new list of items: " + Arrays.toString(moreThings));



    }

}
