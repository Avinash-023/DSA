class Solution {
    public boolean equalFrequency(String word) {
        HashMap<Character,Integer> map=new HashMap<>();
        for(char ch:word.toCharArray()){
            map.put(ch,map.getOrDefault(ch,0)+1);
        }
        for(Map.Entry<Character,Integer> e:map.entrySet()){
            int val=e.getValue()-1;
            char key=e.getKey();
            map.put(key,val);
            // boolean flag=true;
            System.out.println(map);
            HashSet<Integer> set=new HashSet<>();
            for(int v:map.values()){
                if(v!=0){
                    set.add(v);
                }
            }
            if(set.size()==1) return true;

            map.put(key,val+1);
        }
        return false;
    }
}