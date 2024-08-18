class Solution {
    public int minDays(int[] bloomDay, int m, int k) {
        //edge case
        if((m*k)>bloomDay.length){
            return -1;
        }

        int low = Integer.MAX_VALUE, high = Integer.MIN_VALUE, ans = -1;
        //assigning low and high
        for (int i = 0; i < bloomDay.length; i++) {
            if(bloomDay[i] > high){
                high = bloomDay[i];
            }
            if(bloomDay[i] < low){
                low = bloomDay[i];
            }
        }

        while(low <= high){
            int mid = low + (high-low)/2;
            if(isPossible(bloomDay, mid, m, k)){
                ans = mid;
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }

        return ans;
    }

    private static boolean isPossible(int[] bloomDay, int day, int m, int k) {
        int count = 0, no_of_bouquets = 0;

        for (int i = 0; i < bloomDay.length; i++) {
            if(bloomDay[i] <= day){
                count++;
            } else {
                no_of_bouquets += (count/k);
                count = 0;
            }
        }
        no_of_bouquets += (count/k);

        if(no_of_bouquets >= m) return true;
        return false;   
    }
}