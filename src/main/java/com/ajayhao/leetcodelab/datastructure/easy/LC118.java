package com.ajayhao.leetcodelab.datastructure.easy;

import java.util.ArrayList;
import java.util.List;

/**
 118. 杨辉三角
 给定一个非负整数 numRows，生成「杨辉三角」的前 numRows 行。

 在「杨辉三角」中，每个数是它左上方和右上方的数的和。

 示例 1:

 输入: numRows = 5
 输出: [[1],[1,1],[1,2,1],[1,3,3,1],[1,4,6,4,1]]
 示例 2:

 输入: numRows = 1
 输出: [[1]]


 提示:

 1 <= numRows <= 30
 */
public class LC118 {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> list = new ArrayList<>();
        for (int i = 1; i <= numRows; i++) {
            List<Integer> l = new ArrayList<>();
            if (i == 1) {
                l.add(i);
            } else {
                for (int j = 0; j < i; j++) {
                    if (j == 0 || j == i - 1) {
                        l.add(1);
                    } else {
                        List<Integer> upperList = list.get(i-2);
                        l.add(upperList.get(j)+upperList.get(j-1));
                    }
                }
            }
            list.add(l);
        }
        return list;
    }
}
