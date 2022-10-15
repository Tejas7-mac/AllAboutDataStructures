package BinarySearchTree;

public class InorderTraversal {

    /**
     *Step 1 - Traverse the left subtree recursively.
     *Step 2 - Visit the root node.
     *Step 3 - Traverse the right subtree recursively.
     */


    public  void inOrderForBst(Node root) {

        if(root == null) {
            return;
        }

        inOrderForBst(root.left);
        System.out.print(root.data + " ");
        inOrderForBst(root.right);
    }
}
