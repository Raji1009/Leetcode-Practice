class Solution {
    public String reverseVowels(String s) {

        char[] str = s.toCharArray();

        int left = 0;
        int right = s.length() - 1;

        while (left < right) {

            while (left < right && !isVowel(str[left])) {
                left++;
            }

            while (left < right && !isVowel(str[right])) {
                right--;
            }

            swap(str, left, right);
            left++;
            right--;
        }

        return new String(str);
    }

    public boolean isVowel(char ch) {
        ch = Character.toLowerCase(ch);

        return ch == 'a' || ch == 'e' || ch == 'i'
                || ch == 'o' || ch == 'u';
    }

    public void swap(char[] str, int left, int right) {
        char temp = str[left];
        str[left] = str[right];
        str[right] = temp;
    }
}