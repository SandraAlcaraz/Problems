import java.util.ArrayList;
import java.util.List;

public class Preorder {

    private List<Integer> a = new ArrayList<>();

    public List<Integer> preorderTraversal(TreeNode root) {
        if(root==null) return a;
        a.add(root.val);
        preorderTraversal(root.left);
        preorderTraversal(root.right);
        return a;
    }

    public static void main (String [] args){

    }
}
