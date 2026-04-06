class Solution {
    public int furthestDistanceFromOrigin(String moves) {
        int lcount=0;
        int rcount=0;
        for(char ch:moves.toCharArray()){
            if(ch=='L'){
                lcount++;
            }
            else if(ch=='R'){
                rcount++;
            }
        }
        char find='L';
        if(lcount<rcount){
            find='R';
        }
        int res=0;
        for(char ch:moves.toCharArray()){
            if(ch=='L'){
                res++;
            }
            else if(ch=='R'){
                res--;
            }
            else{
                if(find=='L'){
                    res++;
                }
                else{
                    res--;
                }
            }
        }
        return Math.abs(res);
    }
}