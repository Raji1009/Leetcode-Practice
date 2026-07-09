class Solution {

    static final int MOD = 1_000_000_007;

    public int[] sumAndMultiply(String s, int[][] queries) {
        int n = s.length();

        // prefix sum of non-zero digits
        long[] prefixSum = new long[n + 1];

        // prefix count of non-zero digits
        int[] prefixCount = new int[n + 1];

        // prefix concatenated value of non-zero digits
        long[] prefixValue = new long[n + 1];

        // powers of 10 modulo MOD
        long[] pow10 = new long[n + 1];
        pow10[0] = 1;

        for (int i = 1; i <= n; i++) {
            pow10[i] = (pow10[i - 1] * 10) % MOD;
        }

        for (int i = 0; i < n; i++) {
            int d = s.charAt(i) - '0';

            prefixSum[i + 1] = prefixSum[i];
            prefixCount[i + 1] = prefixCount[i];
            prefixValue[i + 1] = prefixValue[i];

            if (d != 0) {
                prefixSum[i + 1] += d;
                prefixCount[i + 1]++;
                prefixValue[i + 1] = (prefixValue[i] * 10 + d) % MOD;
            }
        }

        int[] ans = new int[queries.length];

        for (int i = 0; i < queries.length; i++) {
            int l = queries[i][0];
            int r = queries[i][1];

            long sum = prefixSum[r + 1] - prefixSum[l];

            int totalDigits = prefixCount[r + 1] - prefixCount[l];

            long leftValue = prefixValue[l];
            long rightValue = prefixValue[r + 1];

            long x = (rightValue - (leftValue * pow10[totalDigits]) % MOD + MOD) % MOD;

            ans[i] = (int) ((x * (sum % MOD)) % MOD);
        }

        return ans;
    }
}