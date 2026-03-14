class Solution {
    public int gcd(int a,int b){
        while(b>0){
            int temp=a%b;
            a=b;
            b=temp;
        }
        return a;
    }
    public long gcdSum(int[] nums) {
        int prefixgcd[]=new int[nums.length];
        int max=nums[0];
        for(int i=0;i<nums.length;i++){
            max=Math.max(max,nums[i]);

            prefixgcd[i]=gcd(nums[i],max);
        }
        Arrays.sort(prefixgcd);

        int left=0;
        int right=nums.length-1;
        long ans=0;
        while(left<right){
            ans+=gcd(prefixgcd[left],prefixgcd[right]);
            left++;
            right--;
        }
        return ans;
    }
}