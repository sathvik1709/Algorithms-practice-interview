package search.binarytree;

/**
 * Created by Sathvik on 09/01/16.
 */
public class BinaryTreeHandle {

    public static void main(String[] args){

        BinaryTree binaryTree = new BinaryTree();


        binaryTree.insert(new BinaryTreeNode(5));
        binaryTree.insert(new BinaryTreeNode(7));
        binaryTree.insert(new BinaryTreeNode(2));
        binaryTree.insert(new BinaryTreeNode(3));
        binaryTree.insert(new BinaryTreeNode(1));
        binaryTree.insert(new BinaryTreeNode(6));
        binaryTree.insert(new BinaryTreeNode(8));

        binaryTree.printInOrder(binaryTree.root);

    }

}
