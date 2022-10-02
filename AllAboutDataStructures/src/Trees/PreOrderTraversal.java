package Trees;

/**
 * Step 1 - Visit the root node.
 * Step 2 - Traverse the left subtree recursively.
 * Step 3 - Traverse the right subtree recursively.
 */

public class PreOrderTraversal {

    public  void preOrder(TreeNode root) {
        if(root == null) {
            return;
        }
        System.out.print(root.data + " ");
        preOrder(root.left);
        preOrder(root.right);
    }
}
