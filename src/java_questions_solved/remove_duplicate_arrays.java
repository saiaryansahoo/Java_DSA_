package java_questions_solved;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class remove_duplicate_arrays {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 3, 4, 2, 5};
        int[] uniqueArr = removeDuplicates(arr);
        System.out.println(Arrays.toString(uniqueArr));
    }

    public static int[] removeDuplicates(int[] arr) {
        Set<Integer> set = new HashSet<>();
        for (int num : arr) {
            set.add(num);
        }

        int[] uniqueArr = new int[set.size()];
        int index = 0;
        for (int num : set) {
            uniqueArr[index] = num;
            index++;
        }

        return uniqueArr;
    }
}
