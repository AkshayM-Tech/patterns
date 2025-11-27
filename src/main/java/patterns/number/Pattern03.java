package patterns.number;

/* Write a java program to print below pattern
1
2 2
3 3 3
4 4 4 4
5 5 5 5 5
6 6 6 6 6 6
7 7 7 7 7 7 7
*/
public class Pattern03 {
    public static void main(String[] args) {
        int rows = 7;
        printPattern(rows);
    }

    private static void printPattern(int rows) {
        for (int i = 1; i <= rows; i++){
            for (int j = 1; j <= i; j++){
                System.err.print(i+" ");
            }
            System.err.println();
        }
    }
}
