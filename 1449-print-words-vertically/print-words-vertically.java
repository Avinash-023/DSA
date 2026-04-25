class Solution {
    public List<String> printVertically(String s) {
        List<String> res=new ArrayList<>();
        String[] arr=s.split(" ");
        int n=arr[0].length();
        for(String str:arr){
            n=Math.max(n,str.length());
        }
        for(int i=0;i<n;i++){
            StringBuilder sb=new StringBuilder();
            for(String st:arr){
                if(st.length()<=i){
                    sb.append(" ");
                }
                else{
                    sb.append(st.charAt(i));
                }
            }
            res.add(sb.toString().stripTrailing());
        }
        return res;
    }
}