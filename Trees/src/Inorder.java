import java.util.ArrayList;
import java.util.List;

public class Inorder {
    private List<Integer> a = new ArrayList<>();

    public List<Integer> inorderTraversal(TreeNode root) {
        if(root==null)  return a;
        inorderTraversal(root.left);
        a.add(root.val);
        inorderTraversal(root.right);

        return a;
    }
}
