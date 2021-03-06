//给你一根长度为 n 的绳子，请把绳子剪成整数长度的 m 段（m、n都是整数，n>1并且m>1），每段绳子的长度记为 k[0],k[1]...k[m-1] 。
//请问 k[0]*k[1]*...*k[m-1] 可能的最大乘积是多少？例如，当绳子的长度是8时，我们把它剪成长度分别为2、3、3的三段，此时得到的最大乘积是18
//。 
//
// 示例 1： 
//
// 输入: 2
//输出: 1
//解释: 2 = 1 + 1, 1 × 1 = 1 
//
// 示例 2: 
//
// 输入: 10
//输出: 36
//解释: 10 = 3 + 3 + 4, 3 × 3 × 4 = 36 
//
// 提示： 
//
// 
// 2 <= n <= 58 
// 
//
// 注意：本题与主站 343 题相同：https://leetcode-cn.com/problems/integer-break/ 
// Related Topics 数学 动态规划 👍 374 👎 0

package leetcode.editor.cn;
//Java：剪绳子
public class JianShengZiLcof{
    public static void main(String[] args) {
        Solution solution = new JianShengZiLcof().new Solution();
        // TO TEST
        System.out.println(solution.cuttingRope(8));
    }
    //leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    private int res = 1;
    public int cuttingRope(int n) {
//  1. 动态规划
        int[] dp = new int[n + 1];
        dp[1] = 1;
        dp[2] = 1;
        for (int i = 2; i <= n; i++) {
            for (int j = 1; j < i; j++) {
                dp[i] = Math.max(dp[i], Math.max(dp[i - j] * j, (i - j) * j));
            }
        }
        return dp[n];
    }

//        2. 暴力递归
//    public int cuttingRope(int n) {
//        if (n < 2) {
//            return 0;
//        }
//        if (n == 2) {
//            return 1;
//        }
//        if (n == 3) {
//            return 2;
//        }
//        return dfs(n);
//    }
//
//    public int dfs(int n) {
////        此时不分，长度是最大的（已经是划分后的长度小于 4，满足 m > 1)
//        if (n < 4) {
//            return n;
//        }
//        int max = 0;
//        for (int i = 1; i <= n - 1; i++) {
//            max = Math.max(max, dfs(n-i) * dfs(i));
//        }
//        return max;
//    }

}
//leetcode submit region end(Prohibit modification and deletion)

}