class Solution {
    List<List<Integer>> res=new ArrayList<>();
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        backtrack(0,candidates,target,new ArrayList<>());
        return res;
    }
    public void backtrack(int start,int[] candidates,int target,List<Integer> path){
        if(target==0){
            res.add(new ArrayList<>(path));
            return;
        }
        if(target < 0) return;
        for(int i=start;i<candidates.length;i++){
            path.add(candidates[i]);
            backtrack(i,candidates,target-candidates[i],path);
            path.remove(path.size()-1);
        }
    }
}