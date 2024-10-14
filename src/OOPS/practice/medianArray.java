package OOPS.practice;

import java.util.Arrays;

public class medianArray {
    public static void main(String[] args) {
        int[] arr1={3,4,5};
        int[] arr2={6,7,8};
        System.out.println(median(arr1,arr2));
    }

    private static double median(int[] arr1, int[] arr2) {
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
        int len=arr3.length;

        if(len%2==0){
            int mid=len/2;
            int mid1=mid-1;
            return (arr3[mid]+arr3[mid1])/2.0;
        }else{
            return arr3[len/2];
        }
    }
}
