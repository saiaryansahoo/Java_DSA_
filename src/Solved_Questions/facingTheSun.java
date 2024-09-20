package Solved_Questions;

import java.util.*;

public class facingTheSun {
    public static void main(String[] args) {
        int[] height={7, 4, 8, 2, 9};
        System.out.println(countBuildings(height));
    }
    public static int countBuildings(int[] height) {
        Queue<Integer> q=new LinkedList<>();
        q.add(height[0]);
        int count=1;
        for(int i=1;i<height.length;i++)
        {
            if(height[i]>q.peek())
            {
                q.add(height[i]);
                q.remove();
                count++;
            }
        }
        return count;
    }
}
