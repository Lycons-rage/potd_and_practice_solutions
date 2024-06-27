class Solution {
    public int removeDuplicates(int[] nums) {
        if (nums.length<=1){
            return nums.length;
        }
        if (nums.length == 2){
            return 2;
        }
        int count = 1;
        int p1 = 0;
        int p2 = 1;

        // first check
        if(nums[p1] == nums[p2]){
            count = 2;
        }

        while(p2<nums.length){
            if(nums[p1]!=nums[p2]){
                p1 = p2;
                p2++;
                nums[count++] = nums[p1];
                if(p2<nums.length && nums[p1] == nums[p2]){
                    nums[count++] = nums[p2];
                }
            } else {
                p2++;
            }
        }

        return count;
    }
}