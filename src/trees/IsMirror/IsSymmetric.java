package trees.IsMirror;

/**
 * Created by Sathvik on 16/01/16.
 */
public class IsSymmetric {

    public static void main(String[] args){

        BinaryTree tree = new BinaryTree();
        tree.root = new Node(1);
        tree.root.left = new Node(2);
        tree.root.right = new Node(2);
        tree.root.left.left = new Node(3);
        tree.root.left.right = new Node(4);
        tree.root.right.left = new Node(4);
        tree.root.right.right = new Node(3);
        boolean output = tree.isMirror(tree.root, tree.root);
        if (output == true) {
            System.out.println("1");
        } else {
            System.out.println("0");
        }
    }

}
