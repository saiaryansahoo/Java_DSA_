package Solved_Questions.sum_of_no;

import java.util.Scanner;

public class _digitk {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter num: ");
        int num = scanner.nextInt();

        System.out.print("Enter k: ");
        int k = scanner.nextInt();

        Solution solution = new Solution();
        int result = solution.minimumNumbers(num, k);

        System.out.println("Output: " + result);
    }

    static class Solution {
        // TC: O(1)
        // SC: O(1)
        public int minimumNumbers(int num, int k) {
            if (num == 0) {
                return 0;
            }

            if (k == 0) {
                return num % 10 == 0 ? 1 : -1;
            }

            for (int i = 1; i <= 10; i++) {
                if ((num - i * k) % 10 == 0 && (num - i * k) >= 0) {
                    return i;
                }
            }
            return -1;
        }
    }
}
