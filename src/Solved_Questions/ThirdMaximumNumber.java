package Solved_Questions;

import java.util.Arrays;

public class ThirdMaximumNumber {
    public static void main(String[] args) {
        int[] nums={3,2,1};
        maxNumber num=new maxNumber();
        System.out.println(num.thirdMax(nums));
    }
}

class maxNumber {
    public int thirdMax(int[] nums) {
        Arrays.sort(nums);
        int n = nums.length;
        int cnt=1;
        for(int i=n-1; i>0; i--){
            if(nums[i] != nums[i-1]){
                cnt++;
                if(cnt == 3)
                    return nums[i-1];
            }
        }
        return nums[n-1];
    }
}
