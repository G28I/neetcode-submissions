class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, List<String>> map = new HashMap<>();
        for(String word : strs){
            int [] freq = new int[26];
            for(int i = 0; i < word.length(); i++){
                char ch = word.charAt(i);
                int index = ch - 'a';
                freq[index]++;
            }
            StringBuilder sb = new StringBuilder();
            for(int count : freq){
                sb.append(count).append("#");
            }
            String key = sb.toString();
        if(!map.containsKey(key)){
            map.put(key, new ArrayList<>());
        }
        map.get(key).add(word);
        }
        return new ArrayList<>(map.values());
    }
}
