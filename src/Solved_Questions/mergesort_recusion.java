package Solved_Questions;

import java.util.Arrays;

public class mergesort_recusion {
    public static void main(String[] args) {
        int[]arr={23,42,12,9,4,6};
        int[] ans=merge(arr);
        System.out.println(Arrays.toString(ans));
    }
    static int[] merge(int[] arr){
        if(arr.length==1){
            return arr;
        }
        int mid=arr.length/2;

        int[] left=merge((Arrays.copyOfRange(arr,0, mid)));
        int[] right=merge((Arrays.copyOfRange(arr,mid, arr.length)));

        return merge(left, right);
    }

    private static int[] merge(int[] first, int[] second) {
        int[] mix=new int[first.length+second.length];

        int i=0;
        int j=0;
        int k=0;

        while ((i<first.length && j< second.length)){
            if(first[i]<second[j]){
                mix[k]=first[i];
                i++;
            }
            else {
                mix[k]=second[j];
                j++;
            }
            k++;
        }
        while ((i<first.length)){
            mix[k]=first[i];
            i++;
            k++;
        }
        while (j<second.length){
            mix[k]=second[j];
            j++;
            k++;
        }
        return mix;
    }

}
