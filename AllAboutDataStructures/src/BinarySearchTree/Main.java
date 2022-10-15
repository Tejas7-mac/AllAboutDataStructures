package BinarySearchTree;

public class Main {
    public static void main(String []args) {

            int values[] = {5, 1, 2, 3, 4, 7};

            BstTree bstTree = new BstTree();
            Node root = null;

            for(int index = 0; index < values.length; index++) {

               root = bstTree.buildBST(root,values[index]);

            }

        InorderTraversal inorderTraversal = new InorderTraversal();
        inorderTraversal.inOrderForBst(root);
        System.out.println();


        int key = 1;
        int keyTwo = 10;
        if(bstTree.searchInBst(root, keyTwo)) {
            System.out.println("Key Found");
        } else {
            System.out.println("Key Not Found");
        }

        bstTree.deleteNode(root, 1);

        // test by prining the data after deletion of node
        //inorderTraversal.inOrderForBst(root);

    }
}
