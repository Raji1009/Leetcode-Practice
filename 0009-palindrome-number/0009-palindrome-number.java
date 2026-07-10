class Solution {
    public boolean isPalindrome(int x) {
        String temp = Integer.toString(x);
        int[] numArray = new int[temp.length()];

        for (int i = 0; i < temp.length(); i++) {
            numArray[i] = temp.charAt(i) - '0'; 
        }

        int left=0;
        int right=numArray.length-1;
        while(left<=right){
            if(numArray[left]==numArray[right]){
                left++;
                right--;
            }
            else {
                return false;
            }
        }
        return true;
    }
}