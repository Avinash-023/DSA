class Solution {
    public int compress(char[] chars) {
        if(chars.length==1)return 1;
        StringBuilder sb=new StringBuilder();
        int left=0;
        int right=0;
        while(right<chars.length){
            while(right<chars.length && chars[right]==chars[left]){
                right++;
            }
            int len=right-left;
            sb.append(chars[left]);
            if(len!=1){

            sb.append(String.valueOf(len));
            }
            left=right;
        }
        String s=sb.toString();
        for(int i=0;i<s.length();i++){
            chars[i]=sb.charAt(i);
        }
        // System.out.println(chars);
        return sb.length();
    }
}