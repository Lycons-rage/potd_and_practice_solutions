class Solution {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        Arrays.sort(candidates);
        List<List<Integer>> ans = new ArrayList<>();

        recursiveApproachII(candidates, target, 0, ans, new ArrayList<>());
        return ans;
    }

    private static void recursiveApproachII(int[] candidates, int target, int idx, List<List<Integer>> ans, List<Integer> current){
        if(target == 0){
            ans.add(new ArrayList<>(current));
            return;
        }

        for (int i = idx; i < candidates.length; i++) {
            if(i > idx && candidates[i] == candidates[i-1]) continue;
            if(candidates[i] > target) break;

            current.add(candidates[i]);
            recursiveApproachII(candidates, target-candidates[i], i+1, ans, current);
            current.removeLast();
        }
    }
}