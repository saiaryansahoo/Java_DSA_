package java_questions_solved;

import java.util.Arrays;

public class containerwithMaxWater {
    public static void main(String[] args) {
        int[] arr={1,8,6,2,5,4,8,3,7};
        System.out.println(maxArea(arr));
    }
    static int maxArea(int[] height){
        int l=0;
        int r=height.length-1;
        int max=0;
        while(l<r){
            int lh=height[l];
            int rh=height[r];
            int min_h=Math.min(lh,rh);//height
            int len=r-1;//length
            int area=min_h*len;//area
            max= Math.max(max,area);
            if(lh<rh) l++;
            else r--;
        }
        return max;
    }
}
