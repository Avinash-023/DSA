class Solution {
    public boolean judgeCircle(String moves) {
        int n=0;
        int m=0;
        for(char ch:moves.toCharArray()){
            if(ch=='U'){
                n+=1;
            }
            else if(ch=='D'){
                n-=1;
            }
            else if(ch=='L'){
                m-=1;
            }
            else{
                m+=1;
            }
        }
        return m==0 && n==0;
    }
}