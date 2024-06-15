package Solved_Questions;

import java.util.HashSet;

public class longestSubstringNonRepeating {
    public static void main(String[] args) {
        String str = "pwwkew";
        System.out.println(longestSubstring(str));
    }

    private static int longestSubstring(String str) {
        int left = 0;
        int right = 0;
        int maxLength = 0;
        HashSet<Character> set = new HashSet<>();

        while (right < str.length()) {
            if (!set.contains(str.charAt(right))) {
                set.add(str.charAt(right));
                right++;
                maxLength = Math.max(maxLength, right - left);
            } else {
                set.remove(str.charAt(left));
                left++;
            }
        }
        return maxLength;
    }
}
