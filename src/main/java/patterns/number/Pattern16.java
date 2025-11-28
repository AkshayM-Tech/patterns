package patterns.number;

/* Write a java program to print below pattern
1234567
 234567
  34567
   4567
    567
     67
      7
     67
    567
   4567
  34567
 234567
1234567
*/
public class Pattern16 {
    public static void main(String[] args) {
        int rows = 7;
        printPattern(rows);
    }

    private static void printPattern(int rows) {
        for (int i = 1; i <= rows; i++){
            for (int j = 1; j < i; j++){
                System.err.print(" ");
            }
            for (int k = i; k <= rows; k++){
                System.err.print(k);
            }
            System.err.println();
        }

        for (int i = rows - 1; i >= 1; i--){
            for (int j = 1; j < i; j++){
                System.err.print(" ");
            }
            for (int k = i; k <= rows; k++){
                System.err.print(k);
            }
            System.err.println();
        }
    }
}
