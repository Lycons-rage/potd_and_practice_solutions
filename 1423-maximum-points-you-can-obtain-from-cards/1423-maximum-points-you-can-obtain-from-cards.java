class Solution {
    public int maxScore(int[] cardPoints, int k) {
        int lsum = 0, rsum = 0, max_sum = 0, right_index = cardPoints.length-1;

        for (int i = 0; i < k; i++) {
            lsum = lsum + cardPoints[i];
        } max_sum = lsum;

        for (int i = k-1; i >=0 ; i--) {
            lsum = lsum - cardPoints[i];
            rsum = rsum + cardPoints[right_index];
            right_index--;
            max_sum = Math.max(max_sum, lsum+rsum);
        }

        return max_sum;
    }
}