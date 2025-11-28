package patterns.number;

/* Write a java program to print below pattern
1
1 2 1
1 2 3 2 1
1 2 3 4 3 2 1
1 2 3 4 5 4 3 2 1
1 2 3 4 5 6 5 4 3 2 1
1 2 3 4 5 6 7 6 5 4 3 2 1
*/
public class Pattern11 {
    public static void main(String[] args) {
        int rows = 7;
        printPattern(rows);
    }

    private static void printPattern(int rows) {
        for (int i = 1; i <= rows; i++){
            for (int j = 1; j <= i; j++){
                System.err.print(j+" ");
            }
            for (int k = i - 1; k >= 1; k--){
                System.err.print(k+" ");
            }
            System.err.println();
        }
    }
}
