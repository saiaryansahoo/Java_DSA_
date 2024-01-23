package DSA_ConceptsAndAlgorithms.Recursion;

import java.util.ArrayList;

public class ReturningAn_ArrayListString {
    public static void main(String[] args) {
        System.out.println(ArrLstReturn("", "abc"));
    }
    static ArrayList<String> ArrLstReturn (String p, String up){
        if(up.isEmpty()){
            ArrayList<String> list= new ArrayList<>();
            list.add(p);
            return list;
        }
        char ch=up.charAt(0);

        ArrayList<String> left=ArrLstReturn(p+ch,up.substring(1));
        ArrayList<String> right=ArrLstReturn(p,up.substring(1));

        left.addAll(right);
        return left;
    }
}
