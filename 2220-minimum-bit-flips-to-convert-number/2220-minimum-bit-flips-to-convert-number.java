class Solution {
    public int minBitFlips(int start, int goal) {
        int ans = start ^ goal;
        
        return count_set_bit(ans);
    }
    
    public int count_set_bit(int ans){
        int count = 0;
        while(ans!=0){
            ans = ans & (ans-1);
            count++;
        }
        
        return count;
    }
}