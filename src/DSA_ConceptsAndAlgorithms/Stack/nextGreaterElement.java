package DSA_ConceptsAndAlgorithms.Stack;

import java.util.Stack;

public class nextGreaterElement {
    public static void main(String[] args) {
        Stack<Integer> s=new Stack<>();
        int[] temperatures={5,6,1,0,9,3};
        int[] arr=new int[temperatures.length];


        for (int i = temperatures.length-1; i >=0; i--) {
            while(!s.isEmpty() && temperatures[s.peek()]<=temperatures[i]){
                s.pop();
            }if(s.isEmpty()){
                arr[i]=-1;
            }else{
                arr[i]=temperatures[s.peek()];
            }
            s.push(i);
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
}
