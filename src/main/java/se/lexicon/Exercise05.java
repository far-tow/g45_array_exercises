package se.lexicon;

public class Exercise05 {

  /**
   * 5. Create a two-dimensional string array [2][2]. Assign values to the 2d array containing any Country and City.
   * Expected output:
   *              France Paris
   *              Sweden Stockholm
   */
  public static void ex5() {
    String [][] places = new String[2][2];
    places [0][0] = "France";
    places [0][1] = "Paris";
    places [1][0] = "Swden";
    places [1][1] = "Stockholm";

    for (int i = 0; i < places.length ; i++){
      for (int j = 0 ; j < places.length ; j++){
        System.out.print(places[i][j] + " ") ;
      }
      System.out.println();

    }




  }


}
