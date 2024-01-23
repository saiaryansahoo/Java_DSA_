package Solved_Questions;

import java.util.Arrays;

public class MaxProductOfTwoElements_inArray {
    public static void main(String[] args) {
        Solution result=new Solution();
        int[] value = {3, 4, 5, 1};
        System.out.println(result.maxProduct(value
        ));
    }
}
class Solution {
    public int maxProduct(int[] value) {
        Arrays.sort(value);
        return (value[value.length - 1] - 1) * (value[value.length - 2] - 1);
    }
}