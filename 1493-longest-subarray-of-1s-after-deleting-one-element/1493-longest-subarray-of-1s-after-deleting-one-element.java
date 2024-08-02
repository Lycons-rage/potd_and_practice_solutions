class Solution {
    public int longestSubarray(int[] nums) {
        int max_len = 0;
        int l=0,r=0,count_0=0;

        while(r < nums.length){
            if(nums[r] == 0){
                count_0++;
            }
            if(count_0 > 1){
                if(nums[l] == 0){
                    count_0--;
                }
                l++;
            }
            max_len = Math.max(max_len, (r-l+1));
            r++;
        }
        return max_len==0?0:max_len-1;
    }
}