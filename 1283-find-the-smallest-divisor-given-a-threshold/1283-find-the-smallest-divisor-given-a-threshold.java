class Solution {
    public int smallestDivisor(int[] nums, int threshold) {
        int low = 1, high = Integer.MIN_VALUE, ans = -1;

        for (int i = 0; i < nums.length; i++) {
            if(nums[i] > high){
                high = nums[i];
            }
        }

        while(low<=high){
            int mid = low + (high-low)/2;

            if(underThreshold(nums, mid, threshold)){
                ans = mid;
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }

        return ans;
    }

    private static boolean underThreshold(int[] nums, int div, int threshold) {
        int check = 0;
        for (int i = 0; i < nums.length; i++) {
            check += Math.ceilDiv(nums[i], div);
        }
        if(check <= threshold){
            return true;
        }
        return false;
    }
}