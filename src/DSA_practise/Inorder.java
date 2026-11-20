package DSA_practise;
import java.util.ArrayList;
import java.util.List;

class Inorder {
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> res=new ArrayList<>();
        inorder(root,res);
        return res;
    }
    private void inorder(TreeNode node, List<Integer> res){
        if(node==null){
            return;
        }
        inorder(node.left,res);
        res.add(node.val);
        inorder(node.right,res);
    }

    public static void main(String[] args) {
        Inorder obj=new Inorder();
        TreeNode root=new TreeNode(1);
        root.left=new TreeNode(2);
        root.right=new TreeNode(3);
        System.out.println(obj.inorderTraversal(root));
    }
}