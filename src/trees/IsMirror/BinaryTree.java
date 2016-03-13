package trees.IsMirror;

/**
 * Created by Sathvik on 16/01/16.
 */
public class BinaryTree {

    Node root;

    public boolean isMirror(Node node1, Node node2){

        if(node1 == null && node2 == null){
            return true;
        }

        if(node1 != null && node2 != null && node1.data == node2.data){
            return isMirror(node1.left,node2.right) && isMirror(node1.right,node2.left);
        }

        return false;

    }
}
