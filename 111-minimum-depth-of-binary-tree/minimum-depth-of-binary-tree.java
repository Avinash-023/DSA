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
    public int minDepth(TreeNode root) {
        int depth=1;
        Queue<TreeNode> queue=new LinkedList<>();
        queue.offer(root);
        queue.offer(null);
        while(queue.peek()!=null){
            while(queue.peek()!=null){

            TreeNode node=queue.poll();
            if(node.left==null && node.right==null){
                return depth;
            }

            if(node.left!=null) queue.offer(node.left);

            if(node.right!=null) queue.offer(node.right);
            }
            queue.offer(queue.poll());
            depth++;

        }
        return 0;
    }
}