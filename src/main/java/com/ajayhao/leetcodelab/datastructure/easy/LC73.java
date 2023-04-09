package com.ajayhao.leetcodelab.datastructure.easy;

import java.util.HashSet;
import java.util.Set;

/**
 73. 矩阵置零
 给定一个 m x n 的矩阵，如果一个元素为 0 ，则将其所在行和列的所有元素都设为 0 。请使用 原地 算法。



 示例 1：


 输入：matrix = [[1,1,1],[1,0,1],[1,1,1]]
 输出：[[1,0,1],[0,0,0],[1,0,1]]
 示例 2：


 输入：matrix = [[0,1,2,0],[3,4,5,2],[1,3,1,5]]
 输出：[[0,0,0,0],[0,4,5,0],[0,3,1,0]]


 提示：

 m == matrix.length
 n == matrix[0].length
 1 <= m, n <= 200
 -231 <= matrix[i][j] <= 231 - 1


 进阶：

 一个直观的解决方案是使用  O(mn) 的额外空间，但这并不是一个好的解决方案。
 一个简单的改进方案是使用 O(m + n) 的额外空间，但这仍然不是最好的解决方案。
 你能想出一个仅使用常量空间的解决方案吗
 */
public class LC73 {
    public void setZeroes(int[][] matrix) {
        Set<Integer> colZero = new HashSet<>();
        Set<Integer> rowZero = new HashSet<>();
        //第一次遍历，记录0值的行列所在位置
        for (int i = 0; i < matrix.length; i++) {
            for(int j = 0; j < matrix[0].length; j++) {
                if (matrix[i][j] == 0) {
                    rowZero.add(i);
                    colZero.add(j);
                }
            }
        }
        //第二次遍历，刷新0值
        for (int i = 0; i < matrix.length; i++) {
            for(int j = 0; j < matrix[0].length; j++) {
                if (rowZero.contains(i) || colZero.contains(j)) {
                    matrix[i][j] = 0;
                }
            }
        }
    }
}
