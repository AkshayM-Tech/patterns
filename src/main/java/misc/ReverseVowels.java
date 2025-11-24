package misc;

/*
    - Write a java program to reverse the vowels from given input string.
*/

public class ReverseVowels {
    public static void main(String[] args) {
        String input = "HELLO WORLD";
        reverseVowels(input);
    }

    private static void reverseVowels(String input) {
        char[] array = input.toCharArray();
        String vowels = "";
        int count = 0;

        // Get all the vowels (append to the string 'vowels') and their count (count)
        for (char ch : array){
            if (isVowel(ch)){
                vowels += ch;
                count++;
            }
        }

        /* Iterate over the char array and place the vowels from 'vowel' string
            into array in reverse order [--count]
         */
        for (int i = 0; i < array.length; i++){
            if (isVowel(array[i])){
                array[i] = vowels.charAt(--count);
            }
        }

        // Iterate over the manipulated array and append each char to string [result]
        String result = "";
        for (char ch : array)
            result += ch;

        System.err.println(result);
    }

    // To check if given char is vowel or not
    private static boolean isVowel(char ch) {
        return (ch == 'A' || ch == 'a' || ch == 'E' || ch == 'e'
                || ch == 'I' || ch == 'i' || ch == 'O' || ch == 'o'
                || ch == 'U' || ch == 'u');
    }
}
