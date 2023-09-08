class Solution {
    public int singleNumber(int[] nums) {
        int len = nums.length, key = 0;
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i<len; i++){
            if(map.containsKey(nums[i])){
                map.put(nums[i], map.get(nums[i])+1);
            }
            else{
                map.put(nums[i], 1);
            }
        }
        for(Map.Entry<Integer, Integer> search : map.entrySet()){
            if(search.getValue() == 1) {
                key = search.getKey();
            }
        }

        return key;
    }
}