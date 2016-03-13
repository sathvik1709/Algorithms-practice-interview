package trees.ConvertBSTtoDLList;

/**
 * Created by Sathvik on 16/01/16.
 */
public class MainDriver {

    //Convert a binary search tree to a sorted double-linked list. 
    // We can only change the target of pointers, but cannot create any new nodes.

    public static void main(String[] args){

        TreeNode root = new TreeNode(8);
        
        BinaryTree tree = new BinaryTree(root);

        root.left.data = 5;
        root.right.data = 4;
        root.left.left.data = 9;
        root.left.right.data = 7;
        root.right.right.data=11;

    }

}
