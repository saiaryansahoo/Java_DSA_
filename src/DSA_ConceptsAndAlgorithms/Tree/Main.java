package DSA_ConceptsAndAlgorithms.Tree;

public class Main {
    public static void main(String[] args) {
        BinaryTree tree=new BinaryTree();
        tree.insert(8);
        tree.insert(7);
        tree.insert(15);
        tree.insert(12);
        tree.insert(1);
        tree.insert(6);

        tree.inOrder();
    }
}

