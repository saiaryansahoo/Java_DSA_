package DSA_ConceptsAndAlgorithms;

import java.util.Arrays;

import static DSA_ConceptsAndAlgorithms.selection_sort.swap;

public class insertion_sort {
    public static void main(String[] args) {
        int[] arr = {0, -23, 56, 18};
        insertion(arr);
        System.out.println(Arrays.toString(arr));

    }

    static void insertion(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j > 0; j--) {
                if (arr[j] < arr[j - 1]) {
                    swap(arr, j, j - 1);
                } else {
                    break;
                }
            }
        }
    }
}
