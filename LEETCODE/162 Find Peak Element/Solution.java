class Solution {
    public int findPeakElement(int[] nums) {
        int len = nums.length;

         if (len == 1){
            return 0;
        }
        if (len == 2){
            if (nums[0] > nums[1]){
                return 0;
            }
            else{
                return 1;
            }
        }
        if (len == 3){
            int max = 0;
            if (nums[1]>nums[0]){
                max = 1;
            }
            if (nums[2]>nums[max]){
                max = 2;
            }
            return max;
        }

        int start = 0, end = start+2, mid = start + (end-start)/2, peak = 0;
        while (end < len){
            if (nums[mid] > nums[start]){
                if (nums[mid] > nums[end]){
                    peak = mid;
                }
                else{
                    peak = end;
                }
            }
            start++;
            end++;
            mid = start + (end-start)/2;
        }
        return peak;
    }
}