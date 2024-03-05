package HashSetAndMap.Questions;

import java.util.HashSet;

public class IntersectionOfTwoArrays {
    public static void main(String[] args) {
        int[] arr1={7,3,9};
        int[] arr2={6,3,9,2,9,4};
        Intersection(arr1,arr2);
    }

    public static void Intersection(int[] arr1, int[] arr2){
        HashSet<Integer> set=new HashSet<>();
        int l1= arr1.length;
        int l2= arr2.length;
        int count=0;

        for (int j : arr1) {
            set.add(j);
        }
        for (int i : arr2) {
            if (set.contains(i)) {
                count++;
                set.remove(i);
            }
        }
        System.out.println(count);
    }
}
