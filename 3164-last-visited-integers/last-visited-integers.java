class Solution {
    public List<Integer> lastVisitedIntegers(int[] nums) {
        List<Integer> ans=new ArrayList<>();
        List<Integer> seen=new ArrayList<>();
        int k=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]!=-1){
                seen.add(0,nums[i]);
                k=0;
            }
            else{
                if(k<seen.size()){
                    ans.add(seen.get(k));
                    k++;
                }
                else{
                    ans.add(nums[i]);
                }
            }
        }
        // System.out.println(seen);
        return ans;
    }
}