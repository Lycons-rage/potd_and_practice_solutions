class Solution {
    public int[] leftRightDifference(int[] nums) {
        if(nums.length==1){
            return new int[]{0};
        }

        int[] ans = new int[nums.length];
        int[] left_sum = new int[nums.length];
        int[] right_sum = new int[nums.length];

        left_sum[0] = 0;
        right_sum[right_sum.length-1] = 0;

        for (int i = 1; i < nums.length; i++) {
            left_sum[i] = left_sum[i-1]+nums[i-1];
            right_sum[(right_sum.length-1)-i] = right_sum[(right_sum.length)-i] + nums[(right_sum.length)-i];
        }

        for (int i = 0; i < ans.length; i++) {
            ans[i] = Math.abs((left_sum[i]-right_sum[i]));
        }

        return ans;
    }
}