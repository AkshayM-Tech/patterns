package patterns.star;

/* Write a java program to print below pattern
       *
      * *
     * * *
    * * * *
   * * * * *
  * * * * * *
 * * * * * * *

*/
public class Pattern01 {
    public static void main(String[] args) {
        int rows = 7;
        printPattern(rows);
    }

    private static void printPattern(int rows) {
        for (int i = 1; i <= rows; i++){
            for (int j = i; j <= rows; j++){
                System.err.print(" ");
            }

            for (int k = 1; k <= i; k++){
                System.err.print("* ");
            }

            System.err.println();
        }
    }
}
