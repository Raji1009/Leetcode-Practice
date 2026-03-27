class Solution {
    public List<List<String>> partition(String s) {
        List<List<String>> result = new ArrayList<>();
        List<String> path = new ArrayList<>();

        backtrack(0, s, path, result);
        return result;
    }

    public void backtrack(int start, String s, List<String> path, List<List<String>> result) {
        // Base case: whole string is used
        if (start == s.length()) {
            result.add(new ArrayList<>(path));
            return;
        }

        // Try all substrings starting from 'start'
        for (int end = start; end < s.length(); end++) {
            if (isPalindrome(s, start, end)) {
                path.add(s.substring(start, end + 1));   // choose
                backtrack(end + 1, s, path, result);     // explore
                path.remove(path.size() - 1);            // undo
            }
        }
    }

    public boolean isPalindrome(String s, int left, int right) {
        while (left < right) {
            if (s.charAt(left) != s.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}