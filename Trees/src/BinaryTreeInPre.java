import java.util.HashMap;

public class BinaryTreeInPre {

    HashMap<Integer, Integer> mapIn= new HashMap<>();
    int [] preorder;
    int preIndx;

    public TreeNode buildTree(int[] preorder, int[] inorder) {
        for(int i=0;i<inorder.length; i++)
            mapIn.put(inorder[i], i);
        this.preorder=preorder;
        this.preIndx=0;

        return helper(0, inorder.length-1);
    }

    public TreeNode helper(int left, int right){
        if(left>right) return null;
        TreeNode root= new TreeNode(preorder[preIndx]);
        preIndx++;

        int indx= mapIn.get(root.val);
        root.left= helper(left+1,indx);
        root.right= helper(indx+1, right);

        return root;
    }




}
