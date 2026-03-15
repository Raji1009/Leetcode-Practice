class Solution {
    public boolean checkInclusion(String s1, String s2) {
        int k=s1.length();
        if(s1.length()>s2.length()){
            return false;
        }
        int freq1[] =new int[26];
        int freq2[] =new int[26];
        for(int i=0;i<s1.length();i++){
            char c=s1.charAt(i);
            freq1[c-'a']++;
        }
        for(int i=0;i<s2.length();i++){
            freq2[s2.charAt(i)-'a']++;
            if(i>=k){
                freq2[s2.charAt(i-k)-'a']--;
            }
            if(Arrays.equals(freq1,freq2)){
                return true;
            }
        }
        return false;
    }
}