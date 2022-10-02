package Trees;

public class BinaryTrees {

    static int index = -1;

    /**
     * Building the Binary Tree using Preorder traversal.
     */

    public TreeNode buildBinaryTree(int[] nodes) {
        index++;
        if (nodes[index] == -1) {
            return null;
        }
        TreeNode newTreeNode = new TreeNode(nodes[index]);
        newTreeNode.left = buildBinaryTree(nodes);
        newTreeNode.right = buildBinaryTree(nodes);

        return  newTreeNode;
    }

}
