class Solution {
    public int minOperations(int[] nums) {
        int op=0;
        for(int i=0;i<nums.length;i++){
            int n=nums[i];
            if(i%2==0){
                while(!isprime(n)){
                    n++;
                    op++;
                }
            }
            else{
                while(isprime(n)){
                    n++;
                    op++;
                }
            }
        }
        return op;
    }
    public boolean isprime(int n){
    if(n <= 1) return false;
    if(n <= 3) return true;
    if(n % 2 == 0) return false;

    for(int i = 3; i * i <= n; i += 2){
        if(n % i == 0){
            return false;
        }
    }
    return true;
}
}