package com.ajayhao.leetcodelab.datastructure.easy;

import java.util.ArrayList;
import java.util.List;

/**

 */
public class LC36 {
    public boolean isValidSudoku(char[][] board) {
        boolean row[][] = new boolean[9][9];
        boolean col[][] = new boolean[9][9];
        boolean box[][] = new boolean[9][9];
        for(int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                int boxIdx = i/3*3 + j/3;
                if (board[i][j] != '.') {
                    int key = board[i][j] - '1';
                    if (!row[i][key] && !col[j][key] && !box[boxIdx][key]) {
                        row[i][key] = true;
                        col[j][key] = true;
                        box[boxIdx][key] = true;
                    } else {
                        return false;
                    }
                }
            }
        }
        return true;
    }
}
