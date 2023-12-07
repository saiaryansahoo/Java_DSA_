package java_questions_solved;

public class removeDuplicatedFrmSortedArray {
    public static void main(String[] args) {
        int[] result = {0,0,1,1,1,2,2,3,3,4};
        System.out.println(removeDuplicates(result));
    }
    public static int removeDuplicates(int[] nums) {
        int duplicateIndex = 0;
        for (int i = 1; i < nums.length; i++)
            if(nums[i] != nums[duplicateIndex]) nums[++duplicateIndex] = nums[i];
        return duplicateIndex + 1;
    }
}
