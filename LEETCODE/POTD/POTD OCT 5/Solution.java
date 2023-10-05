class Solution {
    public List<Integer> majorityElement(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++){
            if (map.containsKey(nums[i])){
                map.put(nums[i], map.get(nums[i]) + 1);
            }
            else{
                map.put(nums[i], 1);
            }
        }

        int threshold = nums.length/3;

        Iterator mapIterator = map.entrySet().iterator();

        List<Integer> result = new ArrayList<>();

        while (mapIterator.hasNext()) {
            HashMap.Entry mapElement = (HashMap.Entry)mapIterator.next();

            if ((int)mapElement.getValue() > threshold){
                result.add((int)mapElement.getKey());
            }
        }

        return result;
    }
}