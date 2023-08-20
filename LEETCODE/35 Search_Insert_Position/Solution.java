class Solution {
    public int searchInsert(int[] nums, int target) {
        int start = 0, end = nums.length-1, mid = start + (end-start)/2;

        //edge case of the array (end)
        if(target > nums[end]){
            return end+1;
        }

        //edge case of the array (start)
        if(target <nums[start]){
            return 0;
        }

        //binary search begins
        while(start <= end){
            if(target > nums[mid]){
                start = mid + 1;
                if(nums[start] > target){
                    return start;
                }
                mid = start + (end-start)/2;
            }
            else if (target < nums[mid]){
                end = mid - 1;
                if(nums[end] < target){
                    return end + 1;
                }
                mid = start + (end-start)/2;
            }
            else{
                return mid;
            }
        }
        return 0;
    }
}