class Solution {
    public int bestRotation(int[] nums) {
        int n = nums.length;
        int[] arr = new int[n];
        for(int i = 0; i < n; i++) arr[(i - nums[i] + 1 + n) % n]--;
        int current = 0, max = Integer.MIN_VALUE;
        int index = -1;
        for(int i = 0; i < n; i++) {
            current += arr[i] + 1;
            if(current > max) {
                max = current;
                index = i;
            }
        }
        return index;
    }
}