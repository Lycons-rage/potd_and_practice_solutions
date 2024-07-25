class Solution {
    public int subarraysWithKDistinct(int[] nums, int k) {
        return getCount(nums,k) - getCount(nums,k-1);
    }
    
    private static int getCount(int[] arr, int k) {
        int l=0, r=0, count=0;
        HashMap<Integer, Integer> map = new HashMap<>();

        while(r<arr.length){
            if(!map.containsKey(arr[r])){map.put(arr[r], 1);}
            else {map.put(arr[r], map.get(arr[r])+1);}
            while(map.size()>k){
                map.put(arr[l], map.get(arr[l])-1);
                if(map.get(arr[l])==0){
                    map.remove(arr[l]);
                }
                l++;
            }
            count = count + (r-l+1);
            r++;
        }
        return count;
    }
}