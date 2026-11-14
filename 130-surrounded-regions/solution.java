// 130. Surrounded Regions
// https://leetcode.com/problems/surrounded-regions/
// Difficulty: Medium
// Language:   Java
// Submitted:  2026-11-14 20:53:06
// Runtime:    1 ms (beats 99.76%)
// Memory:     47.4 MB (beats 64.91%)
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


        for(int i=0; i<n; i++){
            if(board[0][i] == 'O'){
                helper(board, 0, i);
            }

            if(board[m-1][i] == 'O'){
                helper(board, m-1, i);
            }
        }


        for(int i=0; i<m ; i++){
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
        if(curRow < 0 || curCol < 0 || curRow >= board.length || curCol >= board[0].length || board[curRow][curCol] != 'O'){
            return;
        }

        board[curRow][curCol] = 'E';

        helper(board, curRow+1, curCol);
        helper(board, curRow-1, curCol);
        helper(board, curRow, curCol+1);
        helper(board, curRow, curCol-1);
    }
}
