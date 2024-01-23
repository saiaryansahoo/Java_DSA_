package Solved_Questions;

public class binarysearch_using_recusrion {
    public static void main(String[] args) {
        int[]arr={1,12,13,24,35,46};
        int target=35;
        System.out.println(find(arr,target, 0, arr.length-1));
    }
    static int find(int[] arr, int target,int s, int e){
        //s=start; e=end; m=mid
        if (s>e) {
            return -1;
        }
        int m=s+(e-s)/2;
        if(arr[m]==target){
            return m;
        }
        if (target<arr[m]){
            return find(arr,target,s,m-1);
        }
        return find(arr, target,m+1,e);
    }
}
