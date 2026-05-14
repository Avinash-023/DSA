class Solution {
    public boolean isGood(int[] nums) {
        int mx=nums[0];
        for(int i:nums){
            mx=Math.max(mx,i);
        }
        int[] res=new int[mx+1];
        int index=0;
        for(int i=1;i<=mx;i++){
            res[index++]=i;
        }
        res[index]=mx;
        // System.out.println(Arrays.toString(res));
        Arrays.sort(nums);
        return Arrays.equals(nums,res);
    }
}