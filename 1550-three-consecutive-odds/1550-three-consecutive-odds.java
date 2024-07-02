class Solution {
    public boolean threeConsecutiveOdds(int[] arr) {
        if(arr.length < 3){
            return false;
        }
        int flag = 0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]%2 != 0) flag++;
            else flag = 0;

            if (flag == 3) {
                return true;
            }
        }
        return false;
    }
}