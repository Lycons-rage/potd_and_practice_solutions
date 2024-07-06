class Solution {
    public int returnToBoundaryCount(int[] nums) {
        int count = 0;
        int pos = 0;

        for (int i = 0; i < nums.length; i++) {
            pos = pos + nums[i];
            if(pos == 0){
                count++;
            }
        }
        return count;
    }
}