class Solution {
    public int sumOfPrimesInRange(int n) {
        int rev=findrev(n);
        int start=Math.min(rev,n);
        int end=Math.max(rev,n);
        int ans=0;
        for(int i=start;i<=end;i++){
            if(isprime(i)){
                ans+=i;
            }
        }
        return ans;
    }
    public int findrev(int n){
        int res=0;
        while(n>0){
            int temp=n%10;
            res=res*10+temp;
            n/=10;
        }
        return res;
    }
    public boolean isprime(int n){
        if(n<=1) return false;
        if(n<=3) return true;
        if(n%2==0) return false;
        for(int i=3;i*i<=n;i+=2){
            if(n%i==0) return false;
        }
        return true;
    }
}