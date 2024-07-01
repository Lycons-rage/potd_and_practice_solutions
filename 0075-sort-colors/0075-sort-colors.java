class Solution {
    public void sortColors(int[] nums) {
        if(nums.length == 1){
            return;
        }
        int left = 0;
        int right = left+1;
        int end = nums.length-1;

        while(left<end){
            if(right > end){
                left++;
                if(left == end){
                    break;
                }
                right = left+1;
            }
            if (nums[left] > nums[right]) {
                //in-place swap left and right
                swap(nums, left, right);
            }
            if (nums[left] > nums[end]) {
                //in-place swap left and end
                swap(nums, left, end);
            }
            right++;
        }
    }

    private static void swap(int[] nums, int first, int second) {
        int temp = nums[first];
        nums[first] = nums[second];
        nums[second] = temp;
    }
}