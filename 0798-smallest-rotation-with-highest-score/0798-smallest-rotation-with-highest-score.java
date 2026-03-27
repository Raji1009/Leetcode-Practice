class Solution {
    public int bestRotation(int[] nums) {
        int n = nums.length;
        int[] change = new int[n];

        for (int i = 0; i < n; i++) {
            int badStart = (i - nums[i] + 1 + n) % n;
            int badEnd = (i + 1) % n;

            change[badStart]--;
            change[badEnd]++;

            if (badStart > badEnd) {
                change[0]--;
            }
        }

        int bestK = 0;
        int score = 0;
        int maxScore = Integer.MIN_VALUE;

        for (int k = 0; k < n; k++) {
            score += change[k];
            if (score > maxScore) {
                maxScore = score;
                bestK = k;
            }
        }

        return bestK;
    }
}
