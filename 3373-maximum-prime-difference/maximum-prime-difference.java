class Solution {
    public int maximumPrimeDifference(int[] nums) {
        int start=-1;
        int end=-1;
        for(int i=0;i<nums.length;i++){
            if(isprime(nums[i])){
                if(start==-1){
                    start=i;
                    end=i;
                }
                else{
                    end=i;
                }
            }
        }
        return end-start;
    }
    public boolean isprime(int n){
        if(n<=1) return false;
        if(n<=3) return true;
        for(int i=2;i<n;i++){
            if(n%i==0){
                return false;
            }
        }
        return true;
    }
}