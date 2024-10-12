package OOPS.practice;

import java.util.Arrays;
import java.util.HashSet;

public class duplicateElements {
    public static void main(String[] args) {
        int[] elements={1,2,3,6,3,1,7,9,0};
        //HashSet<Integer> set=duplicte(elements);
        duplicte(elements);
    }

    private static void duplicte(int[] elements) {
//        HashSet<Integer> duplicate = new HashSet<>();
//        HashSet<Integer> seen=new HashSet<>();
//
//        for (int i = 0; i < elements.length; i++) {
//            int element=elements[i];
//            if(seen.contains(element)){
//                duplicate.add(element);
//            }else{
//                seen.add(element);
//            }
//        }
//        return duplicate;

        Arrays.sort(elements);

        for (int i = 1; i < elements.length; i++) {
            if(elements[i-1]==elements[i]){
                System.out.println(elements[i]);
            }
        }
    }
}
