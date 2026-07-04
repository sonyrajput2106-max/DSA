package Strings;

import java.util.Arrays;

public class PermutationOfString {

    static boolean checkInclusion(String s1, String s2) {

        if (s1.length() > s2.length()) {
            return false;
        }

        int[] freq1 = new int[26];
        int[] window = new int[26];

        // Frequency of s1 and first window of s2
        for (int i = 0; i < s1.length(); i++) {
            freq1[s1.charAt(i) - 'a']++;
            window[s2.charAt(i) - 'a']++;
        }

        if (Arrays.equals(freq1, window)) {
            return true;
        }

        for (int i = s1.length(); i < s2.length(); i++) {

            // Add new character
            window[s2.charAt(i) - 'a']++;

            // Remove leftmost character
            window[s2.charAt(i - s1.length()) - 'a']--;

            if (Arrays.equals(freq1, window)) {
                return true;
            }
        }

        return false;
    }

    public static void main(String[] args) {

        String s1 = "ab";
        String s2 = "dcdbacd";

        System.out.println(checkInclusion(s1, s2));

    }
}