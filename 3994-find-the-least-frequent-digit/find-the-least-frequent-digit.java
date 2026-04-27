class Solution {
    public int getLeastFrequentDigit(int n) {
        TreeMap<Integer,Integer> map=new TreeMap<>();
        while(n>0){
            int temp=n%10;
            map.put(temp,map.getOrDefault(temp,0)+1);
            n/=10;
        }
        List<Map.Entry<Integer,Integer>> arr=new ArrayList<>(map.entrySet());
        arr.sort((a,b) -> a.getValue()-b.getValue());
       
        return arr.get(0).getKey();
    }
}