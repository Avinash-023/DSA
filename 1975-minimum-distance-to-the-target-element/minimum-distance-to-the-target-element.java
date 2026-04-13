class Solution {
    public int getMinDistance(int[] nums, int target, int start) {
        int mn=nums.length-1;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==target){
                mn=Math.min(mn,Math.abs(i-start));
            }
        }
        return mn;
    }
}