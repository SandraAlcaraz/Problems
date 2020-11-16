public class SubtreeofAnotherTree {
    public static boolean booleanisSubtree(TreeNode s, TreeNode t){
        if(s==null){
            return false;
        }
        if(s.val==t.val){
            return compare(s,t);
            }
        if(booleanisSubtree(s.left, t)){
            return true;
        }
        if(booleanisSubtree(s.right,t)){
            return true;
        }

        return false;
        }




    public static boolean compare(TreeNode s, TreeNode t){
        if(s==null && t==null){
            //this means that both trees are equal
            return true;
        }
        if((s!=null&&t==null)||(s==null&&t!=null)){
            //one of this nodes has more children, so they are not equal
            return false;
        }
        if(s.val!=t.val){
           return false;
        }
        if(compare(s.left,t.left)&& compare(s.right,t.right)){
            return true;
        }

        return false;
    }



    public static void main(String args []){
        TreeNode treeNode= new TreeNode(1);
    }
}
