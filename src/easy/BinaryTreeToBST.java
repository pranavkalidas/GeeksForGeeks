package easy;

import java.util.ArrayList;
import java.util.Collections;

public class BinaryTreeToBST {
    Node binaryTreeToBST(Node root)
    {
        ArrayList<Integer> list = new ArrayList<>();
        inorder(root, list);
        Collections.sort(list);
        binaryTreeToBST(root,list);
        return root;
    }
    public void inorder( Node root, ArrayList<Integer> list ){
        if(root!=null) {
            inorder(root.left, list);
            list.add(root.data);
            inorder(root.right, list);
        }
    }
    public static void binaryTreeToBST( Node root, ArrayList<Integer> list ){
        if(root!=null) {
            binaryTreeToBST(root.left, list);
            root.data = list.remove(0);
            binaryTreeToBST(root.right, list);
        }
    }
}
 class Node
{
    int data;
    Node left, right;
    Node(int item){
        data = item;
        left = right = null;
    }
}

