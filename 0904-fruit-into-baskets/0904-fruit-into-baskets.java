class Solution {
    public int totalFruit(int[] fruits) {
        int max_fruits = 0;
        int l=0, r=0;
        HashMap<Integer, Integer> map = new HashMap<>();

        while(r<fruits.length){
            if (map.containsKey(fruits[r])) map.put(fruits[r], map.get(fruits[r]) + 1);
            else map.put(fruits[r], 1);

            if (map.size() > 2){
                map.put(fruits[l], map.get(fruits[l])-1);
                if(map.get(fruits[l]) == 0){
                    map.remove(fruits[l]);
                }
                l++;
            } else max_fruits = Math.max(max_fruits, r-l+1);

            r++;
        }
        return max_fruits;
    }
}