package Recursion;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SubsequenceOfString {

    public static void getAllSubsequences(
            String s,
            int index,
            StringBuilder output,
            List<String> ans) {

        // Base case
        if (index >= s.length()) {
            String subsequence = output.toString();
            ans.add(subsequence);
            return;
        }

        // Include-exclude pattern
        char ch = s.charAt(index);

        // Include
        output.append(ch);
        getAllSubsequences(s, index + 1, output, ans);

        // Backtrack
        output.deleteCharAt(output.length() - 1);

        // Exclude
        getAllSubsequences(s, index + 1, output, ans);
    }

    public static List<String> powerSet(String s) {

        List<String> ans = new ArrayList<>();

        StringBuilder output = new StringBuilder();
        int index = 0;

        getAllSubsequences(s, index, output, ans);

        Collections.sort(ans);

        return ans;
    }

    static void main(String[] args) {

        String s = "abc";

        List<String> result = powerSet(s);

        System.out.println(result);
    }
}