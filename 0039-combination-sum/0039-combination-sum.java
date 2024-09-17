class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> ans = new ArrayList<>();
        recursiveApproach(candidates, target, 0, ans, new ArrayList<>());
        return ans;
    }

    private static void recursiveApproach(int[] candidates, int target, int idx, List<List<Integer>> ans, List<Integer> current) {
        if (target == 0){
            ans.add(new ArrayList<>(current));
            return;
        } else if (idx == candidates.length){
            return;
        }

        if (candidates[idx] <= target){
            current.add(candidates[idx]);
            recursiveApproach(candidates, target-candidates[idx], idx, ans, current);
            current.removeLast();
        }
        recursiveApproach(candidates, target, idx+1, ans, current);
    }
}