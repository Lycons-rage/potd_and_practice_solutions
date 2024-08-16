class Solution {
    public int majorityElement(int[] nums) {
       if(nums.length == 1){
            return nums[0];
        }

        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if(!map.containsKey(nums[i])){
                map.put(nums[i], 1);
            } else {
                map.put(nums[i], map.get(nums[i])+1);
            }
        }

        int max_freq = 0, key = 0;
        for(Map.Entry<Integer, Integer> e : map.entrySet()){
            if (max_freq < e.getValue()){
                key = e.getKey();
                max_freq = e.getValue();
            }
        }

        return key;
    }
}