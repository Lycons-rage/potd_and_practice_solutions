class Solution {
    public boolean checkSubarraySum(int[] nums, int k) {
        HashMap<Integer,Integer> map = new HashMap<>();
        map.put(0,-1);

        int sum = 0;
        int rem;
        for (int i = 0; i < nums.length; i++) {
            sum = sum+nums[i];
            rem = sum%k;
            if(map.containsKey(rem)) {
                if(i-map.get(rem)>1){
                    return true;
                }
            } else {
                map.put(rem,i);
            }
        }
        return false;
    }
}