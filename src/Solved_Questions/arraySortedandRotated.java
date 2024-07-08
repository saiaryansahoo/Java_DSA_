package Solved_Questions;

public class arraySortedandRotated {
    public static void main(String[] args) {
        int[] nums = {3, 4, 5, 1, 2};
        System.out.println(solve(nums));
    }

    private static boolean solve(int[] nums) {
        int count=0;
        for (int i=0; i<nums.length; i++){
            if(nums[i]>nums[(i+1) % nums.length]){
                count++;
            }
        }
        return count<=1;
    }

}
