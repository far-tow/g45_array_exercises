package se.lexicon;
public class Exercise08 {

  /**
   * 8. Write a program which will remove the duplicate elements of a given array [20, 20, 40, 20, 30, 40, 50, 60, 50].
   * Expected output:
   *                Array: 20 20 40 20 30 40 50 60 50
   *                Array without duplicate values: 20 40 30 50 60
   */
  public static void ex8() {


    int[] array = {20, 20, 40, 20, 30, 40, 50, 60, 50, 20, 30, 40 ,50 ,60, 70, 90};
    int length = array.length;
    for (int i = 0; i < length; i++) {
      for (int j = i + 1; j < length; j++) {
        if (array[i] == array[j]) {
          array[j] = 0;
        }
      }
      if (array[i] != 0) {
        System.out.println(array[i]);
      }
    }
  }

}