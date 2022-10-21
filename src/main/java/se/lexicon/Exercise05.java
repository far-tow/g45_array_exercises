package se.lexicon;

public class Exercise05 {

  /**
   * 5. Create a two-dimensional string array [2][2]. Assign values to the 2d array containing any Country and City.
   * Expected output:
   *              France Paris
   *              Sweden Stockholm
   */
  public static void ex5() {
    //This is how teacher has solve it:
    String[][] countries = new String[2][2];
    String[] arr = {"France", "Paris", "Sweden", "Stockholm"};
    int index = 0;

    for (int i = 0; i < countries.length; i++) {
      for (int j = 0; j < countries.length; j++) {
        countries[i][j] = arr[index];
        index++;


      }

    }
    System.out.println(countries[0][0] + ", " + countries[0][1]);
    System.out.println(countries[1][0] + ", " + countries[1][1]);

    //This is my solution:
    /*
    String [][] places = new String[2][2];
    places [0][0] = "France";
    places [0][1] = "Paris";
    places [1][0] = "Swden";
    places [1][1] = "Stockholm";

    for (int i = 0; i < places.length ; i++){
      for (int j = 0 ; j < places.length ; j++){
        System.out.print(places[i][j] + ", ") ;
      }
      System.out.println();

    }*/




  }


}
