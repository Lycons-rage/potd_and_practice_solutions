class Solution {
    public int shipWithinDays(int[] weights, int days) {
       if(weights.length == 1){
            return weights[0];
        }
        int low = Integer.MIN_VALUE, high = 0, ans=-1;

        for (int i = 0; i < weights.length; i++) {
            if(weights[i] > low){
                low = weights[i];
            }
            high += weights[i];
        }

        while(low<=high) {
            int mid = low + (high-low)/2;

            int day = getDays(weights, mid);
            if(day <= days){
                ans = mid;
                high = mid-1;
            } else{
                low = mid+1;
            }
        }

        return ans;
    }

    private static int getDays(int[] weights, int capacity) {
        int days = 1, load = 0;

        for (int i = 0; i < weights.length; i++) {
            if(load + weights[i] > capacity){
                days += 1;
                load = weights[i];
            } else {
                load += weights[i];
            }
        }

        return days;
    }
}