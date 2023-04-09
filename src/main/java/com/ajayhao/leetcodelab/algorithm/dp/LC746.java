package com.ajayhao.leetcodelab.algorithm.dp;

/**
 746. 使用最小花费爬楼梯
 给你一个整数数组 cost ，其中 cost[i] 是从楼梯第 i 个台阶向上爬需要支付的费用。一旦你支付此费用，即可选择向上爬一个或者两个台阶。

 你可以选择从下标为 0 或下标为 1 的台阶开始爬楼梯。

 请你计算并返回达到楼梯顶部的最低花费。



 示例 1：

 输入：cost = [10,15,20]
 输出：15
 解释：你将从下标为 1 的台阶开始。
 - 支付 15 ，向上爬两个台阶，到达楼梯顶部。
 总花费为 15 。
 示例 2：

 输入：cost = [1,100,1,1,1,100,1,1,100,1]
 输出：6
 解释：你将从下标为 0 的台阶开始。
 - 支付 1 ，向上爬两个台阶，到达下标为 2 的台阶。
 - 支付 1 ，向上爬两个台阶，到达下标为 4 的台阶。
 - 支付 1 ，向上爬两个台阶，到达下标为 6 的台阶。
 - 支付 1 ，向上爬一个台阶，到达下标为 7 的台阶。
 - 支付 1 ，向上爬两个台阶，到达下标为 9 的台阶。
 - 支付 1 ，向上爬一个台阶，到达楼梯顶部。
 总花费为 6 。


 提示：

 2 <= cost.length <= 1000
 0 <= cost[i] <= 999
 */
public class LC746 {
    public int minCostClimbingStairs(int[] cost) {
        //1. 定义dp数组下标及含义: dp[i]为到达第i个台阶所花费的最少体力
        //2. 确定dp公式 dp[i] = min(dp[i-1],dp[i-2])+cost[i]
        //3. dp数组初始化，仅需dp[0],dp[1]即可
        //4. 确定遍历顺序
        //5. 思考返回结果与dp数组的关系, 本题返回dp[n]与dp[n-1]中的较小值
        if (cost.length == 2) {
            return Math.min(cost[0], cost[1]);
        } else {
            int[] dp = new int[cost.length];
            dp[0] = cost[0];
            dp[1] = cost[1];
            for (int i = 2; i < cost.length; i++) {
                dp[i] = Math.min(dp[i-2], dp[i-1]) + cost[i];
            }
            return Math.min(dp[cost.length-2],dp[cost.length-1]);
        }
    }
}
