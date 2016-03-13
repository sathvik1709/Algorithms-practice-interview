package trees.MinElementInTree;

/**
 * Created by Sathvik on 09/02/16.
 */
public class TreeDriver {

    public static void main(String[] args){
        Node root = new Node(20);

        BinaryTree binaryTree = new BinaryTree(root);

        binaryTree.insert(root,22);
        binaryTree.insert(root,8);
        binaryTree.insert(root,4);
        binaryTree.insert(root,12);
        binaryTree.insert(root,10);
        binaryTree.insert(root,14);

        //binaryTree.inOrder(root);

        // Print minimum of tree
        System.out.println("Minimum of BST");
        binaryTree.printMinOfTree(root);

        // Check if Binary Tree or not
        System.out.println("Is BST");
        System.out.println(binaryTree.isBST(root));


    }
}

