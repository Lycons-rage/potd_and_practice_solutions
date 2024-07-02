class Solution {
    public int triangleNumber(int[] nums) {
        if(nums.length < 3){
            return 0;
        }
        Arrays.sort(nums);
        int first = 0;
        int second = first+1;
        int count = 0;
        while(first!=nums.length-2){
            int sum = nums[first] + nums[second];
            for (int i = second+1; i<nums.length && nums[i] < sum; i++) {
                count++;
            }
            second++;
            if(second == nums.length-1){
                first++;
                second = first+1;
            }
        }
        return count;
    }
}