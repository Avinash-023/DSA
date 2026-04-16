class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        List<List<Integer>> res=new ArrayList<>();
        Arrays.sort(nums);
        backtrack(0,res,nums,new ArrayList<>());
        return res;
    }
    public void backtrack(int start,List<List<Integer>> res,int[] nums,List<Integer> path){
        if(!res.contains(path)){
            res.add(new ArrayList<>(path));

        }

        for(int i=start;i<nums.length;i++){
            path.add(nums[i]);
            backtrack(i+1,res,nums,path);
            path.remove(path.size()-1);
        }
    }
}