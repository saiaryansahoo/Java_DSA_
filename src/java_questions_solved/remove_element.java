package java_questions_solved;

public class remove_element {
    public static void main(String[] args) {
        int[] nums={};
        int val=3;
        System.out.println(removeElement(nums,val));
    }

    static int removeElement(int[] nums, int val){
        int count=0;
        for(int i=0;i<nums.length;i++) {
            if (nums[i] != val) {
                nums[count] = nums[i];
                count++;
            }
        }
        return count;
    }
}
