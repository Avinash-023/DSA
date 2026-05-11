class Solution {
    public int[] separateDigits(int[] nums) {
        List<Integer> arr=new ArrayList<>();
        for(int i:nums){
            List<Integer> dummy=new ArrayList<>();
            while(i>0){
                int temp=i%10;
                dummy.add(0,temp);
                i/=10;
            }
            for(int k:dummy){
                arr.add(k);
            }
        }
        int index=0;
        int[] res=new int[arr.size()];
        for(int i:arr){
            res[index++]=i;
        }
        return res;
    }
}