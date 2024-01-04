package java_questions_solved;

import java.util.Arrays;

public class MinimumNumber_OperationsToMake_ArrayEmpty {
    public static void main(String[] args) {
        int[] num={2,3,3,2,2,4,2,3,4};
        Solution14 sol=new Solution14();
        System.out.println(sol.minOperations(num));
    }
}
class Solution14 {
    public int minOperations(int[] nums) {
        Arrays.sort(nums);
        int count = 1, ans = 0, q, w;

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] == nums[i - 1]) {
                count++;
            } else {
                if (count < 2)
                    return -1;

                if (count % 2 == 0) {
                    q = count / 3;
                    if (q % 2 != 0)
                        q--;
                    w = (count - (3 * q)) / 2;
                    ans += q + w;
                } else {
                    q = count / 3;
                    if (q % 2 == 0)
                        q--;
                    w = (count - (3 * q)) / 2;
                    ans += q + w;
                }
                count = 1;
            }
        }
        if (count < 2)
            return -1;

        if (count % 2 == 0) {
            q = count / 3;
            if (q % 2 != 0)
                q--;
            w = (count - (3 * q)) / 2;
            ans += q + w;
        } else {
            q = count / 3;
            if (q % 2 == 0)
                q--;
            w = (count - (3 * q)) / 2;
            ans += q + w;
        }
        return ans;
    }
}
