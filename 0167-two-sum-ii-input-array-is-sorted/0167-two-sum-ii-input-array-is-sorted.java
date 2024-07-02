class Solution {
    public int[] twoSum(int[] numbers, int target) {
        if(numbers.length == 2 && numbers[0]+numbers[1] == target){
            return new int[]{1,2};
        }

        int p1 = 0;
        int p2 = numbers.length-1;
        int[] ans = new int[2];
        while(p1!=p2){
            if(numbers[p1]+numbers[p2] > target){
                p2--;
            } else if(numbers[p1]+numbers[p2] < target){
                p1++;
            } else{
                ans[0] = p1+1;
                ans[1] = p2+1;
                break;
            }
        }

        return ans;
    }
}