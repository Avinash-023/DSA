class Solution {
    public long[] sumOfThree(long num) {
        long[] res=new long[3];
        long mid=num/3;
        res[1]=mid;
        res[0]=mid-1;
        res[2]=mid+1;
        long sum=0;
        for(int i=0;i<res.length;i++){
            sum+=res[i];
        }
        return sum==num ? res : new long[0];
    }
}