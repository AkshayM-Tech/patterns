package misc;

import java.util.HashMap;
import java.util.Map;

public class AnagramStringCharacterDeletion {
    public static void main(String[] args) {
        String s1 = "cde";
        String s2 = "abc";

        int result1 = minDeletionsToMakeAnagramUsingArray(s1, s2);
        System.out.println("Minimum deletions = " + result1);

        int result2 = minDeletionsToMakeAnagramUsingHashMap(s1, s2);
        System.out.println("Minimum deletions = " + result2);
    }

    private static int minDeletionsToMakeAnagramUsingArray(String s1, String s2) {
        int[] freq = new int[26]; // store frequency of each character (a-z)

        // Count chars in s1
        for (char ch : s1.toCharArray()) {
            freq[ch - 'a']++;
        }

        // Subtract chars in s2
        for (char ch : s2.toCharArray()) {
            freq[ch - 'a']--;
        }

        // Total deletions is sum of absolute differences
        int deletions = 0;
        for (int f : freq) {
            deletions += Math.abs(f);
        }

        return deletions;
    }

    public static int minDeletionsToMakeAnagramUsingHashMap(String s1, String s2) {
        Map<Character, Integer> map = new HashMap<>();

        for (Character ch : s1.toCharArray()){
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }

        for (Character ch : s2.toCharArray()){
            map.put(ch, map.getOrDefault(ch, 0) - 1);
        }

        return map.values().stream().map(Math::abs).reduce(0, Integer::sum);
    }
}
