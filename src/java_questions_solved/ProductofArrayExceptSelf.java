package java_questions_solved;

import java.util.Arrays;

public class ProductofArrayExceptSelf {
    public static void main(String[] args) {
        Solution7 sol=new Solution7();
        int[] num={-1,1,0,-3,3};
        System.out.println(Arrays.toString(sol.productExceptSelf(num)));
    }
}

class Solution7 {
    public int[] productExceptSelf(int[] nums) {
        int[] ans = new int[nums.length];
        int post=1, pre=1;
        for(int i=0; i<nums.length; i++){
            ans[i]=pre;
            pre*=nums[i];
        }

        for(int i=nums.length-1; i>=0; i--){
            ans[i]*=post;
            post*=nums[i];
        }
        return ans;
    }
}
