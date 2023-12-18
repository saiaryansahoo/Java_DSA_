package java_questions_solved;

public class MaximumProductDifferenceBetweenTwoPairs {
    public static void main(String[] args) {
        Solution6 solution6=new Solution6();
        int[] num={4,2,5,9,7,4,8};
        System.out.println(solution6.maxProductDifference(num));
    }
}
class Solution6 {
    public int maxProductDifference(int[] nums) {
        if(nums.length <= 2) {
            return 0;
        }

        int min1 = nums[0];
        int min2 = nums[1];
        int max1 = nums[1];
        int max2 = nums[0];
        if(nums[0] > nums[1]){
            min1 = nums[1];
            min2 = nums[0];
            max1 = nums[0];
            max2 = nums[1];
        }

        for(int i=2; i<nums.length; i++) {
            if(nums[i] < min2) {
                if(nums[i] < min1) {
                    min2 = min1;
                    min1 = nums[i];
                }
                else {
                    min2 = nums[i];
                }
            }

            if(nums[i] > max2) {
                if(nums[i] > max1) {
                    max2 = max1;
                    max1 = nums[i];
                }
                else {
                    max2 = nums[i];
                }
            }
        }
        return max1*max2 - min1*min2;
    }
}
