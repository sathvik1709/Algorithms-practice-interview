package search.binarytree;

/**
 * Created by Sathvik on 09/01/16.
 */
public class BinaryTree {

    BinaryTreeNode root;

    public BinaryTree() {
        this.root = root;
    }

    public void insert(BinaryTreeNode node){

        BinaryTreeNode currentNode = null;

        if(root == null){
            root = node;
        }else{
            currentNode = root;
            while(true){

                if(node.data < currentNode.data){
                    if(currentNode.left == null){
                        currentNode.left = node;
                        return;
                    }else {
                        currentNode = currentNode.left;
                    }
                }else{
                    if(currentNode.right == null){
                        currentNode.right = node;
                        return;
                    }else {
                        currentNode = currentNode.right;
                    }
                }

            }
        }

    }

    public void printInOrder(BinaryTreeNode node)
    {
        if (node == null)
            return;

        /* first recur on left child */
        printInOrder(node.left);

        /* then print the data of node */
        System.out.print(node.data + " ");

        /* now recur on right child */
        printInOrder(node.right);
    }

}
