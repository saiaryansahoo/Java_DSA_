package HashSetAndMap.Questions;

import java.util.*;

public class MajorityElements { //Question 1: MajorityElements
    public static void main(String[] args) {
        int[] nums ={1,3,2,5,1,3,1,5,1};
        majorityElements(nums);
    }
    public static void majorityElements(int[] nums) {
        HashMap<Integer, Integer> Map = new HashMap<>();
        int len = nums.length;
        for (int num : nums) {
            if (Map.containsKey(num)) {
                Map.put(num, Map.get(num) + 1);
            } else {
                Map.put(num, 1);
            }
        }

        for (int key : Map.keySet()) {
            if (Map.get(key) > len / 3) {
                System.out.println(key);
            }
        }
    }
}
