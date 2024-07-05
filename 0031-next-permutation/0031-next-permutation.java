class Solution {
    public void nextPermutation(int[] nums) {
        int index = -1;
        for (int i = nums.length-2; i >=0 ; i--) {
            if(nums[i]<nums[i+1]){
                index = i;
                break;
            }
        }
        
        if(index == -1){
            Arrays.sort(nums);
            return;
        }

        for (int i = nums.length-1; i > index ; i--) {
            if(nums[i]>nums[index]){
                swap(nums, i, index);
                break;
            }
        }

        Arrays.sort(nums, index+1, nums.length);
    }

    private static void swap(int[] nums, int i, int index) {
        int temp = nums[i];
        nums[i] = nums[index];
        nums[index] = temp;
    }
}