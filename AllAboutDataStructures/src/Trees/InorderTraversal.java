package Trees;

/**
 *Step 1 - Traverse the left subtree recursively.
 *Step 2 - Visit the root node.
 *Step 3 - Traverse the right subtree recursively.
 */

public class InorderTraversal {

    public  void inorder(TreeNode root) {
        if(root == null){
            return;
        }
        inorder(root.left);
        System.out.print(root.data +" ");
        inorder(root.right);
    }
}
