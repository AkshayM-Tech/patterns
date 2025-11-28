package patterns.number;

/* Write a java program to print below pattern
7 6 5 4 3 2 1
 7 6 5 4 3 2
  7 6 5 4 3
   7 6 5 4
    7 6 5
     7 6
      7
*/
public class Pattern24 {
    public static void main(String[] args) {
        int rows = 7;
        printPattern(rows);
    }

    private static void printPattern(int rows) {
        for (int i = 1; i <= rows; i++){
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
