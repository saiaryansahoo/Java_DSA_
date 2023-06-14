package java_questions_solved;

import java.util.Arrays;

public class bubblesort_recursion {
    public static void main(String[] args) {
        int[]arr={4,5,3,1,2};
        bubble(arr,arr.length-1,0);
        System.out.println(Arrays.toString(arr));
    }
    static void bubble(int[]arr, int r, int c){
        if(r==0){
            return;
        }
        if(c<r){
            if (arr[c]>arr[c+1]){
                int val=arr[c];
                arr[c]=arr[c+1];
                arr[c+1]=val;
            }
            bubble(arr,r,c+1);
        }
        else {
            bubble(arr,r-1,0);
        }
    }
}
