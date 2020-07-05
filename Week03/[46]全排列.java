//给定一个 没有重复 数字的序列，返回其所有可能的全排列。 
//
// 示例: 
//
// 输入: [1,2,3]
//输出:
//[
//  [1,2,3],
//  [1,3,2],
//  [2,1,3],
//  [2,3,1],
//  [3,1,2],
//  [3,2,1]
//] 
// Related Topics 回溯算法


import jdk.nashorn.internal.ir.CallNode;

import java.util.*;

//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public List<List<Integer>> permute(int[] nums) {
        int len = nums.length;
        ArrayList<List<Integer>> res = new ArrayList<>(fac(len));
        if (len == 0)
            return res;

        HashSet<Integer> state = new HashSet<>(len);
        Deque<Integer> path = new ArrayDeque<>(len);

        dfs(nums, len, 0, path, state, res);
        return res;
    }

    private int fac(int n) {
        int res = 1;
        for (int i = 2; i <= n; i++) {
            res *= i;
        }
        return res;
    }

    private void dfs(int[] nums, int len, int depth,
                     Deque<Integer> path, HashSet<Integer> state,
                     List<List<Integer>> res) {
        if (depth == len) {
            res.add(new ArrayList<>(path));
            return;
        }

        for (int i = 0; i < len; i++) {
            if (!state.contains(i)) {
                state.add(i);
                path.addLast(nums[i]);

                dfs(nums, len, depth + 1, path, state, res);

                path.removeLast();
                state.remove(i);
            }
        }
    }
}
//leetcode submit region end(Prohibit modification and deletion)
