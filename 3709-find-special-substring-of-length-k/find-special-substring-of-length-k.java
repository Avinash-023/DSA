class Solution {
    public boolean hasSpecialSubstring(String s, int k) {
        int left=0;
        int right=0;
        while(right<s.length()){

            while(right<s.length() && s.charAt(left)==s.charAt(right)){
                right++;
            }
            int len=right-left;
            if(len==k) return true;
            left=right;
        }
        return false;
    }
}