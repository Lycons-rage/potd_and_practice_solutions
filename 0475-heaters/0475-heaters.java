class Solution {
    public int findRadius(int[] houses, int[] heaters) {
        Arrays.sort(houses);
        Arrays.sort(heaters);

        int low = 0, high = Math.max(houses[houses.length-1], heaters[heaters.length-1]), ans = -1;

        while(low <= high){
            int mid = low + (high-low)/2;
            if(canCover(houses, heaters, mid)){
                ans = mid;
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return ans;
    }

    private static boolean canCover(int[] houses, int[] heaters, int radius) {
        int prevIdx = -1;
        for(int i = 0; i < heaters.length; i++) {
            int from = heaters[i]-radius;
            int to   = heaters[i]+radius;
            for(int j = prevIdx +1; j < houses.length; j++){
                if(houses[j]<=to && houses[j]>=from){
                    prevIdx++;
                }
                else break;
            }
            if(prevIdx >= houses.length-1)return true;
        }
        return prevIdx >= houses.length-1;
    }
}