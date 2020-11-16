import java.util.ArrayList;
import java.util.List;

public class LevelOrder {
    List<List<Integer>> list = new ArrayList<List<Integer>>();

    public List<List<Integer>> levelOrder(TreeNode root) {
        if(root==null) return list;
        helper(root,0);
        return list;

    }


    public int maxDepth(TreeNode root) {
        if(root==null) return 0;
        int left= maxDepth(root.left);
        int right=maxDepth(root.right);
        return Math.max(left,right)+1;
    }















    public void helper(TreeNode node, int level){
        if(list.size()==level) list.add(new ArrayList<>());

        list.get(level).add(node.val);

        if(node.left!=null) {
            helper(node.left, level+1);
        }
        if(node.right!=null){
            helper(node.right, level+1);
        }
    }



    private int answer;		// don't forget to initialize answer before call maximum_depth
    private void maximum_depth(TreeNode root, int depth) {
        if (root == null) {
            return;
        }
        if (root.left == null && root.right == null) {
            answer = Math.max(answer, depth);
        }
        maximum_depth(root.left, depth + 1);
        maximum_depth(root.right, depth + 1);
    }

    public int maximum_depth(TreeNode root) {
        if (root == null) {
            return 0;                                   // return 0 for null node
        }
        int left_depth = maximum_depth(root.left);
        int right_depth = maximum_depth(root.right);
        return Math.max(left_depth, right_depth) + 1;	// return depth of the subtree rooted at root
    }
}
