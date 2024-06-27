class Solution {
    public int[] applyOperations(int[] nums) {
        int p1 = 0;
        int p2 = 1;

        // apply operations
        for (int i = 0; i < nums.length-1; i++) {
            if(nums[p1] == nums[p2]){
                nums[p1] *= 2;
                nums[p2] = 0;
            }
            p1 = p2;
            p2++;
        }

        p1 = 0;
        //send non-0 to the front
        for (int i = 0; i < nums.length; i++) {
            if(nums[i] != 0){
                nums[p1++] = nums[i];
            }
        }
        //fill rest with 0
        while (p1<nums.length){
            nums[p1++] = 0;
        }
        return nums;
    }
}