package OOPS.practice;

import java.util.Arrays;
import java.util.Scanner;

public class mergeArrays {
    public static void main(String[] args) {
        int[] arr1={-5, 3, 6, 12, 15};
        int[] arr2={-12, -10, -6, -3, 4, 10 };

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

    public static class binary_search_algo {

        public static void main(String[] args) {
            Scanner input=new Scanner(System.in);
            int[]arr= {-18,-2,0,8,16,32,78,96,99};
            int target=32;
            int ans =binarySearch(arr,target);
            System.out.println(ans);
        }
        static int binarySearch(int[] arr, int target){
            int low=0;
            int high=arr.length-1;

            while(low<=high){
                int mid=low+(high-low)/2;

                if(arr[mid]==target){
                    return mid;
                }

                if(arr[mid]<target){
                    low=mid+1;
                }else{
                    high=mid-1;
                }
            }
            return -1;
        }
    }
}
