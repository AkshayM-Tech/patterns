package patterns.number;

/* Write a java program to print below pattern
1
1 2
1 2 3
1 2 3 4
1 2 3 4 5
1 2 3 4 5 6
1 2 3 4 5 6 7
1 2 3 4 5 6
1 2 3 4 5
1 2 3 4
1 2 3
1 2
1
*/
public class Pattern09 {
    public static void main(String[] args) {
        int rows = 7;
        printPattern(rows);
    }

    private static void printPattern(int rows) {
        for (int i = 1; i <= rows; i++){
            for (int j = 1; j <= i; j++){
                System.err.print(j+" ");
            }
            System.err.println();
        }

        for (int i = rows - 1; i >= 1; i--){
            for (int j = 1; j <= i; j++){
                System.err.print(j+" ");
            }
            System.err.println();
        }
    }
}
