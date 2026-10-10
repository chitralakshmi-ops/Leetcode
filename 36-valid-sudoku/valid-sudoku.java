class Solution {
    public static boolean is_num_valid(char[][] board, int row, int col, char num) {
        for (int i = 0; i < 9; i++) {
            // Skip the current cell itself to avoid matching against itself
            if (i != col && board[row][i] == num) {
                return false;
            }
            if (i != row && board[i][col] == num) {
                return false;
            }
            
            int boxrow = 3 * (row / 3) + (i / 3);
            int boxcol = 3 * (col / 3) + (i % 3);
            
            // Skip the current cell itself in the box check
            if ((boxrow != row || boxcol != col) && board[boxrow][boxcol] == num) {
                return false;
            }
        }
        return true;
    }

    public boolean isValidSudoku(char[][] board) {
        // Traverse every cell on the board
        for (int row = 0; row < 9; row++) {
            for (int col = 0; col < 9; col++) {
                char current = board[row][col];
                
                // Only validate filled cells
                if (current != '.') {
                    // Check if the current number violates Sudoku rules
                    if (!is_num_valid(board, row, col, current)) {
                        return false;
                    }
                }
            }
        }
        return true;
    }
}