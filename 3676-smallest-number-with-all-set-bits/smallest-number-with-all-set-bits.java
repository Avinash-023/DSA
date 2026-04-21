class Solution {
    public int smallestNumber(int n) {
        int ans=1;
        int num=1;
        while(Math.pow(2,num)<=n){
            ans=(int)Math.pow(2,num);
            num++;
        }
        ans=(int)Math.pow(2,num);
        return ans-1;
    }
}