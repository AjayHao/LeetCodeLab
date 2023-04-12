package com.ajayhao.leetcodelab.datastructure.easy;

import java.util.Arrays;

/**
 383. 赎金信
 给你两个字符串：ransomNote 和 magazine ，判断 ransomNote 能不能由 magazine 里面的字符构成。

 如果可以，返回 true ；否则返回 false 。

 magazine 中的每个字符只能在 ransomNote 中使用一次。



 示例 1：

 输入：ransomNote = "a", magazine = "b"
 输出：false
 示例 2：

 输入：ransomNote = "aa", magazine = "ab"
 输出：false
 示例 3：

 输入：ransomNote = "aa", magazine = "aab"
 输出：true


 提示：

 242. 有效的字母异位词
 给定两个字符串 s 和 t ，编写一个函数来判断 t 是否是 s 的字母异位词。

 注意：若 s 和 t 中每个字符出现的次数都相同，则称 s 和 t 互为字母异位词。

 示例 1:

 输入: s = "anagram", t = "nagaram"
 输出: true
 示例 2:

 输入: s = "rat", t = "car"
 输出: false


 提示:

 1 <= s.length, t.length <= 5 * 104
 s 和 t 仅包含小写字母
 */
public class LC242 {

    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }
        char[] str1 = s.toCharArray();
        char[] str2 = t.toCharArray();
        Arrays.sort(str1);
        Arrays.sort(str2);
        return Arrays.equals(str1, str2);
    }
}
