package com.ajayhao.leetcodelab.datastructure.easy;

import java.util.ArrayList;
import java.util.List;

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

 1 <= ransomNote.length, magazine.length <= 105
 ransomNote 和 magazine 由小写英文字母组成
 */
public class LC383 {
    public boolean canConstruct(String ransomNote, String magazine) {
        List<Character> list = new ArrayList<>();
        for (char c: ransomNote.toCharArray()) {
            list.add(Character.valueOf(c));
        }

        for (char c2: magazine.toCharArray()) {
            if (list.contains(Character.valueOf(c2))) {
                list.remove(Character.valueOf(c2));
            }
            if (list.isEmpty()) {
                return true;
            }
        }
        return false;
    }
}
