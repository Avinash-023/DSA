class Solution {
    public int longestPalindrome(String s) {
        HashMap<Character,Integer> map=new HashMap<>();
        for(char ch:s.toCharArray()){
            map.put(ch,map.getOrDefault(ch,0)+1);
        }
        int len=0;
        boolean flag=false;
        for(int val:map.values()){
            if(val%2==0){
                len+=val;
            }
            else{
                len+=val-1;
                flag=true;
            }
        }
        return flag ?len+1:len;
    }
}