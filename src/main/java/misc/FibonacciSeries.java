package misc;

import java.util.Arrays;

public class FibonacciSeries {
    public static void main(String[] args) {
        int input = 10;

        // This approach will run in O(n) Time-Complexity and O(1) Space-Complexity [As it does not require any extra space]
        usingTempVariable(input);

        // This approach will run in O(n) Time-Complexity and O(n) Space-Complexity [As it requires to create an extra array]
        usingArray(input);

        // This approach will run in O(n) Time-Complexity and O(n) Space-Complexity [As it makes recursive calls]
        for (int i = 0; i < input; i++)
            System.err.print(usingRecursion(i)+" ");
    }

    private static void usingTempVariable(int input) {
        int first = 0;
        int second = 1;

        for (int i = 0; i < input; i++){
            System.err.print(first+" ");

            int next = first + second;
            first = second;
            second = next;
        }

        System.err.println();
    }

    private static void usingArray(int input) {
        int[] result = new int[input];
        result[0] = 0;
        result[1] = 1;

        for (int i = 2; i < result.length; i++){
            result[i] = result[i - 1] + result[ i - 2];
        }

        System.err.println(Arrays.toString(result));
    }

    private static int usingRecursion(int input) {

        if (input == 0 || input == 1)
            return input;

        return usingRecursion(input - 1) + usingRecursion(input - 2);
    }
}
