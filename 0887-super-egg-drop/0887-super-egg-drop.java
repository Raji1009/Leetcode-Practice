class Solution {
    public int superEggDrop(int k, int n) {
        int moves=0;
        int[] dp=new int[k+1];
        while(dp[k]<n){
            moves++;
            for(int i=k;i>=1;i--){
                dp[i]=dp[i]+dp[i-1]+1;
            }
        }
        return moves;
    }
}