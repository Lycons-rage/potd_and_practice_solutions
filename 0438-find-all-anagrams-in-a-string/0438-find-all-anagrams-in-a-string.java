class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        ArrayList<Integer> list = new ArrayList<>();
        int l=0, r=0, count=0;

        HashMap<Character, Integer> map = new HashMap<>();

        for (int i = 0; i < p.length(); i++) {
            if(map.containsKey(p.charAt(i))){
                map.put(p.charAt(i), map.get(p.charAt(i))+1);
            } else {
                map.put(p.charAt(i), 1);
            }
        }

        while(r<s.length()){
            if(!map.containsKey(s.charAt(r))){
                count = 0;
                while(l<s.length() && l!=r+1){
                    if(map.containsKey(s.charAt(l))){
                        map.put(s.charAt(l), map.get(s.charAt(l))+1);
                    }
                    l++;
                }
            } else {
                while(map.get(s.charAt(r))<1){
                    map.put(s.charAt(l), map.get(s.charAt(l))+1);
                    count--;
                    l++;
                }
                map.put(s.charAt(r), map.get(s.charAt(r))-1);
                count++;
                if(count==p.length()){
                    list.add(l);
                }
            }
            r++;
        }

        return list;
    }
}