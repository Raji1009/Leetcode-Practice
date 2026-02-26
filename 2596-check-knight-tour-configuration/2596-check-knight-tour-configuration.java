class Solution {
    public boolean checkValidGrid(int[][] grid) {
        int n=grid.length;
        if(n<=4 || grid[0][0]!=0){
            return false;
        }
        return recursive(grid,0,0,0,n);
    }
    public boolean recursive(int[][] grid,int row,int col,int num,int n){
        if(num==(n*n)-1){
            return true;
        }
        int[] r={-2,-2,2,2,1,-1,-1,1};
        int[] c={-1,1,-1,1,-2,-2,2,2};
        for(int i=0;i<8;i++){
            int nr=row+r[i];
            int nc=col+c[i];
            if(nr>=0&& nr<n && nc>=0&&nc<n){
                if(grid[nr][nc]==num+1){
                    return recursive(grid,nr,nc,num+1,n);
                }
            }
        }
        return false;
    }
}