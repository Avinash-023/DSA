class Solution {
    public int countPartitions(int[] nums) {
        int total=0;
        for(int i=0;i<nums.length;i++){
            total+=nums[i];
        }
        int[] prefix=new int[nums.length];
        prefix[0]=nums[0];
        int count=0;
        for(int i=1;i<nums.length;i++){
            prefix[i]=prefix[i-1]+nums[i];
            int val=prefix[i]-(total-prefix[i]);
            if(val%2==0){
                count++;
            }
        }
        System.out.println(total);
        return count;
    }
}