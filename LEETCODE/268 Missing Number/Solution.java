class Solution {
    public int missingNumber(int[] nums) {
        Arrays.sort(nums);
        int len = nums.length, i;

        for (i = 0; i<len; i++){
            if(nums[i]!=i){
                break;
            }
        }
        return i;
    }
}