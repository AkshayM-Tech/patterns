package patterns.number;

/* Write a java program to print below pattern
7 6 5 4 3 2 1
6 5 4 3 2 1
5 4 3 2 1
4 3 2 1
3 2 1
2 1
1
*/
public class Pattern08 {
    public static void main(String[] args) {
        int rows = 7;
        printPattern(rows);
    }

    private static void printPattern(int rows) {
        for (int i = rows; i >= 1; i--){
            for (int j = i; j >= 1; j--){
                System.err.print(j+" ");
            }
            System.err.println();
        }
    }
}
