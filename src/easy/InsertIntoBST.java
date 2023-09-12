package easy;

public class InsertIntoBST {
    Node insert(Node root, int key) {
        if(root==null)  root = new Node(key);
        else{
            if(root.data==key) return root;
            else if(root.data>key) root.left = insert(root.left, key);
            else root.right = insert(root.right, key);
        }
        return root;
    }
}
