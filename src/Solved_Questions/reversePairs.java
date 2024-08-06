package Solved_Questions;

import java.util.*;

public class reversePairs {
    public static void main(String[] args) {
        int[] nums={1,3,2,3,1};
        System.out.println(reversePairs(nums));
    }
    public static int reversePairs(int[] nums) {
        int n=nums.length;
        return mergeSort(nums,0,n-1);
    }

    public static int merge(int arr[], int low, int mid, int high)
    {
        int count=0;

        int j = mid + 1;
        for (int i = low; i <= mid; i++) {
            while (j <= high && arr[i] > 2 * arr[j]) {
                j++;
            }
            count += (j - (mid + 1));
        }

        ArrayList<Integer> temp = new ArrayList<>();
        int left = low;
        int right = mid + 1;


        while (left <= mid && right <= high) {
            if (arr[left] <= arr[right]) {
                temp.add(arr[left]);
                left++;
            } else {
                temp.add(arr[right]);
                right++;
            }
        }

        while (left <= mid) {
            temp.add(arr[left]);
            left++;
        }

        while (right <= high) {
            temp.add(arr[right]);
            right++;
        }

        for (int i = low; i <= high; i++) {
            arr[i] = temp.get(i - low);
        }
        return count;
    }

    public static int mergeSort(int arr[], int l, int r)
    {
        if(l >= r) return 0;

        int m=(l+r)/2;

        int count=0;

        count += mergeSort(arr,l,m);

        count += mergeSort(arr,m+1,r);

        count += merge(arr,l,m,r);

        return count;
    }
}
