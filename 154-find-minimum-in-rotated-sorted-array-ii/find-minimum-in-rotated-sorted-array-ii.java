class Solution {
    public int findMin(int[] nums) {
        int mn=nums[0];
        for(int i:nums){
            mn=Math.min(mn,i);
        }
        return mn;
    }
}