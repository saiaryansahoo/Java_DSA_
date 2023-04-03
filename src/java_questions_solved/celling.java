package java_questions_solved;

public class celling {
    public static void main(String[] args) {
        int[]arr= {-18,-2,0,8,16,32,78,96,99};
        int target= 123;
        int ans = ceiling(arr,target);
        System.out.println(ans);
    }
    static int ceiling(int[] arr, int target){
        if (target>arr[arr.length-1]){
            return -1;
        }

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
        return start;
    }
}
