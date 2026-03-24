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
    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        // if(root==null) return null;
        List<List<Integer>> res=new ArrayList<>();
        Queue<TreeNode> queue=new LinkedList<>();
        queue.add(root);
        queue.add(null);
        while(queue.peek()!=null){
            List<Integer> level=new ArrayList<>();
            while(queue.peek()!=null){
                TreeNode node =queue.poll();
                level.add(node.val);

                if(node.left!=null) queue.add(node.left);

                if(node.right!=null) queue.add(node.right);

            }
            queue.add(queue.poll());

            res.add(level);
        }
        List<List<Integer>> ans=new ArrayList<>();
        for(int i=res.size()-1;i>=0;i--){
            List<Integer> temp=res.get(i);
            ans.add(temp);
        }
        return ans;
    }
}