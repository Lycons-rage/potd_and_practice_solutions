class Solution {
    public int minSwaps(int[] nums) {
        int min_count_0 = Integer.MAX_VALUE;
        int l=0, r=0, count_1=0, count_0=0;
        for (int i = 0; i < nums.length; i++) {
            if(nums[i] == 1){
                count_1++;
            }
        }
        int[] temp = new int[nums.length*2];
        for (int i = 0; i < temp.length; i++) {
            temp[i] = nums[i % nums.length];
        }
        while(r< temp.length){
            if(temp[r] == 0){
                count_0++;
            }
            if((r-l+1) == count_1){
                min_count_0 = Math.min(min_count_0, count_0);
                if(temp[l] == 0){
                    count_0--;
                }
                l++;
            }
            r++;
        }
        return min_count_0==Integer.MAX_VALUE?0:min_count_0;
    }
}