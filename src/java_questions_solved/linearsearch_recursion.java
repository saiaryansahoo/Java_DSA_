package java_questions_solved;

public class linearsearch_recursion {
    public static void main(String[] args) {
        int[] arr={2,3,1,4,5};
        System.out.println(linear(arr,4,0));
        System.out.println(findlinear(arr,4,0));
        System.out.println(findlinearLast(arr,4,arr.length-1));
    }
    static boolean linear(int []arr, int target, int index){
        if(index==arr.length){
            return false;
        }
        return arr[index]==target || linear(arr,target, index+1);
    }
    static int findlinear(int []arr, int target, int index) {
        if (index == arr.length) {
            return -1;
        }
        if (arr[index] == target) {
            return index;
        } else {
            return findlinear(arr, target, index + 1);
        }
    }
    static int findlinearLast(int []arr, int target, int index) {
        if (index == -1) {
            return -1;
        }
        if (arr[index] == target) {
            return index;
        } else {
            return findlinearLast(arr, target, index - 1);
        }
    }
}
