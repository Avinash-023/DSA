class Solution {
    public int mirrorDistance(int n) {
        int val=n;
        while(n%10==0){
            n/=10;
        }
        int rev=0;
        while(n>0){
            int temp=n%10;
            rev=rev*10+temp;
            n/=10;
        }
        return Math.abs(val-rev);
    }
}