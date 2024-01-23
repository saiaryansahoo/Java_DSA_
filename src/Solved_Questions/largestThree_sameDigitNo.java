package Solved_Questions;

public class largestThree_sameDigitNo {
    public static void main(String[] args) {
        String num="677713339";
        System.out.println(largestGoodInteger(num));
    }
    public static String largestGoodInteger(String num){
        Character c=null;
        for (int i = 1; i + 1 <num.length() ; i++) {
            char c1=num.charAt(i-1),
                    c2=num.charAt(i),
                    c3=num.charAt(i+1);

            if(c1==c2&&c2==c3){
                if (c==null || c2>c){
                    c=c2;
                }
            }
        }
        if(c==null){
            return "";
        }
        return "" + c + c + c;
    }
}
