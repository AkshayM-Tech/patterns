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
public class Pattern06 {
    public static void main(String[] args) {
        int rows = 7;
        printPattern(rows);
    }

    private static void printPattern(int rows) {
        for (int i = 1; i <= rows; i++){
            for (int j = rows; j >= i; j--){
                System.err.print(j+" ");
            }
            System.err.println();
        }
    }
}
