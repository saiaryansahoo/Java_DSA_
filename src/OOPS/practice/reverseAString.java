package OOPS.practice;

public class reverseAString {
    public static void main(String[] args) {
        String word="Aryan";
        String reversed=reverseString(word);
        System.out.println(reversed);
    }

    private static String reverseString(String word) {
        StringBuilder sb=new StringBuilder();
        return sb.reverse().toString();
//        char[] charArray=word.toCharArray();
//        String reverse="";
//
//        for (int i = charArray.length-1; i >=0; i--) {
//            reverse += charArray[i];
//        }
//        return reverse;
    }
}
