public class SerializeDeserializeBinaryT {
    public String serialize(TreeNode root) {
        if(root==null) return "[]";
        String a= serializeHelper(root, "");
        return "["+a+"]";
    }

    public String serializeHelper(TreeNode root, String str){
        if (root == null) {
            str += "null,";
        }else{
            str+=root.val+",";
            str=serializeHelper(root.left, str);
            str=serializeHelper(root.right,str);
        }
        return str;
    }


    public TreeNode deserialize(String data) {
        return new TreeNode();
    }
}
