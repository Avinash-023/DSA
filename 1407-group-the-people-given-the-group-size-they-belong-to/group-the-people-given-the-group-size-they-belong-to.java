class Solution {
    public List<List<Integer>> groupThePeople(int[] groupSizes) {
        HashMap<Integer,List<Integer>> map=new HashMap<>();
        for(int i=0;i<groupSizes.length;i++){
            map.putIfAbsent(groupSizes[i],new ArrayList<>());
            map.get(groupSizes[i]).add(i);
        }
        List<List<Integer>> res=new ArrayList<>();
        for(int key:map.keySet()){
            int n=map.get(key).size()/key;
            int index=0;
            int m=key;
            while(n>0){
            List<Integer> arr=new ArrayList<>();
                while(m>0){
                    arr.add(map.get(key).get(index++));
                    m--;
                }
                res.add(arr);
                m=key;
                n--;
            }
        }
        System.out.println(map);
        return res;
    }
}