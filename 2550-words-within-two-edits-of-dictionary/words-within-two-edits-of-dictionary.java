class Solution {
    public List<String> twoEditWords(String[] queries, String[] dictionary) {
        List<String> res=new ArrayList<>();
        for(String s:queries){
            char[] dummy=s.toCharArray();
            for(int i=0;i<dictionary.length;i++){
                char[] arr=dictionary[i].toCharArray();
                int count=find(dummy,arr);
                if(count<=2){
                    res.add(s);
                    break;
                }
            }

        }
        return res;
    }
    public int find(char[] dummy,char[] arr){
        int left=0;
        int cnt=0;
        while(left<dummy.length){
            if(dummy[left]!=arr[left]){
                cnt++;
            }
            left++;
        }
        return cnt;
    }
}