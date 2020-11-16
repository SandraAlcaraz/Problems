public class BinaryTreeTilt {

    int sum=0;
    public int findTilt(TreeNode root) {
        helper(root);
        return this.sum;
    }
    public int helper(TreeNode root){
        if(root==null) return 0;

        int left=helper(root.left);
        int right= helper(root.right);

        this.sum = sum + Math.abs(right-left);

        return root.val+left+right;
    }
}
