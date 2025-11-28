package patterns.number;

/* Write a java program to print below pattern
            1
          2 1
        3 2 1
      4 3 2 1
    5 4 3 2 1
  6 5 4 3 2 1
7 6 5 4 3 2 1
*/
public class Pattern14 {
    public static void main(String[] args) {
        int rows = 7;
        printPattern(rows);
    }

    private static void printPattern(int rows) {
        for (int i = 1; i <= rows; i++){
            for (int j = i; j <= rows; j++){
                System.err.print("  ");
            }
            for (int k = i; k >= 1; k--){
                System.err.print(k+" ");
            }
            System.err.println();
        }
    }
}
