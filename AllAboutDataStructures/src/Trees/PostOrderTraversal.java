package Trees;

/**
 * Step 1 - Traverse the left subtree recursively.
 * Step 2 - Traverse the right subtree recursively.
 * Step 3 - Visit the root node.
 */

public class PostOrderTraversal {
    public void postOrder(TreeNode root) {
        if(root == null) {
            return;
        }

        postOrder(root.left);
        postOrder(root.right);
        System.out.print(root.data + " ");
    }
}
