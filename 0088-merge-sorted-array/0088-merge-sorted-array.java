class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        if(n == 0){
            return;
        }
        if(m == 0 && n > 0){
            for (int i = 0; i < n; i++){
                nums1[i] = nums2[i];
            }
        }
        else
        {
            for (int i = 0; i < n; i++) {
                nums1[i+m] = nums2[i];
            }
        }
       
        Arrays.sort(nums1);
    }
}