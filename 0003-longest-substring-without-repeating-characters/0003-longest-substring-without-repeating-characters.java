class Solution {
    public int lengthOfLongestSubstring(String s) {
        int max_len = 0;
        int l=0, r=0;
        HashMap<Character, Integer> map = new HashMap<>();

        while (r < s.length()) {
            if(map.containsKey(s.charAt(r))){
                if(map.get(s.charAt(r))>=l){
                    l = map.get(s.charAt(r)) + 1;
                }
            }
            max_len = Math.max(r-l+1, max_len);
            map.put(s.charAt(r), r);
            r++;
        }
        return max_len;
    }
}