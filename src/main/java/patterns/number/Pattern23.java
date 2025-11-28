package patterns.number;

/* Write a java program to print below pattern
      7
     7 6
    7 6 5
   7 6 5 4
  7 6 5 4 3
 7 6 5 4 3 2
7 6 5 4 3 2 1
*/
public class Pattern23 {
    public static void main(String[] args) {
        int rows = 7;
        printPattern(rows);
    }

    private static void printPattern(int rows) {
        for (int i = rows; i >= 1; i--){
            for (int j = 1; j < i; j++){
                System.err.print(" ");
            }
            for (int k = rows; k >= i; k--){
                System.err.print(k+" ");
            }
            System.err.println();
        }
    }
}
