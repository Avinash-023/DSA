class Solution {
    public int minMirrorPairDistance(int[] nums) {
        HashMap<Integer,Integer> map=new HashMap<>();
        int ans=Integer.MAX_VALUE;
        for(int i=0;i<nums.length;i++){
            int x=nums[i];
            if(map.containsKey(x)){
                int ind=map.get(x);
                ans=Math.min(ans,i-ind);
            }
            int rev=reverse(x);
            map.put(rev,i);
        }
        return ans==Integer.MAX_VALUE?-1:ans;
    }

    public int reverse(int n) {
        int rev = 0;
        while (n>0) {
            int temp = n % 10;
            rev = rev * 10 + temp;
            n /= 10;
        }
        return rev;
    }
}