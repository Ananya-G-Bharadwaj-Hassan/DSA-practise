package DSA_practise;
import java.util.*;

class TreeNode {
    int val;
    TreeNode left;
     TreeNode right;
     TreeNode() {}
     TreeNode(int val) { this.val = val; }
     TreeNode(int val, TreeNode left, TreeNode right) {
         this.val = val;
         this.left = left;
         this.right = right;
     }
 }

class Preorder {
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> res=new ArrayList<>();
        preorder(root,res);
        return res;
    }
    private void preorder(TreeNode node, List<Integer> res){
        if(node==null){
            return;
        }
        res.add(node.val);
        preorder(node.left,res);
        preorder(node.right,res);
    }

    public static void main(String[] args) {
            Preorder obj=new Preorder();
            DSA_practise.TreeNode root=new DSA_practise.TreeNode(1);
            root.left=new DSA_practise.TreeNode(2);
            root.right=new DSA_practise.TreeNode(3);
            System.out.println(obj.preorderTraversal(root));
        }
}