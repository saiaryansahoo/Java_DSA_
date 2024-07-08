package Solved_Questions;

import java.util.ArrayList;
import java.util.List;

public class secondLargest {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(12);
        list.add(35);
        list.add(1);
        list.add(10);
        list.add(34);
        list.add(1);
        System.out.println(list);

        System.out.print(secondLargestElement(list));
    }

    private static int secondLargestElement(ArrayList<Integer> list) {
        if(list==null || list.size()<2){
            return -1;
        }
        int largest=Integer.MIN_VALUE;
        int secondLargest=Integer.MIN_VALUE;

        for (int i = 0; i < list.size(); i++) {
            if(list.get(i) > largest){
                secondLargest=largest;
                largest=list.get(i);
            }else if (list.get(i) > secondLargest && list.get(i)!=largest){
                secondLargest=list.get(i);
            }
        }
        return secondLargest;
    }
}
