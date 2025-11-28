package patterns.number;

/* Write a java program to print below pattern
1 2 3 4 5 6 7
  1 2 3 4 5 6
    1 2 3 4 5
      1 2 3 4
        1 2 3
          1 2
            1
*/
public class Pattern13 {
    public static void main(String[] args) {
        int rows = 7;
        printPattern(rows);
    }

    private static void printPattern(int rows) {
        for (int i = rows; i >= 1; i--){
            for (int j = i; j <= rows; j++){
                System.err.print("  ");
            }
            for (int k = 1; k <= i; k++){
                System.err.print(k+" ");
            }
            System.err.println();
        }
    }
}
