class Solution {
    public int getWinner(int[] arr, int k) {
        int left = 0, right = 1;
        int len = arr.length;
        int count = 0, winner = -1, reserve = arr[0];

        if (len == 1) return arr[0];

        if (k > len){
            int max = arr[0];
            for (int i = 1; i < len; i++) {
                if (arr[i] > max){
                    max = arr[i];
                }
            }
            return max;
        } else {
            while (right < arr.length) {
                if (arr[left] > arr[right]) {
                    winner = arr[left];
                } else if (arr[left] < arr[right]) {
                    winner = arr[right];
                    left = right;
                }

                if (winner != reserve) {
                    reserve = winner;
                    count = 0;
                }
                
                count++;
                if (count == k) {
                    break;
                }

                right++;
            }
        }
        return winner;
    }
}