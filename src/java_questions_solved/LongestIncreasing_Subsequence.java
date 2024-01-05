package java_questions_solved;

import java.util.Arrays;
/**
 This class calculates the length of the longest increasing subsequence in an array of integers.
 It uses the dynamic programming approach to solve the problem efficiently. */
public class LongestIncreasing_Subsequence {
    /**
     The main method creates an instance of the Solution15 class and calls the lengthOfLIS method to calculate the length of the longest increasing subsequence.
     It then prints the result to the console.

     @param args The command-line arguments */
    public static void main(String[] args) {
        int[] num = {10, 9, 2, 5, 3, 7, 101, 18};
        Solution15 sol = new Solution15();
        System.out.println(sol.lengthOfLIS(num));
    }
 }
/**
 This class contains the implementation of the lengthOfLIS method, which calculates the length of the longest increasing subsequence. */
class Solution15 {
    /**
     This method takes an array of integers as input and returns the length of the longest increasing subsequence.

     @param nums The array of integers
     @return The length of the longest increasing subsequence */
    public int lengthOfLIS(int[] nums) {
         int[] temp = new int[nums.length];
         int len = 1;
         temp[0] = nums[0];
        for (int i = 1; i < nums.length; i++) {
            if (temp[len - 1] < nums[i])
            { temp[len++] = nums[i];
            } else {
                int ind = Arrays.binarySearch(temp, 0, len, nums[i]);
                if (ind < 0) { ind = -(ind + 1);
                }
                temp[ind] = nums[i];
            }
        }
        return len;
     }
 }
