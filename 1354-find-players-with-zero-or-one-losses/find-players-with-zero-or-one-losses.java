class Solution {
    public List<List<Integer>> findWinners(int[][] matches) {
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int[] list:matches){
            map.putIfAbsent(list[0],0);
            map.put(list[1],map.getOrDefault(list[1],0)+1);
        }
        System.out.println(map);
        List<List<Integer>> res=new ArrayList<>();
        List<Integer> win=new ArrayList<>();
        List<Integer> loss=new ArrayList<>();
        for(int key:map.keySet()){
            if(map.get(key)==0){
                win.add(key);
            }
            else if(map.get(key)==1){
                loss.add(key);
            }
        }
        Collections.sort(win);
        Collections.sort(loss);
        res.add(win);
        res.add(loss);
        return res;
    }
}