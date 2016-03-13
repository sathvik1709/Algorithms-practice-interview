package trees.MinElementInTree;

/**
 * Created by Sathvik on 09/02/16.
 */
public class BinaryTree {

    Node root = null;

    public BinaryTree(Node root) {
        this.root = root;
    }

    public Node insert(Node node, int data) {

        if (node == null) {
            return (new Node(data));
        } else {
            if (data <= node.data) {
                node.left = insert(node.left, data);
            } else {
                node.right = insert(node.right, data);
            }
            return node;
        }
    }

    public void inOrder (Node root) {

        if(root == null) return;
        inOrder(root.left);
        System.out.println(root.data);
        inOrder(root.right);

    }

    public void printMinOfTree(Node root){

        Node minNode = root;

        while(minNode.left != null){
            minNode = minNode.left;
        }

        System.out.println(minNode.data);

    }

    public boolean isBST(Node node){

        if(node == null){
            return true;
        }

        if (node.right != null) {
            if(node.right.data > node.data){
                return true && isBST(node.right);
            }else{
                return false;
            }
        }

        if(node.left != null){
            if(node.left.data < node.data){
                return true && isBST(node.left);
            }else{
                return false;
            }
        }

        return true;

    }

}
