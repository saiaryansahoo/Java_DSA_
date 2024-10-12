package OOPS.practice;

import java.util.Arrays;

public class mergeArrays {
    public static void main(String[] args) {
        int[] arr1={1,3,5,7,8,9};
        int[] arr2={2,4,6};

        System.out.println(Arrays.toString(merged(arr1, arr2)));
    }

    private static int[] merged(int[] arr1, int[] arr2) {
        int n=arr1.length;
        int m=arr2.length;
        int[] arr3=new int[n+m];

        int i=0,j=0,k=0;

        while(i<n){
            arr3[k++]=arr1[i++];
        }
        while(j<m){
            arr3[k++]=arr2[j++];
        }
        Arrays.sort(arr3);
        return arr3;
    }
}
