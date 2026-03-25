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
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> res=new ArrayList<>();
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
            res.add(level);
            queue.add(queue.poll());
        }
        for(int i=0;i<res.size();i++){
            if(i%2==1){
                List<Integer> temp=res.get(i);
                int left=0;
                int right=temp.size()-1;
                while(left<right){
                    int tp=temp.get(left);
                    temp.set(left,temp.get(right));
                    temp.set(right,tp);
                    left++;
                    right--;
                }
                res.set(i,temp);
            }
        }
        return res;
    }
}