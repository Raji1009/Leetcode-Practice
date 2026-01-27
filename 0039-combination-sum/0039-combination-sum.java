class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> result = new ArrayList<>();
        backtrack(candidates, target, 0, new ArrayList<>(), result);
        return result;
    }

    private void backtrack(int[] arr, int target, int index,
                           List<Integer> path, List<List<Integer>> result) {

        // base case: exact match
        if (target == 0) {
            result.add(new ArrayList<>(path));
            return;
        }

        // base case: overflow
        if (target < 0) {
            return;
        }

        // try all options from current index
        for (int i = index; i < arr.length; i++) {
            path.add(arr[i]);                    // choose
            backtrack(arr, target - arr[i], i, path, result); // explore
            path.remove(path.size() - 1);        // undo (backtrack)
        }
    }
}
