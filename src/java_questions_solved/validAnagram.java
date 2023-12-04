package java_questions_solved;

public class validAnagram {
    public static void main(String[] args) {
        String s="aryan";
        String t="yaran";
        System.out.println(isAnagram(s,t));
    }

    public static boolean isAnagram(String s, String t){
        if(s.length()!=t.length())
            return false;

        int[] characters_count=new int[26];
        for (int i = 0; i < s.length(); i++) {
            characters_count[s.charAt(i)-'a']++;
            characters_count[t.charAt(i)-'a']--;
        }
        for (int count:characters_count){
            if (count !=0){
                return false;
            }
        }
        return true;
    }
}
