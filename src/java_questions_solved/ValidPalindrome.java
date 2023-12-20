package java_questions_solved;

public class ValidPalindrome {
    public static void main(String[] args) {
        Solution11 sol=new Solution11();
        String s="A man, a plan, a canal: Panama";
        System.out.println(sol.isPalindrome(s));
    }
}
class Solution11 {
    public boolean isPalindrome(String s) {
        int low = 0 , high = s.length()-1;
        while(low<high){
            char l = s.charAt(low) , h = s.charAt(high);
            if(!Character.isLetterOrDigit(l)) low++;
            else if(!Character.isLetterOrDigit(h)) high--;
            else {
                if(Character.toLowerCase(l)!=Character.toLowerCase(h)) return false;
                low++; high--;
            }
        }
        return true;
    }
}