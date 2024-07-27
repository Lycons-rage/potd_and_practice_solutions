class Solution {
    public int maximumLengthSubstring(String s) {
        int max_len=0, l=0, r=0;
        HashMap<Character, Integer> map = new HashMap<>();

        while(r < s.length()){
            if(!map.containsKey(s.charAt(r))){
                map.put(s.charAt(r), 1);
                max_len = Math.max(max_len, (r-l+1));
            } else {
                map.put(s.charAt(r), map.get(s.charAt(r))+1);
                while (Collections.max(map.values())>2){
                    map.put(s.charAt(l), map.get(s.charAt(l))-1);
                    if(map.get(s.charAt(l)) == 0){
                        map.remove(s.charAt(l));
                    }
                    l++;
                }
                max_len = Math.max(max_len, (r-l+1));
            }
            r++;
        }
        return max_len;
    }
}