class Solution {
    public int[] searchRange(int[] nums, int target) {
        int[] ans = new int[2];
        int len = nums.length, start = 0, end = len-1, mid = start+(end-start)/2, index=0;

        if (len == 0){
            ans[0] = ans[1] = -1;
            return ans;
        }
        if (len == 1 && nums[0] != target){
            ans[0] = ans[1] = -1;
        }
        if (nums[start] == nums[end] && nums[start] == target){
            ans[1] = end;
            return ans;
        }

        while (start <= end) {
            if (nums[mid] == target){
                index = mid;
                break;
            }
            else if (nums[mid] > target){
                end = mid-1;
                mid = start+(end-start)/2;
            }
            else{
                start = mid+1;
                mid = start+(end-start)/2;
            }
        }

        //working on the range now
        if (start > end){
            ans[0] = ans[1] = -1;
            return ans;
        }
        else{
            //if generated index is the starting point of the values
            if (index-1 >0 && nums[index-1] != target){
                ans[0] = index;
                while (nums[index] == target){
                    index++;
                    if(index == len){
                        break;
                    }
                }
                ans[1] = index-1;
            }
            else{
                    while (nums[index] == target){
                        index--;
                        if (index < 0){
                            break;
                        }
                    }
                    index = index+1;
                    ans[0] = index;
                    while(nums[index] == target){
                        index++;
                        if(index == len){
                            break;
                        }
                    }
                    ans[1] = index-1;
                }
            }
        return ans;
    }
}