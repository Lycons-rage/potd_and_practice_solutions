class Solution {
    public int removeDuplicates(int[] nums) {
        int p1 = 0;
        int p2 = 1;
        int count = 1;

        while(p2<nums.length){
            if(nums[p1]!=nums[p2]){
                p1 = p2;
                nums[count] = nums[p1];
                count+=1;
            }
            p2+=1;
        }

        return count;
    }
}