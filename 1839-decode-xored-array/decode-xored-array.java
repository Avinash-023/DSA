class Solution {
    public int[] decode(int[] encoded, int first) {
        int[] prefix=new int[encoded.length+1];
        prefix[0]=first;
        for(int i=1;i<prefix.length;i++){
            prefix[i]=prefix[i-1]^encoded[i-1];
        }
        return prefix;
    }
}