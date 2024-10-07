package assignment4.TreePreorderTraversal;

public class BinaryTree {
    Node root;
    void preOrder(Node root) {
        if (root != null) {
            System.out.print(root.data + " ");
            preOrder(root.left);
            preOrder(root.right);
        }
    }
}
