package easy;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.stream.IntStream;

public class CommonNodesInBST {
    public static ArrayList<Integer> findCommon(Node root1,Node root2)
    {
        ArrayList<Integer> commonEle = new ArrayList<Integer>();
        HashSet<Integer> allElements = new HashSet<Integer>();
        inorder(root1, allElements);
        addCommon(root2, commonEle, allElements);
        //Collections.sort(commonEle);
        return commonEle;

    }

    public static void inorder(Node root, HashSet<Integer> list){
        if(root==null){
            return;
        }
        inorder(root.left,list);
        list.add(root.data);
        inorder(root.right,list);
    }

    public static void addCommon(Node root, ArrayList<Integer> ans, HashSet<Integer> commonList){
        if(root==null){
            return;
        }
        addCommon(root.left,ans,commonList);
        if(commonList.contains(root.data)){
            ans.add(root.data);
        }
        addCommon(root.right,ans,commonList);
    }
}
