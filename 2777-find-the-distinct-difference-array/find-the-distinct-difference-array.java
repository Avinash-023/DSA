class Solution {
    public int[] distinctDifferenceArray(int[] nums) {
        int n=nums.length;
        int[] res=new int[n];
        for(int i=0;i<n;i++){
            int x=findpredist(nums,i);
            int y=findsuffdist(nums,i);
            res[i]=x-y;
        }
        return res;
    }
    public int findpredist(int[] nums,int end){
        HashSet<Integer> seen=new HashSet<>();
        for(int i=0;i<=end;i++){
            seen.add(nums[i]);
        }
        return seen.size();
    }
    public int findsuffdist(int[] nums,int start){
        HashSet<Integer> seen=new HashSet<>();
        for(int i=start+1;i<nums.length;i++){
            seen.add(nums[i]);
        }
        return seen.size();
    }
    
}