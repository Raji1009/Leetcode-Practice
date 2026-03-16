class Solution {
    public void solveSudoku(char[][] board) {
        sudukoSolver(board,0,0);
    }
    public boolean isSafe(char[][] board,int row,int col,int digit){
        for(int i=0;i<=8;i++){
            if(board[i][col]==(char)(digit+'0')){
                return false;
            }
        }
        for(int j=0;j<=8;j++){
            if(board[row][j]==(char)(digit+'0')){
                return false;
            }
        }
        int nr=(row/3)*3;
        int nc=(col/3)*3;
        for(int i=nr;i<nr+3;i++){
            for(int j=nc;j<nc+3;j++){
                if(board[i][j]==(char)(digit+'0')){
                    return false;
                }
            }
        }
        return true;
    }
    public boolean sudukoSolver(char[][] board,int row,int col){
        //basecase
        if(row==9){
            return true;
        }
        //recursion
        int newrow= row;
        int newcol=col+1;
        if(col+1==9){
            newrow=row+1;
            newcol=0;
        }
        if(board[row][col]!='.'){
            return sudukoSolver(board,newrow,newcol);
        }
        for(int digit=1;digit<=9;digit++){
            if(isSafe(board,row,col,digit)){
                board[row][col]=(char)(digit+'0');
                if(sudukoSolver(board,newrow,newcol)){
                    return true;
                }
                board[row][col]='.';
            }
        }
        return false;
    }
}