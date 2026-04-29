class Solution {
    public String freqAlphabets(String s) {
        String alpha="abcdefghijklmnopqrstuvwxyz";
        StringBuilder sb=new StringBuilder();
        for(int right=s.length()-1;right>=0;right--){
            int n=s.charAt(right)-'0';
            if(s.charAt(right)=='#'){
                String str=s.substring(right-2,right);
                n=Integer.parseInt(str);
                right-=2;
            }
            sb.insert(0,alpha.charAt(n-1));
        }
        return sb.toString();
    }
}