class Solution {
    public int characterReplacement(String s, int k) {
        HashMap<Character, Integer> map = new HashMap<>();
        int l=0, r=0, max_len=0;

        while(r<s.length()){
            if(map.containsKey(s.charAt(r))){
                map.put(s.charAt(r), map.get(s.charAt(r))+1);
            } else {
                map.put(s.charAt(r), 1);
            }
            if( (r-l+1)- Collections.max(map.values()) > k ){
                map.put(s.charAt(l), map.get(s.charAt(l))-1);
                l++;
            } else {
                max_len = Math.max(max_len, (r-l+1));
            }
            r++;
        }

        return max_len;
    }
}