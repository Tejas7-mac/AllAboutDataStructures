package Trees;

public class Main {

    public static void main(String[] args) {
        int []nodes = {1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1};
        BinaryTrees binaryTrees = new BinaryTrees();
        TreeNode root = binaryTrees.buildBinaryTree(nodes);
        System.out.println(root.left.left.data);

        PreOrderTraversal object = new PreOrderTraversal();
        object.preOrder(root);

        InorderTraversal inorderTraversal = new InorderTraversal();

        System.out.println();
        inorderTraversal.inorder(root);

        PostOrderTraversal postOrderTraversal = new PostOrderTraversal();
        System.out.println();
        postOrderTraversal.postOrder(root);

        LevelOrderTraversal levelOrderTraversal = new LevelOrderTraversal();
        System.out.println();
        levelOrderTraversal.levelOrder(root);
    }
}
