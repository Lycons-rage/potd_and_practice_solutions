class Solution {
    public int singleNumber(int[] nums) {
        int XOR = 0;

        for (int num : nums){
            XOR = XOR ^ num;
        }
        return XOR;
    }
}