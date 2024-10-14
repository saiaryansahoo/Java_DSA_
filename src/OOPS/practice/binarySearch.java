package OOPS.practice;

public class binarySearch {
    public static void main(String[] args) {
        int[]arr={1,12,13,24,35,46};
        int target=13;
        int ans=binary(arr, target);
        System.out.println(ans);
    }

    private static int binary(int[] arr, int target) {
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
