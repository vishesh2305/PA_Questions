// 130. Surrounded Regions
// https://leetcode.com/problems/surrounded-regions/
// Difficulty: Medium
// Language:   Java
// Submitted:  2026-11-14 20:37:36
// Runtime:    1 ms (beats 99.76%)
// Memory:     47.1 MB (beats 88.20%)
// Topics:     Array, Depth-First Search, Breadth-First Search, Union-Find, Matrix

class Solution {
    public void solve(char[][] board) {
        int m = board.length;
        int n = board[0].length;


        for(int i=0; i<m; i++){
            if(board[i][0] == 'O'){
                helper(board, i, 0);
            }

            if(board[i][n-1] == 'O'){
                helper(board, i, n-1);
            }
        }

        for(int j=0; j<n; j++){
            if(board[0][j] == 'O'){
                helper(board, 0, j);
            }

            if(board[m-1][j] == 'O'){
                helper(board, m-1, j);
            }
        }

        for(int i=0; i<m; i++){
            for(int j=0; j<n; j++){
                
                if(board[i][j] == 'O'){
                    board[i][j] = 'X';
                }else if(board[i][j] == 'E'){
                    board[i][j] = 'O';
                }
                
            }
        }
    }

    static private void helper(char[][] board, int curRow, int curCol){
        if(curRow < 0 || curCol < 0 || curRow > board.length-1 || curCol > board[0].length - 1 || board[curRow][curCol] != 'O'){
            return;
        }
        if(board[curRow][curCol] == 'X') return;

        board[curRow][curCol] = 'E';

        helper(board, curRow+1, curCol);
        helper(board, curRow-1, curCol);
        helper(board, curRow, curCol+1);
        helper(board, curRow, curCol-1);
    }
}
