class Solution {
    public int numSubarraysWithSum(int[] nums, int goal) {
        return getCount(nums, goal) - getCount(nums, goal-1);
    }
    
    static int getCount(int[] arr, int k) {
        if(k<0){
            return 0;
        }
        int l=0,r=0, count=0, sum=0;

        while(r<arr.length){
            sum = sum + arr[r];
            while (sum>k){
                sum = sum - arr[l];
                l++;
            }
            count = count + (r-l+1);
            r++;
        }

        return count;
    }
}