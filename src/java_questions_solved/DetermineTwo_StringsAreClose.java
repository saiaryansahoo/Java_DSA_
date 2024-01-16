package java_questions_solved;

import java.util.Arrays;

public class DetermineTwo_StringsAreClose {
    public static void main(String[] args) {
       String word1="abc";
       String word2="bca";
       Strings sol=new Strings();
        System.out.println(sol.closeStrings(word1, word2));
    }
}
class Strings {
    public boolean closeStrings(String word1, String word2) {
        if (word1.length() != word2.length())
            return false;

        int[] f1 = new int[26];
        int[] f2 = new int[26];

        for (int i = 0; i < word1.length(); i++) {
            f1[word1.charAt(i) - 'a']++;
            f2[word2.charAt(i) - 'a']++;
        }

        for (int i = 0; i < 26; i++) {
            if ((f1[i] == 0 && f2[i] != 0) || (f1[i] != 0 && f2[i] == 0))
                return false;
        }

        Arrays.sort(f1);
        Arrays.sort(f2);

        for (int i = 0; i < 26; i++) {
            if (f1[i] != f2[i])
                return false;
        }
        return true;
    }
}
