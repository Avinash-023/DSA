class Solution {
    public int findvcount(String s){
        int count=0;
        for(char ch:s.toCharArray()){
            if("aeiou".contains(String.valueOf(ch))){
                count++;
            }
        }
        return count;
    }
    public String reverseWords(String s) {
        String[] arr=s.split(" ");
        int vc=findvcount(arr[0]);
        StringBuilder sb=new StringBuilder();
        sb.append(arr[0]);
        sb.append(" ");
        for(int i=1;i<arr.length;i++){
            int res=findvcount(arr[i]);
            if(res==vc){
                // String sb=new StringBuilder();
                for(int j=arr[i].length()-1;j>=0;j--){
                    sb.append(arr[i].charAt(j));

                }
            }
            else{
                sb.append(arr[i]);
            }
            if(i!=arr.length-1){
                sb.append(" ");
            }
        }
        return sb.toString().trim();
    }
}