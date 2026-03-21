class Solution {
    public int valueAfterKSeconds(int n, int k) {
        int mod=1000000007;
        int[] prefix=new int[n];
        Arrays.fill(prefix,1);
        while(k>0){
            for(int i=1;i<prefix.length;i++){
                prefix[i]=(prefix[i-1]+prefix[i])%mod;

            }
            k--;
        }
        return prefix[n-1]%mod;
    }
}