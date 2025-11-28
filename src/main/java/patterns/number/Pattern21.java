package patterns.number;

/* Write a java program to print below pattern
      7
     6 7
    5 6 7
   4 5 6 7
  3 4 5 6 7
 2 3 4 5 6 7
1 2 3 4 5 6 7
*/
public class Pattern21 {
    public static void main(String[] args) {
        int rows = 7;
        printPattern(rows);
    }

    private static void printPattern(int rows) {
        for (int i = rows; i >= 1; i--){
            for (int j = 1; j <= i; j++){
                System.err.print(" ");
            }
            for (int k = i; k <= rows; k++){
                System.err.print(k+" ");
            }
            System.err.println();
        }
    }
}
