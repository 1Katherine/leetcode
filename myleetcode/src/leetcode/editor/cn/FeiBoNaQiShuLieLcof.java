//写一个函数，输入 n ，求斐波那契（Fibonacci）数列的第 n 项（即 F(N)）。斐波那契数列的定义如下： 
//
// 
//F(0) = 0,   F(1) = 1
//F(N) = F(N - 1) + F(N - 2), 其中 N > 1. 
//
// 斐波那契数列由 0 和 1 开始，之后的斐波那契数就是由之前的两数相加而得出。 
//
// 答案需要取模 1e9+7（1000000007），如计算初始结果为：1000000008，请返回 1。 
//
// 
//
// 示例 1： 
//
// 
//输入：n = 2
//输出：1
// 
//
// 示例 2： 
//
// 
//输入：n = 5
//输出：5
// 
//
// 
//
// 提示： 
//
// 
// 0 <= n <= 100 
// 
// Related Topics 记忆化搜索 数学 动态规划 👍 305 👎 0

package leetcode.editor.cn;
import java.math.BigInteger;
//Java：斐波那契数列
public class FeiBoNaQiShuLieLcof{
    public static void main(String[] args) {
        Solution solution = new FeiBoNaQiShuLieLcof().new Solution();
        // TO TEST
        System.out.println(solution.fib(45));
    }
    //leetcode submit region begin(Prohibit modification and deletion)
class Solution {
//        递归解法 超出时间限制（多次重复计算中间结果）
//    public int fib(int n) {
//        if (n == 0) {
//            return 0;
//        }
//        if (n == 1) {
//            return 1;
//        }
//        return fib(n-1) + fib(n-2);
//    }

//        循环解法：自下而上计算，记录中间结果，避免重复计算.
//        fib(44)计算正确，fib(45)计算错误，可能存在int整型越界 2^31 - 1
//    public int fib(int n) {
//        int[] nums = new int[]{0,1};
//        if (n <= 1) {
//            return nums[n];
//        }
//        int NminusOne = 1;
//        int NminusTwo = 0;
//        int N = 0;
//        for (int i = 2; i <= n; i++) {
//            N = NminusOne + NminusTwo;
//            NminusTwo = NminusOne;
//            NminusOne = N;
//        }
//        return N;
//    }

    public int fib(int n) {
        if (n < 2) {
            return n;
        }
        int[] middleRes = new int[n + 1];
        middleRes[0] = 0;
        middleRes[1] = 1;
        for (int i = 2; i <= n; i++) {
            middleRes[i] = (middleRes[i - 1] + middleRes[i - 2])  % 1000000007;
        }
        return middleRes[n];
    }

}
//leetcode submit region end(Prohibit modification and deletion)

}