package DSA_ConceptsAndAlgorithms;

import java.util.Arrays;

public class selection_sort {
    public static void main(String[] args) {
        int[] arr={64,25,12,22,11};

        for (int i = 0; i < arr.length; i++) {
            int minIdx=i;
            for (int j = i+1; j < arr.length; j++) {
                if(arr[j]<arr[minIdx]) {
                    minIdx=j;
                }
            }
            int temp=arr[i];
            arr[i]=arr[minIdx];
            arr[minIdx]=temp;
        }
        System.out.println(Arrays.toString(arr));
    }
}
