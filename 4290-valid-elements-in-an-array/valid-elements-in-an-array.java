class Solution {
    public List<Integer> findValidElements(int[] nums) {
        List<Integer> arr=new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            if(i==0 || i==nums.length-1){
                arr.add(nums[i]);
            }
            else{
                
            boolean stright=check1(i,nums);
            boolean stleft=check2(i,nums);
            System.out.println(stright +""+ nums[i]);
            System.out.println(stleft +""+nums[i]);
            
            if(stright ||stleft){
                arr.add(nums[i]);
            }
            }
        }
        return arr;
    }
    public boolean check1(int index,int[] nums){
        for(int i=0;i<index;i++){
            if(nums[i]>=nums[index]){
                return false;
            }
        }
        return true;
    }
    public boolean check2(int index,int[] nums){
        for(int i=index+1;i<nums.length;i++){
            if(nums[i]>=nums[index]){
                return false;
            }
        }
        return true;
    }
}