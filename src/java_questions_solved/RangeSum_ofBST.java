package java_questions_solved;

import javax.swing.tree.TreeNode;

import static javax.swing.tree.TreeNode.*;

public class RangeSum_ofBST {
    public static void main(String[] args) {

    }
}
class Solution18 {
    int sum=0;
    public int helperFunc(TreeNode temp, int low, int high){
        if(temp.val<=high && temp.val>=low){
            sum=sum+temp.val;
        }
        if(temp.left!=null){
            helperFunc(temp.left,low,high);
        }
        if(temp.right!=null){
            helperFunc(temp.right,low,high);
        }
        return sum;
    }
    public int rangeSumBST(TreeNode root, int low, int high) {
        if(root==null){
            return 0;
        }
        else{
            return helperFunc(root,low,high);
        }
    }
}