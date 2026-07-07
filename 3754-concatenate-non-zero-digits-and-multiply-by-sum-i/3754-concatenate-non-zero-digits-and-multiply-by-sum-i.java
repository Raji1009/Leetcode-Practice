class Solution {
    public long sumAndMultiply(int n) {
        StringBuilder sb = new StringBuilder();
        int sum = 0;

        while (n > 0) {
            int digit = n % 10;

            if (digit != 0) {
                sb.insert(0, digit);
                sum += digit;
            }

            n /= 10;
        }

        if (sb.length() == 0) {
            return 0;
        }

        long x = Long.parseLong(sb.toString());

        return x * sum;
    }
}