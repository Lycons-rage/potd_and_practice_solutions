class Solution {
    public int longestOnes(int[] nums, int k) {
        int max_len = 0;
        int l = 0, r = 0, no_of_zeros = 0;

        while(r < nums.length){
            if(nums[r] == 0){
                no_of_zeros++;
            }
            if(no_of_zeros>k){
                if(nums[l] == 0){
                    no_of_zeros--;
                }
                l++;
            }
            max_len = Math.max(max_len, r-l+1);
            r++;
        }
        return max_len;
    }
}