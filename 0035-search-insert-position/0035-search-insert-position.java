class Solution {
    public int searchInsert(int[] nums, int target) {
        if(target < nums[0]){
            return 0;
        }
        int low = 0, high = nums.length-1, ans = nums.length;

        while(low <= high){
            int mid = low + (high-low)/2;

            if(nums[mid] >= target){
                ans = Math.min(ans,mid);
                high = mid-1;
            } else {
                low = mid + 1;
            }
        }

        return ans;
    }
}