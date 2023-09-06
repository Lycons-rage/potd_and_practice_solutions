class Solution {
    public boolean check(int[] nums) {
        int no_of_rotations = 0;
        for (int i = 0; i<nums.length; i++){
                if (i+1!= nums.length && nums[i]>nums[i+1]){
                    no_of_rotations = i+1;
                    break;
                }
        }

        int temp = nums[0];
        for (int i = 0; i<no_of_rotations; i++){
            for (int j = 0; j<nums.length; j++){
                if(j==nums.length-1){
                    nums[j] = temp;
                }
                else{
                    nums[j] = nums[j+1];
                }
            }
            temp = nums[0];
        }

        for(int i = 0; i<nums.length; i++){
            if(i+1!=nums.length && nums[i]>nums[i+1]){
                return false;
            }
        }
        return true;
    }
}