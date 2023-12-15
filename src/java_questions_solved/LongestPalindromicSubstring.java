package java_questions_solved;

public class LongestPalindromicSubstring {
    public static void main(String[] args) {
        Solution3 sol= new Solution3();
        String s="babad";
        System.out.println(sol.longestPalindrome(s));
    }
}
class Solution3 {
    int maxLen = 0;
    int lo = 0;
    public void expandPalindrome(char[] s, int j, int k) {
        while(j >= 0 && k < s.length && s[j] == s[k]) {
            j--;
            k++;
        }
        if(maxLen < k-j-1) {
            maxLen = k-j-1;
            lo = j+1;
        }
    }

    public String longestPalindrome(String s) {
        char[] input = s.toCharArray();
        if(s.length() < 2) {
            return s;
        }

        for(int i = 0; i<input.length; i++) {
            expandPalindrome(input, i, i);
            expandPalindrome(input, i, i+1);
        }
        return s.substring(lo, lo+maxLen);
    }
}