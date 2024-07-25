class Solution {
    public int numberOfSubstrings(String s) {
        int total = 0;
        HashMap<Character, Integer> map = new HashMap<>();

        map.put('a',-1);
        map.put('b',-1);
        map.put('c',-1);

        for (int i = 0; i < s.length(); i++) {
            map.put(s.charAt(i),i);
            if(map.get('a')>-1 && map.get('b')>-1 && map.get('c')>-1){
                total = total + (Math.min(map.get('a'), Math.min(map.get('b'),map.get('c')))+1);
            }
        }
        return total;
    }
}