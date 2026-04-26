class Solution {
    public String sortVowels(String s) {

        String vowels = "aeiou";

        // frequency map
        LinkedHashMap<Character, Integer> map = new LinkedHashMap<>();

        for(char ch : s.toCharArray()){
            if(vowels.indexOf(ch) != -1){
                map.put(ch, map.getOrDefault(ch, 0) + 1);
            }
        }

        // sort by frequency desc
        List<Map.Entry<Character,Integer>> list =
                new ArrayList<>(map.entrySet());

        list.sort((a,b) -> b.getValue() - a.getValue());

        // make sorted vowel string
        StringBuilder temp = new StringBuilder();

        for(Map.Entry<Character,Integer> e : list){
            for(int i=0;i<e.getValue();i++){
                temp.append(e.getKey());
            }
        }

        // replace vowels in original string
        StringBuilder ans = new StringBuilder(s);
        int j = 0;

        for(int i=0;i<ans.length();i++){
            if(vowels.indexOf(ans.charAt(i)) != -1){
                ans.setCharAt(i, temp.charAt(j++));
            }
        }

        return ans.toString();
    }
}