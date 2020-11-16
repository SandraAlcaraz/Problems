import java.util.ArrayList;
import java.util.List;

public class Posorder {

    private List<Integer> a = new ArrayList<>();

    public List<Integer> postorderTraversal(TreeNode root) {
        if(root==null) return a;
        postorderTraversal(root.left);
        postorderTraversal(root.right);
        a.add(root.val);

        return  a;
    }
}
