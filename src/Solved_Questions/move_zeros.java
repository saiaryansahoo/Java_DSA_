package Solved_Questions;

public class move_zeros {
    public static void main(String[] args) {
        int[] nums = {0, 1, 0, 3, 12};

        // Call the moveZeros method to modify the array
        moveZeros(nums);

        // Print the modified array
        for (int num : nums) {
            System.out.print(num + " ");
        }
    }

    // using two-pointer approach
    static void moveZeros(int[] nums) {
        int size = nums.length;
        if (size == 0 || size == 1) {
            return;
        }

        int nz = 0, z = 0;
        while (nz < size) {
            if (nums[nz] != 0) {
                int temp = nums[nz];
                nums[nz] = nums[z];
                nums[z] = temp;
                nz++;
                z++;
            } else {
                nz++;
            }
        }
    }
}
