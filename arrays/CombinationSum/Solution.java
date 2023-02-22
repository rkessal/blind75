class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> res = new ArrayList<>();
        List<Integer> combination = new ArrayList<>();
        backtrack(res, candidates, target, combination, 0);
        return res;
    }

    private void backtrack(List<List<Integer>> res, int[] candidates, int target, List<Integer> combination, int start) {
        if (target < 0) {
            return;
        } else if (target == 0) {
            res.add(new ArrayList<>(combination));
        } else {
            for (int i = start; i < candidates.length; i++) {
                combination.add(candidates[i]);
                backtrack(res, candidates, target - candidates[i], combination, i);
                combination.remove(combination.size() - 1);
            }
            
        }
    }
}
