package com.ajayhao.leetcodelab.datastructure.easy;

import java.util.*;

/**
 387. 字符串中的第一个唯一字符
 给定一个字符串 s ，找到 它的第一个不重复的字符，并返回它的索引 。如果不存在，则返回 -1 。



 示例 1：

 输入: s = "leetcode"
 输出: 0
 示例 2:

 输入: s = "loveleetcode"
 输出: 2
 示例 3:

 输入: s = "aabb"
 输出: -1


 提示:

 1 <= s.length <= 105
 s 只包含小写字母
 通过次数378,125提交次数676,999
 */
public class LC387 {
    public int firstUniqChar(String s) {
        Map<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if(!map.containsKey(c)) {
                map.put(c, 1);
            } else {
                Integer cnt = map.get(c);
                map.put(c, cnt+1);
            }
        }

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if(map.get(c) == 1) {
                return i;
            }
        }
        return -1;
    }
}
