package java_questions_solved;

import java.util.HashSet;

public class longestSubstring_WithoutRepeating_char {
    public static void main(String[] args) {
        String strs="abcabcbb";
        System.out.println(lengthOfLongestSubstring(strs));
    }

    public static int lengthOfLongestSubstring(String s) {
        int i=0,j=0,max=0;
        HashSet<Character> seen= new HashSet<>();

        while(j<s.length())
        {
            if(!seen.contains(s.charAt(j)))
            {
                seen.add(s.charAt(j));
                j++;
                max=Math.max(seen.size(),max);
            }
            else
            {
                seen.remove(s.charAt(i));
                i++;//last charec index
            }
        }
        return max;
    }
}