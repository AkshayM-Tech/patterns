package patterns.number;

/* Write a java program to print below pattern
    1
   2 3
  3 4 5
 4 5 6 7
5 6 7 8 9
*/
public class Pattern18 {
    public static void main(String[] args) {
        int rows = 5;
        printPattern(rows);
    }

    private static void printPattern(int rows) {
        for (int i = 1; i <= rows; i++){
            for (int j = i; j <= rows; j++){
                System.err.print(" ");
            }
            for (int k = i; k < 2 * i; k++){
                System.err.print(k+" ");
            }
            System.err.println();
        }
    }
}
