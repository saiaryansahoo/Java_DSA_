package OOPS.practice;

public class pallindrome {
    public static void main(String[] args) {
        String str="MADAM";
        if(pallindromeIs(str)){
            System.out.println("True");
        }else{
            System.out.println("False");
        }
    }

    private static boolean pallindromeIs(String str) {
        String sb=new StringBuilder(str).reverse().toString();
        return sb.equals(str);

//        int left=0;
//        int right=str.length()-1;
//
//        while(left<right){
//            if(str.charAt(left)!=str.charAt(right)) {
//                return false;
//            }
//            left++;
//            right--;
//        }
//        return true;
    }
}
