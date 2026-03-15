class Solution {
    public int gcd(int a,int b){
        while(b>0){
            int temp=a%b;
            a=b;
            b=temp;
        }
        return a;
    }
    public int gcdOfOddEvenSums(int n) {
        int len=n*2;
        int oddsum=0;
        int evensum=0;
        for(int i=1;i<=len;i++){
            if(i%2==0){
                evensum+=i;
            }
            else{
                oddsum+=i;
            }
        }
        return gcd(oddsum,evensum);
    }
}