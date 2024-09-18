class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        Arrays.sort(nums);
        recursiveSubsets(nums, 0, ans, new ArrayList<Integer>());
        return ans;
    }

    private static void recursiveSubsets(int[] nums, int idx, List<List<Integer>> ans, ArrayList<Integer> current) {
        ans.add(new ArrayList<>(current));

        for (int i = idx; i < nums.length; i++) {
            if(i != idx && nums[i] == nums[i-1]) continue;

            current.add(nums[i]);
            recursiveSubsets(nums, i+1, ans, current);
            current.removeLast();
        }
    }
}