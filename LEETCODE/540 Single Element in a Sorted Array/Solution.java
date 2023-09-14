//BRUTEFORCE APPROACH

class Solution {
    public int singleNonDuplicate(int[] nums) {
        int start = 0, end = nums.length-1, ans = 0;

        if(nums.length == 1){
            return nums[0];
        }

        while (start < end){
            if (nums[start] == nums[start+1]){
                start+=2;
            }
            else{
                ans = nums[start];
            }
            if (nums[end] == nums[end-1]){
                end-=2;
            }
            else{
                ans = nums[end];
            }
            if (start == end){
                ans = nums[start];
            }
        }
        return ans;
    }
}