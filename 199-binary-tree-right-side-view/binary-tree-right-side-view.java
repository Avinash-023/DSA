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
    public List<Integer> rightSideView(TreeNode root) {
        List<List<Integer>> arr=new ArrayList<>();
        Queue<TreeNode> queue=new LinkedList<>();
        queue.add(root);
        queue.add(null);
        while(queue.peek()!=null){
            List<Integer> level=new ArrayList<>();
            while(queue.peek()!=null){
                TreeNode node=queue.poll();
                level.add(node.val);

                if(node.left!=null) queue.add(node.left);
                if(node.right!=null) queue.add(node.right);

            }
            queue.add(queue.poll());
            arr.add(level);
        }
        List<Integer> res=new ArrayList<>();
        for(List<Integer> list:arr){
            res.add(list.get(list.size()-1));
        }
        return res;
    }
}