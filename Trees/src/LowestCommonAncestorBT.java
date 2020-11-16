public class LowestCommonAncestorBT {
    TreeNode nodeC;
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        nodeC= null;
        helper(root, p, q);
        return nodeC;
    }

    public boolean helper(TreeNode root, TreeNode p, TreeNode q){
        if(root==null) return false;

        boolean left= helper(root.left, p, q);
        boolean right= helper(root.right, p, q);
        boolean self= (root.val==p.val)||(root.val==q.val);
        if((self&&right)|| self&&left|| right&&left)
             nodeC= root;
        return self||right||left;
    }
}
