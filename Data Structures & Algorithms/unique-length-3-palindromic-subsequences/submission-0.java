class Solution {
    public int countPalindromicSubsequence(String s) {
        int res = 0;
        for(char ch = 'a'; ch <= 'z'; ch++){
            int l = s.indexOf(ch);
            int r = s.lastIndexOf(ch);
            if(l == -1 || l == r) continue;
            Set<Character> mids = new HashSet<>();
            for(int j = l + 1; j < r; j++){
                mids.add(s.charAt(j));
            }
            res += mids.size();
        }
        return res;
    }
}