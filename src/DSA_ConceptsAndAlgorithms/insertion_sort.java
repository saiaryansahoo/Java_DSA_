package DSA_ConceptsAndAlgorithms;

import java.util.Arrays;
import java.util.Collections;

import static java.util.Collections.swap;

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
                    swap(Collections.singletonList(arr), j, j - 1);
                } else {
                    break;
                }
            }
        }
    }
}
