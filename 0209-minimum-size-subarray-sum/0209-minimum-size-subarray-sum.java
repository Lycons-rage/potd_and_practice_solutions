class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int min_len = Integer.MAX_VALUE;
        int l = 0, r = 0, sum = 0;

        while(r< nums.length){
            sum = sum + nums[r];
            while(sum>=target && l<=r){
                min_len = Math.min(min_len, (r-l+1));
                sum = sum - nums[l];
                l++;
            }
            r++;
        }

        if(min_len == Integer.MAX_VALUE){
            return 0;
        }
        return min_len;
    }
}