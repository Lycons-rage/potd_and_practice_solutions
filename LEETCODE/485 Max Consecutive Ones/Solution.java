class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        ArrayList<Integer> count = new ArrayList<>();
        int len = nums.length, count_value = 0;
        for (int i = 0; i < len; i++){
            if (nums[i] == 1){
                count_value++;
            }
            else{
                count.add(count_value);
                count_value = 0;
            }
            if (i == len-1 && nums[i] == 1){
                count.add(count_value);
            }
        }
        int max = 0;
        for (int i = 0; i<count.size(); i++){
            if (count.get(i) > max){
                max = count.get(i);
            }
        }
        return max;
    }
}