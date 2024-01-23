package DSA_ConceptsAndAlgorithms.Recursion;

public class Q9 {
    public static void main(String[] args) {
        //array sorted or not
        int[] arr={1,3,2,5,4,6};
        System.out.println(sorted(arr,0));
    }
     static boolean sorted(int[] arr, int index ){
        if(index== arr.length-1){
            return true;
        }
        return arr[index]<arr[index+1] && sorted(arr,index+1);
     }
}
