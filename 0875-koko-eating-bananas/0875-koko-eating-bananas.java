class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        Arrays.sort(piles);
        int low = 1, high = piles[piles.length-1], ans = Integer.MAX_VALUE;

        while (low <= high){
            int mid = low + (high-low)/2;
            long total_hrs = getTotalHrs(piles, mid);

            if(total_hrs <= h){
                ans = mid;
                high = mid-1;
            } else {
                low = mid+1;
            }
        }

        return ans;
    }

    private static long getTotalHrs(int[] piles, int k) {
        long total = 0;

        for (int i = 0; i < piles.length; i++) {
            total += Math.ceilDiv(piles[i], k);
        }

        return total;
    }
}