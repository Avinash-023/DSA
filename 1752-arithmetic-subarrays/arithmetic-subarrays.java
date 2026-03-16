class Solution {
    public List<Boolean> checkArithmeticSubarrays(int[] nums, int[] l, int[] r) {
        List<Boolean> res=new ArrayList<>();
        for(int i=0;i<l.length;i++){
            // System.out.println(diff);
            boolean flag=true;
            List<Integer> sorted=new ArrayList<>();
            for(int k=l[i];k<=r[i];k++){
                sorted.add(nums[k]);
            }
            Collections.sort(sorted);
            System.out.println(sorted);
            int diff=sorted.get(1)-sorted.get(0);
            for(int right=1;right<sorted.size();right++){
                System.out.print(nums[right]+" ");
                if(sorted.get(right)-sorted.get(right-1)!=diff){
                    flag=false;
                    break;
                }
            }
            res.add(flag);
        }
        return res;
    }
}