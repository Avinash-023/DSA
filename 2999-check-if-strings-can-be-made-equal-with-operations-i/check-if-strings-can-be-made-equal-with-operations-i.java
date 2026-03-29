class Solution {
    public boolean canBeEqual(String s1, String s2) {
        int left=0;
        int right=2;
        StringBuilder sb=new StringBuilder(s1);
        while(right<s2.length()){
            if(sb.charAt(left)!=s2.charAt(left) && sb.charAt(right)!=s2.charAt(right)){
                char temp=sb.charAt(left);
                sb.setCharAt(left,sb.charAt(right));
                sb.setCharAt(right,temp);

            }
            left++;
            right++;
        }
        return s2.equals(sb.toString());
    }
}