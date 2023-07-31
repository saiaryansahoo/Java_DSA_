package java_questions_solved;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Combination_Sum_iii {
    public static void main(String[] args) {
        int k=3;
        int n=9;
        System.out.println(combinationSum3(k,n));
    }
    public static List<List<Integer>> combinationSum3(int k, int n){
        List<List<Integer>> result=new ArrayList<>();
        combinations(1,k,n,new LinkedList<>(),result);
        return result;
    }
    private static void combinations(int start, int k, int n, LinkedList<Integer> ll, List<List<Integer>> result){
        if(k<0||n<0)
            return;
        if (k==0 && n==0){
            result.add(new ArrayList<>(ll));
            return;
        }
        for(int i=start;i<=9;i++){
            ll.add(i);
            combinations(i+1,k-1,n-i,ll,result);
            ll.removeLast();
        }
    }
}
