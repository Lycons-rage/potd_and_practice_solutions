class Solution {
    public int numberOfSubarrays(int[] nums, int k) {
        return getCount(nums, k)-getCount(nums, k-1);
    }
    static int getCount(int[] nums, int k) {
        if(k<0){
            return 0;
        }
        int l=0, r=0, sum=0, count=0;
        while(r<nums.length){
            sum = sum + (nums[r]%2);
            while(sum>k){
                sum = sum - (nums[l]%2);
                l++;
            }
            count = count + (r-l+1);
            r++;
        }
        return count;
    }
}