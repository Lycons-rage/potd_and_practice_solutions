class Solution {
    public List<List<Integer>> combinationSum3(int k, int n) {
        List<List<Integer>> ans = new ArrayList<>();

        recursiveApproachCombination(k, n, 1, ans, new ArrayList<Integer>());
        return ans;
    }

    private static void recursiveApproachCombination(int k, int target, int idx, List<List<Integer>> ans, ArrayList<Integer> current) {
        if(current.size() == k){
            if(target == 0){
                ans.add(new ArrayList<>(current));
            }
            return;
        }

        for (int i = idx; i < 10; i++) {
            if(i > target) break;
            current.add(i);
            recursiveApproachCombination(k, target-i, i+1, ans, current);
            current.removeLast();
        }
    }
}