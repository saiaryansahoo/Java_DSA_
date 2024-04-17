package Solved_Questions;

import java.util.ArrayList;
import java.util.Collections;

public class SmallestStringStartingFromLeaf {
    public static void main(String[] args) {

    }
}
class Solution {
    public String smallestFromLeaf(TreeNode root) {
        if(root==null)
            return "";
        int[] numbers = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25};
        char[] letters = new char[numbers.length];

        for (int i = 0; i < numbers.length; i++) {
            letters[i] = (char) ('a' + numbers[i]);
        }
        ArrayList<String> res = new ArrayList<>();
        ArrayList<Character> temp = new ArrayList<>();
        dfs(root,temp,res,letters);
        Collections.sort(res);
        return res.get(0);
    }
    public static void dfs(TreeNode root, ArrayList<Character> temp, ArrayList<String> res, char[] letters)
    {
        if(root==null)
            return;

        temp.add(letters[root.val]);

        if(root.left == null && root.right==null)
        {
            String s = convert_to_string(temp);
            res.add(s);
        }
        else
        {
            dfs(root.left,temp,res,letters);
            dfs(root.right,temp,res,letters);
        }

        temp.remove(temp.size()-1);
    }
    public static String convert_to_string(ArrayList<Character> temp)
    {
        StringBuilder sb = new StringBuilder();
        for(int i=temp.size()-1;i>=0;i--)
        {
            sb.append(temp.get(i));
        }
        return sb.toString();

    }
}