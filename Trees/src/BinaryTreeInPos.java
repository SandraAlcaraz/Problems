
import java.util.HashMap;

public class BinaryTreeInPos {
    HashMap<Integer, Integer> map = new HashMap<>();
    int [] post;
    int indexP;
    public TreeNode buildTree(int[] inorder, int[] postorder) {
        for(int i=0; i<inorder.length; i++ )
            map.put(inorder[i], i);

        post= postorder;
        indexP= postorder.length-1;


        return helper(0, inorder.length-1);
    }

    public TreeNode helper(int inleft, int inright){
        if(inleft>inright) return null;
        TreeNode root= new TreeNode(post[indexP]);
        indexP--;

        int index= map.get(root.val);
        root.right=helper(index+1, inright);
        root.left=helper(inleft, index-1);

        return root;
    }
}
