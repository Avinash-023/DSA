class Solution {
    public int minMoves2(int[] nums) {
        int moves=0;
        Arrays.sort(nums);
        int val=nums[nums.length/2];
        for(int i=0;i<nums.length;i++){
            if(nums[i]<val){
                moves+=(val-nums[i]);
            }
            else{
                moves+=(nums[i]-val);
            }
        }
        return moves;
    }
}