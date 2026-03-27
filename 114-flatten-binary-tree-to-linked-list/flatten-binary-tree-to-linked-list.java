/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public void preorder(List<Integer> res,TreeNode root){
        if(root==null) return;

        res.add(root.val);
        preorder(res,root.left);
        preorder(res,root.right);
    }
    public void flatten(TreeNode root) {
        if(root==null) return;
        List<Integer> res=new ArrayList<>();
        preorder(res,root);
        // System.out.println(res);
        TreeNode curr=root;
        for(int i=1;i<res.size();i++){
            curr.left=null;
            curr.right=new TreeNode(res.get(i));
            curr=curr.right;
        }

    }
}