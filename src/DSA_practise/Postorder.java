package DSA_practise;
import java.util.*;

class Postorder {
    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> res=new ArrayList<>();
        postorder(root, res);
        return res;
    }

    private void postorder(TreeNode node, List<Integer> res){
        if(node==null){
            return;
        }
        postorder(node.left, res);
        postorder(node.right, res);
        res.add(node.val);
    }

    public static void main(String[] args) {
        Postorder obj=new Postorder();
        TreeNode root=new TreeNode(1);
        root.left=new TreeNode(2);
        root.right=new TreeNode(3);
        System.out.println(obj.postorderTraversal(root));
    }
}