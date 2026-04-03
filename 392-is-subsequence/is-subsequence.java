class Solution {
    public boolean isSubsequence(String s, String t) {
        if(s.equals("")) return true;
        int left=0;
        int right=0;
        while(right<t.length()){
            if(s.charAt(left)==t.charAt(right)){
                left++;
            }
            if(left>s.length()-1){
                break;
            }
            right++;
        }
        return left==s.length();
    }
}