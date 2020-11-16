public class MaxDifferenceNodeAncestor {
int max=0;

    public int maxAncestorDiff(TreeNode root) {
        if(root==null) return 0;
        return helper(root.val, root.val, root);
    }

    public int helper(int maxV, int minV, TreeNode root){
        if(root==null) return max= maxV-minV;

        maxV= Math.max(maxV, root.val);
        minV= Math.min(minV, root.val);

        int actualLeft= helper(maxV, minV,root.left);
        int actualRight= helper(maxV, minV, root.right);

        max=Math.max(max, actualLeft);
        max=Math.max(max,actualRight);
        return max;
    }




}
