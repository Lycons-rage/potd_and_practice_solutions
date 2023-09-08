class Solution {
    public void moveZeroes(int[] nums) {
        int len = nums.length, i ,j;
        if (len == 1){
            return;
        }
        for (i = 0; i < len; i++){
            if (nums[i] == 0){
                for (j = i; j!=len && nums[j]==0; j++){
                    continue;
                }
                if(j==len){
                    break;
                }
                nums[i] = nums[j];
                nums[j] = 0;
                if(j == nums.length-1){
                    break;
                }
            }
        }
    }
}