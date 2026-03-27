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
    boolean flag=true;
    public void preorder(TreeNode root,int val){
        if(root==null) return;
        if(root.val!=val){
            flag=false;
            return;
        }

        preorder(root.left,val);
        preorder(root.right,val);
    }
    public boolean isUnivalTree(TreeNode root) {
        int val=root.val;
        preorder(root,val);
        return flag;
    }
}