package Trees;

import java.util.LinkedList;
import java.util.Queue;

/**
 * Traverse the tree based on the level.
 * root node = level 1.
 * left and right nodes of root will be considered as the level-2.
 * we will travel through each level and print the elements in that level.
 */

public class LevelOrderTraversal {

    public void levelOrder(TreeNode root) {

        if(root == null) {
            return;
        }
        Queue<TreeNode> queue = new LinkedList<>();

        queue.add(root);
        queue.add(null);

        while(!queue.isEmpty()) {
            TreeNode currentNode = queue.remove();

            if(currentNode == null) {
                System.out.println();
                if(queue.isEmpty()) {
                    break;
                } else {
                    queue.add(null);
                }
             } else {
                System.out.print(currentNode.data +" ");

                if(currentNode.left != null) {
                    queue.add(currentNode.left);
                }
                if(currentNode.right != null) {
                    queue.add(currentNode.right);
                }
             }
        }


    }

}
