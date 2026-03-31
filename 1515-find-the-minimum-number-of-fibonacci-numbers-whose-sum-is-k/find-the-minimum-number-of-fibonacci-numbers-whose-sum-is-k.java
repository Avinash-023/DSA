class Solution {
    public int findMinFibonacciNumbers(int k) {
        int[] nums=new int[45];
        nums[0]=1;
        nums[1]=1;
        int size=2;
        for(int i=2;i<nums.length;i++){
            nums[i]=nums[i-1]+nums[i-2];
            if(nums[i]>k){
                break;
            }
            size++;
        }
        int index=size-1;
        int i=0,count=0;
        while(k>0){
            for(i=index;i>=0;i--){
                if(nums[i]<=k){
                    k-=nums[i];
                    
                    index=i;
                    break;

                } 
            }
            count++;
            
            
        }
        return count;
    }
}