class Solution {
    public int[] sortArray(int[] nums) {
        quick(nums, 0, nums.length - 1);
        return nums;
    }

    void quick(int[] a, int l, int r) {
        if (l >= r) return;
        int p = a[r], i = l;
        for (int j = l; j < r; j++){
            if (a[j] <= p) swap(a, i++, j);
        }
        swap(a, i, r);
        quick(a, l, i - 1);
        quick(a, i + 1, r);
    }

    void swap(int[] a, int i, int j) {
        int t = a[i]; a[i] = a[j]; a[j] = t;
    }
}
