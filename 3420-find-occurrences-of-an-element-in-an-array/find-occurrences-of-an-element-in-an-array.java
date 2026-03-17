class Solution {
    public int[] occurrencesOfElement(int[] nums, int[] queries, int x) {
        HashMap<Integer,List<Integer>> map=new HashMap<>();
        int count=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==x){
                map.putIfAbsent(x,new ArrayList<>());
                map.get(x).add(i);
                count++;
            }

        }
        System.out.println(map);
        int[] res=new int[queries.length];
        for(int i=0;i<queries.length;i++){
            if(queries[i]>count){
                res[i]=-1;
            }
            else{
                res[i]=map.get(x).get(queries[i]-1);
            }
        }
        return res;
    }
}