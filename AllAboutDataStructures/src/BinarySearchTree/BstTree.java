package BinarySearchTree;

public class BstTree {


    /**
     * Insert data inside the Binary search tree.
     */
    public Node buildBST(Node root , int val) {

        if(root == null) {
            root = new Node(val);
            return root;
        }

        if(val < root.data) {
            root.left = buildBST(root.left, val);
        } else {
            root.right = buildBST(root.right, val);
        }
        return root;
    }

    /**
     * search the data in the BST.
     */

      public boolean searchInBst(Node root, int key) {
          if(root == null) {
              return false;
          }
          if(root.data == key) {
              return true;
          } else if(root.data > key) {
              return searchInBst(root.left, key);
          } else {
              return searchInBst(root.right, key);
          }
      }

    /**
     * Delete a Give Node In BST.
     */
    public static Node deleteNode(Node root, int value) {
        if(value < root.data ) {
            root.left = deleteNode(root.left, value);
        } else if(value > root.data) {
            root.right = deleteNode(root.right, value);
        } else {
            // case 1 where the node doesn't have any left and right nodes.
            if(root.left == null && root.right == null) {
                return  null;
            }
            // case 2 where the node has only one child node.
            if(root.left == null) {
                return root.right;
            }
            if(root.right == null) {
                return  root.left;
            }
            // case 3 the node has both right and left subtrees.

            Node iS = inOrderSuccessor(root.right);
            root.data = iS.data;
            root.right = deleteNode(root.right, iS.data);
        }
        return root;
    }
    public static Node inOrderSuccessor(Node root) {
        while (root.left != null) {
            root = root.left;
        }
        return root;
    }


}
