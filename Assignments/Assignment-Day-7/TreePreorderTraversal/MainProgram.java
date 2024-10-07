package assignment4.TreePreorderTraversal;

public class MainProgram {
    public static void main(String[] args) {
        BinaryTree binaryTree = new BinaryTree();
        binaryTree.root = new Node(1);
        binaryTree.root.right = new Node(2);
        binaryTree.root.right.right = new Node(5);
        binaryTree.root.right.right.left = new Node(3);
        binaryTree.root.right.right.left.right = new Node(4);
        binaryTree.root.right.right.right = new Node(6);
        System.out.println("Preorder traversal of binary tree is:");
        binaryTree.preOrder(binaryTree.root);
    }
}
