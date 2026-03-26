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
    public void preorder(TreeNode node,List<String> arr){
        if(node==null){
            arr.add("null");
            return;
        } 
            

        arr.add(String.valueOf(node.val));
        preorder(node.left,arr);
        preorder(node.right,arr);
    }
    public boolean isSameTree(TreeNode p, TreeNode q) {
        List<String> res1=new ArrayList<>();
        List<String> res2=new ArrayList<>();

        preorder(p,res1);
        preorder(q,res2);
        // System.out.println(res1);
        // System.out.println(res2);
        return res1.equals(res2);
    }
}