class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        if(nums1.length == 1 && nums2.length == 1 && nums1[0] == nums2[0]){
            return new int[]{nums1[0]};
        }
        int p1 = 0;
        Arrays.sort(nums1);
        Arrays.sort(nums2);

        ArrayList<Integer> list = new ArrayList<>();

        while(p1<nums1.length){
            if(binarySearch(nums2, nums1[p1])){
                if(!list.contains(nums1[p1])) {
                    list.add(nums1[p1]);
                }
            }
            p1++;
        }

        int[] ans = new int[list.size()];

        for (int i = 0; i < ans.length; i++) {
            ans[i] = list.removeFirst();
        }

        return ans;
    }

    private static boolean binarySearch(int[] nums2, int target) {
        int start = 0, end = nums2.length-1, mid = start+((end-start)/2);

        while(start <= end) {
            if(target > nums2[mid]){
                start = mid+1;
                mid = start+((end-start)/2);
            } else if (target < nums2[mid]){
                end = mid-1;
                mid = start+((end-start)/2);
            } else {
                return true;
            }
        }

        return false;
    }
}