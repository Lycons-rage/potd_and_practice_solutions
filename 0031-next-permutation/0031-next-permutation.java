class Solution {
    public void nextPermutation(int[] nums) {
        int index = -1;
        // finding a breakpoint where the current indexed value is less than its next one
        for (int i = nums.length-2; i >=0 ; i--) {
            if(nums[i]<nums[i+1]){
                index = i;
                break;
            }
        }
        // if index remains -1, this means we have the last permutation so we only need to sort it
        if(index == -1){
            Arrays.sort(nums);
            return;
        }
        //else we need to find the least number in the array greater than nums[index] and swap it
        for (int i = nums.length-1; i > index ; i--) {
            if(nums[i]>nums[index]){
                swap(nums, i, index);
                break;
            }
        }
        //sort the rest of the array in ascending order and that's the answer
        Arrays.sort(nums, index+1, nums.length);
    }

    private static void swap(int[] nums, int i, int index) {
        int temp = nums[i];
        nums[i] = nums[index];
        nums[index] = temp;
    }
}