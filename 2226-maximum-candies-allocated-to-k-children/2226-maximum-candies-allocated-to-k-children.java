class Solution {
    public int maximumCandies(int[] candies, long k) {
        long low =1;
        long high = 0, ans = 1, sum=0;
        //initialising range for binary search
        for (int candy : candies) {
            high = (high > candy) ? high : candy;
            sum+=candy;
        }

        //impossible case
        if(sum < k) return 0;

        //binary search
        while(low <= high){
            long mid = low + (high-low)/2;
            if(canAllocate(candies, k, mid)){
                ans = mid;
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return (int)ans;
    }

    private static boolean canAllocate(int[] candies, long k, long number_of_candies) {
        long count = 0;

        for (int candy : candies){
            if(number_of_candies <= candy){
                count += (int) (candy/number_of_candies);
            }
        }

        return count>=k;
    }
}