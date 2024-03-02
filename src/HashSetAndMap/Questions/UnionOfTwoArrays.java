package HashSetAndMap.Questions;

import java.util.*;

public class UnionOfTwoArrays {
    public static void main(String[] args) {
        int[] arr1={7,3,9,10};
        int[] arr2={6,3,9,2,9,4};
        Union(arr1,arr2);
    }
    public static void Union(int[] arr1,int[] arr2){
        HashSet<Integer> set=new HashSet<>();
        int l1=arr1.length;
        int l2= arr2.length;

        for (int i = 0; i < l1; i++) {
            set.add(arr1[i]);
        }
        for (int j = 0; j < l2; j++) {
            set.add(arr2[j]);
        }
        System.out.println(set.size());
        System.out.println(set);
    }
}
