class Solution {
    public int pivotIndex(int[] nums) {
        int[] prefix=new int[nums.length];
        prefix[0]=nums[0];
        for(int i=1;i<nums.length;i++){
            prefix[i]=prefix[i-1]+nums[i];
        }
        int total=prefix[prefix.length-1];
        for(int i=0;i<nums.length;i++){
            if(prefix[i]-nums[i]==total-prefix[i]){
                return i;
            }
        }
        System.out.println(Arrays.toString(prefix));
        return -1;

    }
}