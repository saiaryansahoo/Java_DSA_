package DSA_ConceptsAndAlgorithms.Tree;

public class BinaryTree {
    Node root;

    public void insert(int data) {
        root = insertRec(root, data);
    }

    public Node insertRec(Node root, int data) {
        if (root == null) {
            root = new Node(data);
        } else if (data < root.data) {
            root.left = insertRec(root.left, data);
        } else if (data > root.data) {
            root.right = insertRec(root.right, data);
        }
        return root;
    }

    public void inOrder(){
        inOrderRecursion(root);
    }

    public void inOrderRecursion(Node root){
        if(root != null){
            inOrderRecursion(root.left);
            System.out.print(root.data+" ");
            inOrderRecursion(root.right);
        }
    }

    public void preOrder(){
        preOrderRecursion(root);
    }

    public void preOrderRecursion(Node root){
        if(root != null){
            System.out.print(root.data+" ");
            inOrderRecursion(root.left);
            inOrderRecursion(root.right);
        }
    }
}

class Node{
    int data;
    Node right;
    Node left;

    public Node(int data){
        this.data=data;
    }
}
