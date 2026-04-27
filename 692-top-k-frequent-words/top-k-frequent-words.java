class Solution {
    public List<String> topKFrequent(String[] words, int k) {
        TreeMap<String,Integer> map=new TreeMap<>();
        List<String> res=new ArrayList<>();
        for(String s:words){
            map.put(s,map.getOrDefault(s,0)+1);
        }
        List<Map.Entry<String,Integer>> list=new ArrayList<>(map.entrySet());
        list.sort((a,b) -> b.getValue()-a.getValue());
        for(int i=0;i<k;i++){
            res.add(list.get(i).getKey());
        }
        // System.out.println(list);
        return res;
    }
}