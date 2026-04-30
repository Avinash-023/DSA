class Solution {
    public String countAndSay(int n) {
        String s="1";
        if(n==1) return s;
        n-=1;
        while(n>0){
            StringBuilder sb=new StringBuilder();
            int left=0;
            int right=0;
            while(right<s.length()){
                while(right<s.length() && s.charAt(right)==s.charAt(left)){
                    right++;
                }
                int len=right-left;
                sb.append(String.valueOf(len));
                sb.append(s.charAt(left));
                left=right;
                // System.out.println(sb.toString());
                // right++;
            }
            // System.out.println(sb.toString());
            s=sb.toString();
            n--;
        }
    return s;
    }
}