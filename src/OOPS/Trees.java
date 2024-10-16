package OOPS;

public class Trees {
}
class Node{
    int data;
    Node left;
    Node right;
    Node(int data){
        this.data=data;
        this.left=null;
        this.right=null;
    }

    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.right = new Node(6);

//        System.out.print("PreOrder is");
//        preOrder(root);
//        System.out.println();
//        System.out.print("PostOrder is");
//        postOrder(root);
//        System.out.println();
//        System.out.print("InOrder is");
//        inOrder(root);

//        System.out.println(LCA(root,4,5).data);
        System.out.println((calculateHeight(root)));
    }

    private static void inOrder(Node root) {
        if(root==null){
            return;
        }
        inOrder(root.left);
        System.out.print(root.data+" ");
        inOrder(root.right);
    }

    private static void postOrder(Node root) {
        if(root==null){
            return;
        }
        postOrder(root.left);
        postOrder(root.right);
        System.out.print(root.data+" ");
    }

    private static void preOrder(Node root) {
        if(root==null){
            return;
        }
        System.out.print(root.data+" ");
        preOrder(root.left);
        preOrder(root.right);
    }

    public static Node LCA(Node root, int n1, int n2){
        if(root==null){
            return null;
        }
        if(root.data==n1 || root.data==n2){
            return root;
        }

        Node leftLCA=LCA(root.left,n1,n2);
        Node rightLCA=LCA(root.right,n1,n2);

        if(leftLCA==null) return rightLCA;

        if(rightLCA==null) return leftLCA;

        return root;
    }


    static int diameter = 0;
    public static int diameterOfBinaryTree(Node root) {
        calculateHeight(root);
        return diameter;
    }

    private static int calculateHeight(Node root) {
        if (root == null) return 0;
        int leftHeight = calculateHeight(root.left);
        int rightHeight = calculateHeight(root.right);
        diameter = Math.max(diameter, leftHeight + rightHeight);
        return Math.max(leftHeight, rightHeight) + 1;
    }

}
