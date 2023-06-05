package DSA;

public class binary_search_algo {

    public static void main(String[] args) {
        int[]arr= {-18,-2,0,8,16,32,78,96,99};
        int target=96;
        int ans =binarySearch(arr,target);
        System.out.println(ans);
    }
    static int binarySearch(int[] arr, int target){
        int start=0;
        int end =arr.length -1;

        boolean isAsc;
        isAsc= arr[start] < arr[end];

        while(start <= end) {
            int mid = start + (end - start) / 2;

            if (arr[mid] == target) {
                return mid;
            }
            if (isAsc)
                if (target < arr[mid]) {
                end = mid - 1;
                }
                else {
                start = mid + 1;
            }
        else{
                if (target > arr[mid]) {
                    end = mid - 1;
                }
                else {
                    start = mid + 1;
                }
            }

        }
            return -1;
    }
}
