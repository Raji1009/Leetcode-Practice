class Solution {
    public List<List<String>> solveNQueens(int n) {
        List<List<String>> result=new ArrayList<>();
        char[][] Board=new char[n][n];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                Board[i][j]='.';
            }
        }
        NQueens(Board,0,result);
        return result;
    }
    public boolean isSafe(char[][] Board,int row,int col){
        for(int i=row-1;i>=0;i--){
            if(Board[i][col]=='Q'){
                return false;
            }
        }
        for(int i=row-1,j=col-1;i>=0 && j>=0;i--,j--){
            if(Board[i][j]=='Q'){
                return false;
            }
        }
        for(int i=row-1,j=col+1;i>=0 && j<Board.length;i--,j++){
            if(Board[i][j]=='Q'){
                return false;
            }
        }
        return true;
    }
    public void NQueens(char[][] Board,int row,List<List<String>> result){
        if(row==Board.length){
            List<String> temp=new ArrayList<>();
            for(int i=0;i<Board.length;i++){
                temp.add(new String(Board[i]));
            }
            result.add(temp);
            return;
        }
        for(int i=0;i<Board.length;i++){
            if(isSafe(Board,row,i)){
                Board[row][i]='Q';
                NQueens(Board,row+1,result);
                Board[row][i]='.';
            }
        }
    }
}