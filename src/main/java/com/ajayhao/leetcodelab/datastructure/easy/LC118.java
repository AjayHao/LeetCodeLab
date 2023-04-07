package com.ajayhao.leetcodelab.datastructure.easy;

import java.util.ArrayList;
import java.util.List;

/**

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
