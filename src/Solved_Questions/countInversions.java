package Solved_Questions;

import java.util.*;

public class countInversions {
    public static void main(String[] args) {
        //n = 5, arr[] = {2, 4, 1, 3, 5}
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the length of the array: ");
        long n=sc.nextLong();


        long[] arr = new long[(int) n];

        System.out.print("Enter the array elements: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextLong();
        }

        System.out.println("Number of inversions: " + inversionCount(arr, n));
    }
    public static long inversionCount(long arr[], long n) {
        // Your Code Here
        return mergeSort(arr,0,(int)n-1);
    }

    public static long merge(long arr[], int low, int mid, int high)
    {
        // Your code here
        long count=0;
        ArrayList<Long> temp = new ArrayList<>();
        int left = low;
        int right = mid + 1;


        while (left <= mid && right <= high) {
            if (arr[left] <= arr[right]) {
                temp.add(arr[left]);
                left++;
            } else {
                temp.add(arr[right]);
                count += (mid - left + 1);
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

    public static long mergeSort(long arr[], int l, int r)
    {
        //code here
        if(l >= r) return 0;

        int m=(l+r)/2;

        long count=0;

        count += mergeSort(arr,l,m);

        count += mergeSort(arr,m+1,r);

        count += merge(arr,l,m,r);

        return count;
    }
}
