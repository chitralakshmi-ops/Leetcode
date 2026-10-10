class Solution {
    public static boolean is_num_valid(char[][] board,int row,int col,char num){
        for(int i=0;i<9;i++){
            //check row
            if(board[row][i]==num){
                return false;
            }
            //check column
            if(board[i][col]==num){
                return false;
            }
            //box check(3x3)
            int boxrow=3*(row/3)+(i/3);
            int boxcol=3*(col/3)+(i%3);
            if(board[boxrow][boxcol]==num){
                return false;
            }
        }
        return true;
    }
    public static boolean solve(char[][] board){
        //find empty cell
        for(int row=0;row<9;row++){
            for(int col=0;col<9;col++){
                //if we find empty cell
                if(board[row][col]=='.'){
                    //check from 1 to 9 which fits there
                    for(char num='1';num<='9';num++){
                        if(is_num_valid(board,row,col,num)){
                            board[row][col]=num;
                            //explore for remaining cells(recursive call)
                            if(solve(board)){
                                return true;//if the board is solved return true at every recursive step
                            }
                            // undo/backtracking
                            board[row][col]='.';//the number we placed is not correct number,check next
                        }
                    }
                    return false;//1 to 9 we cannot fix any number
                }
            }
        }
        return true;
    }

    public void solveSudoku(char[][] board) {
        solve(board);
    }
}