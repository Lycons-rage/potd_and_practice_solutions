class Solution {
    public int search(int[] nums, int target) {
        int start = 0, end = nums.length-1, mid = start+(end-start)/2;
        if(target > nums[end] || target < nums[start]){
          return -1;
        }
        for (int i = 0; i < nums.length; i++){
          if (nums[mid] == target){
            return mid;
          }
          else if (nums[mid] > target){
            end = mid - 1;
            mid = start+(end-start)/2;
          }
          else{
            start = mid + 1;
            mid = start+(end-start)/2;
          }
        }
        return -1;
    }
}