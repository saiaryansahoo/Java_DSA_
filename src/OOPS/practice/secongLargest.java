package OOPS.practice;

public class secongLargest {
    public static void main(String[] args) {
        int[]  array={5,2,9,1,6,4};
        int largest=Integer.MIN_VALUE;
        int secondLargest=Integer.MIN_VALUE;

        for (int i = 0; i < array.length; i++) {
            if(array[i]>largest){
                secondLargest=largest;
                largest=array[i];
            }else if(array[i]>secondLargest && array[i]!=largest){
                secondLargest=array[i];
            }
        }

        System.out.println(secondLargest);
    }
}
