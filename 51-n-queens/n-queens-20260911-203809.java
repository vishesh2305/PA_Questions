// 51. N-Queens
// https://leetcode.com/problems/n-queens/
// Difficulty: Hard
// Language:   Java
// Submitted:  2026-09-11 20:38:09
// Runtime:    6 ms (beats 15.46%)
// Memory:     46.5 MB (beats 64.13%)
// Topics:     Array, Backtracking, Algorithm X

class Solution {
    List<List<String>> result = new ArrayList<>();
    public List<List<String>> solveNQueens(int n) {

        char[][] board = new char[n][n];

        for(int i=0; i<n; i++){
            Arrays.fill(board[i], '.');
        }

        helper(n, board, 0);
        return result;
    }

    private void helper(int n, char[][] board, int row){
        if(row==n){
            List<String> list = new ArrayList<>();

            for(int i=0; i<n; i++){
                list.add(new String(board[i]));
            }
            result.add(list);
            return;
        }

        for(int col =0; col < n; col++){
            if(isSafe(row, col, n, board)){
                board[row][col] = 'Q';
                helper(n, board, row+1);
                board[row][col] = '.';
            }
        }

    }

    private boolean isSafe(int row, int col, int n, char[][] board){
        for(int i=0; i<row; i++){
            if(board[i][col] == 'Q'){
                return false;
            }
        }

        int i = row-1;
        int j=col-1;

        while(i >= 0 && j >= 0){
            if(board[i][j] == 'Q'){
                return false;
            }
            i--;
            j--;
        }

        i=row-1;
        j=col+1;

        while(i >=0 && j < n){
            if(board[i][j] == 'Q'){
                return false;
            }
            i--;
            j++;
        }

        return true;

    }
}
