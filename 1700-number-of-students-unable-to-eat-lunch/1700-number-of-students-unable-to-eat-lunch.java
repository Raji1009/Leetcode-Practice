class Solution {
    public int countStudents(int[] students, int[] sandwiches) {
        int zero = 0, one = 0;

        // Step 1: Count preferences
        for (int s : students) {
            if (s == 0) {
                zero++;
            } else {
                one++;
            }
        }

        // Step 2: Check sandwiches
        for (int sand : sandwiches) {
            if (sand == 0) {
                if (zero == 0) {
                    return zero + one; // remaining students
                }
                zero--;
            } else {
                if (one == 0) {
                    return zero + one; // remaining students
                }
                one--;
            }
        }

        // Step 3: Everyone ate
        return 0;
    }
}