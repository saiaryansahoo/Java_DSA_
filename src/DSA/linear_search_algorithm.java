package DSA;

public class linear_search_algorithm {
    public static void main(String[] args) {
        String name="Aryan";
        char target = 'K';
        System.out.println(search(name,target));
//        int[] numbs = new int[]{10, 15, 20, 25,23};
//        int target= 23;
//        int ans= linearSearch(numbs ,target);
//        System.out.println(ans);
//
//
//    }
//    static int linearSearch (int[]arr,int target) {
//        if (arr.length == 0) {
//            return -1;
//        }
//        for(int index = 0; index < arr.length; index++ ) {
//            int element = arr[index];
//            if (element == target) {
//                return index;
//            }
//        }
//        return -1;
    }

    static boolean search(String str, char target) {
        if (str.length()==0){
            return false;
        }
        for(int i=0; i<str.length();i++){
            if (target==str.charAt(i)){
                return true;
            }
        }
        return false;

    }
}
