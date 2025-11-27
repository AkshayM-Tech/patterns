package patterns.number;

/* Write a java program to print below pattern
7 7 7 7 7 7 7
6 6 6 6 6 6
5 5 5 5 5
4 4 4 4
3 3 3
2 2
1
*/
public class Pattern04 {
    public static void main(String[] args) {
        int rows = 7;
        printPattern(rows);
    }

    private static void printPattern(int rows) {
        for (int i = rows; i >= 1; i--){
            for (int j = 1; j <= i; j++){
                System.err.print(i+" ");
            }
            System.err.println();
        }
    }
}
