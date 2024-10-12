package OOPS.practice;

import java.util.Arrays;

public class validAnagrams {
    public static void main(String[] args) {
        String s1="silent";
        String s2="listen";

        if(valid(s1,s2)){
            System.out.println("Valid");
        }else{
            System.out.println("Not Valid");
        }
    }

    private static boolean valid(String s1, String s2) {
        int n=s1.length();
        int m=s2.length();

        if(n!=m) return false;

        char[] c1=s1.toCharArray();
        char[] c2=s2.toCharArray();

        Arrays.sort(c1);
        Arrays.sort(c2);

        for(int i=0;i<n;i++){
            if(c1[i]!=c2[i]) return false;
        }
        return true;
    }
}
