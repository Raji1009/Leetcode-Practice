class Solution {
    public int superEggDrop(int k, int n) {
        int moves=0;
        int[][] dp=new int[n+1][k+1];
        while(dp[moves][k]<n){
            moves++;
            for(int i=1;i<=k;i++){
                dp[moves][i]=dp[moves-1][i]+dp[moves-1][i-1]+1;
            }
        }
        return moves;
    }
}